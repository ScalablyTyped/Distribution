package typings.rbx.deleteMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteModifierProps extends js.Object {
  var size: js.UndefOr[small | medium | large] = js.undefined
}

object DeleteModifierProps {
  @scala.inline
  def apply(size: small | medium | large = null): DeleteModifierProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModifierProps]
  }
}

