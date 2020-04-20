package typings.rbx.fieldLabelMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.normal
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLabelVariablesDefaults extends js.Object {
  var sizes: small | normal | medium | large
}

object FieldLabelVariablesDefaults {
  @scala.inline
  def apply(sizes: small | normal | medium | large): FieldLabelVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLabelVariablesDefaults]
  }
}

