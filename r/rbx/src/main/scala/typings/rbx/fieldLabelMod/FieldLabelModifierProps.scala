package typings.rbx.fieldLabelMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLabelModifierProps extends js.Object {
  var size: js.UndefOr[small | normal | medium | large] = js.undefined
}

object FieldLabelModifierProps {
  @scala.inline
  def apply(size: small | normal | medium | large = null): FieldLabelModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelModifierProps]
  }
}

