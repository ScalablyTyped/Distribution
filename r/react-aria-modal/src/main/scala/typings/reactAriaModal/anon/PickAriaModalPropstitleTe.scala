package typings.reactAriaModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleText'> */
trait PickAriaModalPropstitleTe extends js.Object {
  var titleText: js.UndefOr[String] = js.undefined
}

object PickAriaModalPropstitleTe {
  @scala.inline
  def apply(titleText: String = null): PickAriaModalPropstitleTe = {
    val __obj = js.Dynamic.literal()
    if (titleText != null) __obj.updateDynamic("titleText")(titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAriaModalPropstitleTe]
  }
}

