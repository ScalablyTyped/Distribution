package typings.reduxUi.mod

import typings.reduxUi.AnonPure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait uiParams[UIStateShape] extends js.Object {
  // optional key which is used to determine the UI path in which state will
  // be stored. if omitted this is randomly generated.
  var key: js.UndefOr[String] = js.undefined
  // optional mergeProps passed to react-redux' @connect
  var mergeProps: js.UndefOr[
    js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, _]
  ] = js.undefined
  // optional `options` passed to react-redux @connect
  var options: js.UndefOr[AnonPure] = js.undefined
  // optional persist, defaults to false. if set to true persist will keep UI
  // state for this component after it unmounts. if set to false the UI state
  // will be deleted and recreated when the component remounts
  var persist: js.UndefOr[Boolean] = js.undefined
  // customReducer: you can handle the UI state for this component's scope
  // by dispatching actions
  var reducer: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ js.Any, _]] = js.undefined
  // **required**: UI state for the component
  var state: UIStateShape
}

object uiParams {
  @scala.inline
  def apply[UIStateShape](
    state: UIStateShape,
    key: String = null,
    mergeProps: (/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any) => _ = null,
    options: AnonPure = null,
    persist: js.UndefOr[Boolean] = js.undefined,
    reducer: (/* state */ js.Any, /* action */ js.Any) => _ = null
  ): uiParams[UIStateShape] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mergeProps != null) __obj.updateDynamic("mergeProps")(js.Any.fromFunction3(mergeProps))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    if (reducer != null) __obj.updateDynamic("reducer")(js.Any.fromFunction2(reducer))
    __obj.asInstanceOf[uiParams[UIStateShape]]
  }
}

