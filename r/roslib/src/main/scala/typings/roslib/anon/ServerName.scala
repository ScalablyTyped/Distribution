package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerName extends StObject {
  
  var actionName: java.lang.String
  
  var ros: typings.roslib.mod.Ros
  
  var serverName: java.lang.String
}
object ServerName {
  
  inline def apply(actionName: java.lang.String, ros: typings.roslib.mod.Ros, serverName: java.lang.String): ServerName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerName] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: java.lang.String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: java.lang.String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
  }
}
