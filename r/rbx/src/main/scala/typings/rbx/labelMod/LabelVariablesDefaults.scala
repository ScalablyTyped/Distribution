package typings.rbx.labelMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelVariablesDefaults extends js.Object {
  var sizes: small | medium | large
}

object LabelVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large): LabelVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelVariablesDefaults]
  }
}

