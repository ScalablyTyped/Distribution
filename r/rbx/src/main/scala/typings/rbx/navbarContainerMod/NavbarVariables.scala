package typings.rbx.navbarContainerMod

import typings.rbx.rbxStrings.bottom
import typings.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-container.NavbarVariablesOverrides, rbx.rbx/components/navbar/navbar-container.NavbarVariablesDefaults> */
@js.native
trait NavbarVariables extends js.Object {
  var fixedAlignments: top | bottom = js.native
}

object NavbarVariables {
  @scala.inline
  def apply(fixedAlignments: top | bottom): NavbarVariables = {
    val __obj = js.Dynamic.literal(fixedAlignments = fixedAlignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarVariables]
  }
  @scala.inline
  implicit class NavbarVariablesOps[Self <: NavbarVariables] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFixedAlignments(value: top | bottom): Self = this.set("fixedAlignments", value.asInstanceOf[js.Any])
  }
  
}

