package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/modal/components/card/head.js
trait ModalCardHeadModifierProps extends js.Object {
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
  var showClose: js.UndefOr[Boolean] = js.undefined
}

object ModalCardHeadModifierProps {
  @scala.inline
  def apply(onClose: () => Unit = null, showClose: js.UndefOr[Boolean] = js.undefined): ModalCardHeadModifierProps = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (!js.isUndefined(showClose)) __obj.updateDynamic("showClose")(showClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalCardHeadModifierProps]
  }
}

