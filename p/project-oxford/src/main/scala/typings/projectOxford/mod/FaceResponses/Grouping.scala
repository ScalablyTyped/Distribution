package typings.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Grouping extends js.Object {
  
  var groups: js.Array[String] = js.native
  
  var messyGroup: js.Array[String] = js.native
}
object Grouping {
  
  @scala.inline
  def apply(groups: js.Array[String], messyGroup: js.Array[String]): Grouping = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], messyGroup = messyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grouping]
  }
  
  @scala.inline
  implicit class GroupingOps[Self <: Grouping] (val x: Self) extends AnyVal {
    
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
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessyGroupVarargs(value: String*): Self = this.set("messyGroup", js.Array(value :_*))
    
    @scala.inline
    def setMessyGroup(value: js.Array[String]): Self = this.set("messyGroup", value.asInstanceOf[js.Any])
  }
}
