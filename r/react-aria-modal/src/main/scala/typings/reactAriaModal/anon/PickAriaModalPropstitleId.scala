package typings.reactAriaModal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-aria-modal.react-aria-modal.AriaModalProps, 'titleId'> */
trait PickAriaModalPropstitleId extends js.Object {
  var titleId: js.UndefOr[String] = js.undefined
}

object PickAriaModalPropstitleId {
  @scala.inline
  def apply(titleId: String = null): PickAriaModalPropstitleId = {
    val __obj = js.Dynamic.literal()
    if (titleId != null) __obj.updateDynamic("titleId")(titleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickAriaModalPropstitleId]
  }
}

