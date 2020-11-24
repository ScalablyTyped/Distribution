package typings.rbx.navbarDropdownMod

import typings.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-dropdown.NavbarDropdownVariablesOverrides, rbx.rbx/components/navbar/navbar-dropdown.NavbarDropdownVariablesDefaults> */
@js.native
trait NavbarDropdownVariables extends js.Object {
  
  var alignments: right = js.native
}
object NavbarDropdownVariables {
  
  @scala.inline
  def apply(alignments: right): NavbarDropdownVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarDropdownVariables]
  }
  
  @scala.inline
  implicit class NavbarDropdownVariablesOps[Self <: NavbarDropdownVariables] (val x: Self) extends AnyVal {
    
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
    def setAlignments(value: right): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
}
