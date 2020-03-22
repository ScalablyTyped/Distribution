package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Modal ***/
// https://github.com/couds/react-bulma-components/blob/master/src/components/modal/modal.js
trait ModalModifierProps extends js.Object {
  var closeOnBlur: js.UndefOr[Boolean] = js.undefined
  var closeOnEsc: js.UndefOr[Boolean] = js.undefined
  var document: js.UndefOr[js.Object] = js.undefined
  var show: Boolean
  var showClose: js.UndefOr[Boolean] = js.undefined
  def onClose(): Unit
}

object ModalModifierProps {
  @scala.inline
  def apply(
    onClose: () => Unit,
    show: Boolean,
    closeOnBlur: js.UndefOr[Boolean] = js.undefined,
    closeOnEsc: js.UndefOr[Boolean] = js.undefined,
    document: js.Object = null,
    showClose: js.UndefOr[Boolean] = js.undefined
  ): ModalModifierProps = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose), show = show.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnBlur)) __obj.updateDynamic("closeOnBlur")(closeOnBlur.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEsc)) __obj.updateDynamic("closeOnEsc")(closeOnEsc.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalModifierProps]
  }
}

