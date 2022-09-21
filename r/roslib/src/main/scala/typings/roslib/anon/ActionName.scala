package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionName extends StObject {
  
  var actionName: java.lang.String
  
  var omitFeedback: js.UndefOr[Boolean] = js.undefined
  
  var omitResult: js.UndefOr[Boolean] = js.undefined
  
  var omitStatus: js.UndefOr[Boolean] = js.undefined
  
  var ros: typings.roslib.mod.Ros
  
  var serverName: java.lang.String
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object ActionName {
  
  inline def apply(actionName: java.lang.String, ros: typings.roslib.mod.Ros, serverName: java.lang.String): ActionName = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
  
  extension [Self <: ActionName](x: Self) {
    
    inline def setActionName(value: java.lang.String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setOmitFeedback(value: Boolean): Self = StObject.set(x, "omitFeedback", value.asInstanceOf[js.Any])
    
    inline def setOmitFeedbackUndefined: Self = StObject.set(x, "omitFeedback", js.undefined)
    
    inline def setOmitResult(value: Boolean): Self = StObject.set(x, "omitResult", value.asInstanceOf[js.Any])
    
    inline def setOmitResultUndefined: Self = StObject.set(x, "omitResult", js.undefined)
    
    inline def setOmitStatus(value: Boolean): Self = StObject.set(x, "omitStatus", value.asInstanceOf[js.Any])
    
    inline def setOmitStatusUndefined: Self = StObject.set(x, "omitStatus", js.undefined)
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: java.lang.String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
