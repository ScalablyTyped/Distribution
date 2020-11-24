package typings.sendgrid.mod.SendGrid.Helpers.Mail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asm extends js.Object {
  
  var group_id: Double = js.native
  
  var groups_to_display: js.Array[Double] = js.native
}
object Asm {
  
  @scala.inline
  def apply(group_id: Double, groups_to_display: js.Array[Double]): Asm = {
    val __obj = js.Dynamic.literal(group_id = group_id.asInstanceOf[js.Any], groups_to_display = groups_to_display.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asm]
  }
  
  @scala.inline
  implicit class AsmOps[Self <: Asm] (val x: Self) extends AnyVal {
    
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
    def setGroup_id(value: Double): Self = this.set("group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups_to_displayVarargs(value: Double*): Self = this.set("groups_to_display", js.Array(value :_*))
    
    @scala.inline
    def setGroups_to_display(value: js.Array[Double]): Self = this.set("groups_to_display", value.asInstanceOf[js.Any])
  }
}
