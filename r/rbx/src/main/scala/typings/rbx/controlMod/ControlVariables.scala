package typings.rbx.controlMod

import typings.rbx.rbxStrings.large
import typings.rbx.rbxStrings.medium
import typings.rbx.rbxStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/elements/form/control.ControlVariablesOverrides, rbx.rbx/elements/form/control.ControlVariablesDefaults> */
trait ControlVariables extends js.Object {
  var sizes: small | medium | large
}

object ControlVariables {
  @scala.inline
  def apply(sizes: small | medium | large): ControlVariables = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlVariables]
  }
}

