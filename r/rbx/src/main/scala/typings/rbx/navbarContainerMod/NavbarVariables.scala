package typings.rbx.navbarContainerMod

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-container.NavbarVariablesOverrides, rbx.rbx/components/navbar/navbar-container.NavbarVariablesDefaults> */
trait NavbarVariables extends js.Object {
  var fixedAlignments: top | bottom
}

object NavbarVariables {
  @scala.inline
  def apply(fixedAlignments: top | bottom): NavbarVariables = {
    val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarVariables]
  }
}

