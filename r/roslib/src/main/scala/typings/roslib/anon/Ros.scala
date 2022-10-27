package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ros extends StObject {
  
  var actionName: java.lang.String
  
  var ros: typings.roslib.mod.Ros
  
  var serverName: java.lang.String
}
object Ros {
  
  inline def apply(actionName: java.lang.String, ros: typings.roslib.mod.Ros, serverName: java.lang.String): Ros = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ros]
  }
  
  extension [Self <: Ros](x: Self) {
    
    inline def setActionName(value: java.lang.String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: java.lang.String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
  }
}
