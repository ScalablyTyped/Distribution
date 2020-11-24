package typings.pusherChatkitClient.currentuserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRoomParams extends js.Object {
  
  var addUserIds: js.UndefOr[js.Array[String]] = js.native
  
  var customData: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
}
object CreateRoomParams {
  
  @scala.inline
  def apply(name: String): CreateRoomParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoomParams]
  }
  
  @scala.inline
  implicit class CreateRoomParamsOps[Self <: CreateRoomParams] (val x: Self) extends AnyVal {
    
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
    def setAddUserIdsVarargs(value: String*): Self = this.set("addUserIds", js.Array(value :_*))
    
    @scala.inline
    def setAddUserIds(value: js.Array[String]): Self = this.set("addUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddUserIds: Self = this.set("addUserIds", js.undefined)
    
    @scala.inline
    def setCustomData(value: js.Any): Self = this.set("customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomData: Self = this.set("customData", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
  }
}
