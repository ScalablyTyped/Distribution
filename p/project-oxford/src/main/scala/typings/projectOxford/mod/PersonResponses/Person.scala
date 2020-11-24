package typings.projectOxford.mod.PersonResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Person extends js.Object {
  
  var faceIds: js.Array[String] = js.native
  
  var name: String = js.native
  
  var personId: String = js.native
  
  var userData: String = js.native
}
object Person {
  
  @scala.inline
  def apply(faceIds: js.Array[String], name: String, personId: String, userData: String): Person = {
    val __obj = js.Dynamic.literal(faceIds = faceIds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], personId = personId.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    
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
    def setFaceIdsVarargs(value: String*): Self = this.set("faceIds", js.Array(value :_*))
    
    @scala.inline
    def setFaceIds(value: js.Array[String]): Self = this.set("faceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonId(value: String): Self = this.set("personId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserData(value: String): Self = this.set("userData", value.asInstanceOf[js.Any])
  }
}
