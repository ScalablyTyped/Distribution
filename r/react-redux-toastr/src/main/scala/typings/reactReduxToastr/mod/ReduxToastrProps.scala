package typings.reactReduxToastr.mod

import typings.reactReduxToastr.anon.CancelText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReduxToastrProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var closeOnToastrClick: js.UndefOr[Boolean] = js.undefined
  var confirmOptions: js.UndefOr[CancelText] = js.undefined
  var newestOnTop: js.UndefOr[Boolean] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
   // This is currently not used, waiting for response from the package author to remove
  var position: js.UndefOr[positionType] = js.undefined
  var preventDuplicates: js.UndefOr[Boolean] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var toastr: js.UndefOr[ToastrState] = js.undefined
  var transitionIn: js.UndefOr[transitionInType] = js.undefined
  var transitionOut: js.UndefOr[transitionOutType] = js.undefined
}

object ReduxToastrProps {
  @scala.inline
  def apply(
    className: String = null,
    closeOnToastrClick: js.UndefOr[Boolean] = js.undefined,
    confirmOptions: CancelText = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    options: js.Any = null,
    position: positionType = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    timeOut: js.UndefOr[Double] = js.undefined,
    toastr: ToastrState = null,
    transitionIn: transitionInType = null,
    transitionOut: transitionOutType = null
  ): ReduxToastrProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnToastrClick)) __obj.updateDynamic("closeOnToastrClick")(closeOnToastrClick.get.asInstanceOf[js.Any])
    if (confirmOptions != null) __obj.updateDynamic("confirmOptions")(confirmOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOut)) __obj.updateDynamic("timeOut")(timeOut.get.asInstanceOf[js.Any])
    if (toastr != null) __obj.updateDynamic("toastr")(toastr.asInstanceOf[js.Any])
    if (transitionIn != null) __obj.updateDynamic("transitionIn")(transitionIn.asInstanceOf[js.Any])
    if (transitionOut != null) __obj.updateDynamic("transitionOut")(transitionOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduxToastrProps]
  }
}

