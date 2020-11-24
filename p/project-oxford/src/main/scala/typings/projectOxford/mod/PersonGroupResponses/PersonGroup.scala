package typings.projectOxford.mod.PersonGroupResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonGroup extends js.Object {
  
  var name: String = js.native
  
  var personGroupId: String = js.native
  
  var userData: String = js.native
}
object PersonGroup {
  
  @scala.inline
  def apply(name: String, personGroupId: String, userData: String): PersonGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersonGroup]
  }
  
  @scala.inline
  implicit class PersonGroupOps[Self <: PersonGroup] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonGroupId(value: String): Self = this.set("personGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
  }
}
