package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionName extends js.Object {
  
  var actionName: java.lang.String = js.native
  
  var ros: typings.roslib.mod.Ros = js.native
  
  var serverName: java.lang.String = js.native
  
  var timeout: Double = js.native
}
object ActionName {
  
  @scala.inline
  def apply(
    actionName: java.lang.String,
    ros: typings.roslib.mod.Ros,
    serverName: java.lang.String,
    timeout: Double
  ): ActionName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
  
  @scala.inline
  implicit class ActionNameOps[Self <: ActionName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionName(value: java.lang.String): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRos(value: typings.roslib.mod.Ros): Self = this.set("ros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: java.lang.String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
  }
}
