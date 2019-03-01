package typings
package reactDashReduxDashToastrLib.reactDashReduxDashToastrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxToastrProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var closeOnToastrClick: js.UndefOr[scala.Boolean] = js.undefined
  var confirmOptions: js.UndefOr[reactDashReduxDashToastrLib.Anon_CancelText] = js.undefined
  var newestOnTop: js.UndefOr[scala.Boolean] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
   // This is currently not used, waiting for response from the package author to remove
  var position: js.UndefOr[positionType] = js.undefined
  var preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  var timeOut: js.UndefOr[scala.Double] = js.undefined
  var toastr: js.UndefOr[ToastrState] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object ReduxToastrProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    closeOnToastrClick: js.UndefOr[scala.Boolean] = js.undefined,
    confirmOptions: reactDashReduxDashToastrLib.Anon_CancelText = null,
    newestOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    options: js.Any = null,
    position: positionType = null,
    preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    timeOut: scala.Int | scala.Double = null,
    toastr: ToastrState = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): ReduxToastrProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeOnToastrClick)) __obj.updateDynamic("closeOnToastrClick")(closeOnToastrClick)
    if (confirmOptions != null) __obj.updateDynamic("confirmOptions")(confirmOptions)
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (options != null) __obj.updateDynamic("options")(options)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates)
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (toastr != null) __obj.updateDynamic("toastr")(toastr)
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn)
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut)
    __obj.asInstanceOf[ReduxToastrProps]
  }
}

