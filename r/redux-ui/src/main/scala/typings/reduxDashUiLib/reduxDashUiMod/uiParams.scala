package typings
package reduxDashUiLib.reduxDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiParams[UIStateShape] extends js.Object {
  // optional key which is used to determine the UI path in which state will
  // be stored. if omitted this is randomly generated.
  var key: js.UndefOr[java.lang.String] = js.undefined
  // optional mergeProps passed to react-redux' @connect
  var mergeProps: js.UndefOr[
    js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, _]
  ] = js.undefined
  // optional `options` passed to react-redux @connect
  var options: js.UndefOr[reduxDashUiLib.Anon_Pure] = js.undefined
  // optional persist, defaults to false. if set to true persist will keep UI
  // state for this component after it unmounts. if set to false the UI state
  // will be deleted and recreated when the component remounts
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  // **required**: UI state for the component
  var state: UIStateShape
}

object uiParams {
  @scala.inline
  def apply[UIStateShape](
    state: UIStateShape,
    key: java.lang.String = null,
    mergeProps: js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, _] = null,
    options: reduxDashUiLib.Anon_Pure = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined
  ): uiParams[UIStateShape] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (mergeProps != null) __obj.updateDynamic("mergeProps")(mergeProps)
    if (options != null) __obj.updateDynamic("options")(options)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    __obj.asInstanceOf[uiParams[UIStateShape]]
  }
}

