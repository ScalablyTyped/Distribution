package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBrokerUser extends js.Object {
  
  var consoleAccess: Boolean = js.native
  
  var groups: js.Array[String] = js.native
  
  var username: String = js.native
}
object GetBrokerUser {
  
  @scala.inline
  def apply(consoleAccess: Boolean, groups: js.Array[String], username: String): GetBrokerUser = {
    val __obj = js.Dynamic.literal(consoleAccess = consoleAccess.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBrokerUser]
  }
  
  @scala.inline
  implicit class GetBrokerUserOps[Self <: GetBrokerUser] (val x: Self) extends AnyVal {
    
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
    def setConsoleAccess(value: Boolean): Self = this.set("consoleAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
