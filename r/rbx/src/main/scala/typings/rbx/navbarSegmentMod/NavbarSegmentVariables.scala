package typings.rbx.navbarSegmentMod

import typings.rbx.rbxStrings.end
import typings.rbx.rbxStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rbx.rbx/types.Prefer<rbx.rbx/components/navbar/navbar-segment.NavbarSegmentVariablesOverrides, rbx.rbx/components/navbar/navbar-segment.NavbarSegmentVariablesDefaults> */
@js.native
trait NavbarSegmentVariables extends js.Object {
  
  var alignments: start | end = js.native
}
object NavbarSegmentVariables {
  
  @scala.inline
  def apply(alignments: start | end): NavbarSegmentVariables = {
    val __obj = js.Dynamic.literal(alignments = alignments.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavbarSegmentVariables]
  }
  
  @scala.inline
  implicit class NavbarSegmentVariablesOps[Self <: NavbarSegmentVariables] (val x: Self) extends AnyVal {
    
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
    def setAlignments(value: start | end): Self = this.set("alignments", value.asInstanceOf[js.Any])
  }
}
