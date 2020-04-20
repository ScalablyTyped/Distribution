package typings.rbx.messageMessageMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/message/message.MessageVariablesOverrides, rbx.rbx/components/message/message.MessageVariablesDefaults> */
trait MessageVariables extends js.Object {
  var sizes: small | medium | large
}

object MessageVariables {
  @scala.inline
  def apply(sizes: small | medium | large): MessageVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageVariables]
  }
}

