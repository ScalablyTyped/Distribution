package typings.reactBulmaComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/couds/react-bulma-components/blob/master/src/components/modal/components/card/card.js
trait ModalCardModifierProps extends js.Object {
  var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ModalCardModifierProps {
  @scala.inline
  def apply(onClose: () => Unit = null): ModalCardModifierProps = {
    val __obj = js.Dynamic.literal()
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[ModalCardModifierProps]
  }
}

