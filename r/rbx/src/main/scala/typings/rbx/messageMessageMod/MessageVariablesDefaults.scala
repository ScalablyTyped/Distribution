package typings.rbx.messageMessageMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageVariablesDefaults extends js.Object {
  var sizes: small | medium | large
}

object MessageVariablesDefaults {
  @scala.inline
  def apply(sizes: small | medium | large): MessageVariablesDefaults = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageVariablesDefaults]
  }
}

