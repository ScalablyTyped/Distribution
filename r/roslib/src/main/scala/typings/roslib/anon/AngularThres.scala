package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AngularThres extends StObject {
  
  var angularThres: js.UndefOr[Double] = js.undefined
  
  var fixedFrame: js.UndefOr[java.lang.String] = js.undefined
  
  var rate: js.UndefOr[Double] = js.undefined
  
  var repubServiceName: js.UndefOr[java.lang.String] = js.undefined
  
  var ros: typings.roslib.mod.Ros
  
  var serverName: js.UndefOr[java.lang.String] = js.undefined
  
  var topicTimeout: js.UndefOr[Double] = js.undefined
  
  var transThres: js.UndefOr[Double] = js.undefined
  
  var updateDelay: js.UndefOr[Double] = js.undefined
}
object AngularThres {
  
  inline def apply(ros: typings.roslib.mod.Ros): AngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularThres]
  }
  
  extension [Self <: AngularThres](x: Self) {
    
    inline def setAngularThres(value: Double): Self = StObject.set(x, "angularThres", value.asInstanceOf[js.Any])
    
    inline def setAngularThresUndefined: Self = StObject.set(x, "angularThres", js.undefined)
    
    inline def setFixedFrame(value: java.lang.String): Self = StObject.set(x, "fixedFrame", value.asInstanceOf[js.Any])
    
    inline def setFixedFrameUndefined: Self = StObject.set(x, "fixedFrame", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setRepubServiceName(value: java.lang.String): Self = StObject.set(x, "repubServiceName", value.asInstanceOf[js.Any])
    
    inline def setRepubServiceNameUndefined: Self = StObject.set(x, "repubServiceName", js.undefined)
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: java.lang.String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
    
    inline def setTopicTimeout(value: Double): Self = StObject.set(x, "topicTimeout", value.asInstanceOf[js.Any])
    
    inline def setTopicTimeoutUndefined: Self = StObject.set(x, "topicTimeout", js.undefined)
    
    inline def setTransThres(value: Double): Self = StObject.set(x, "transThres", value.asInstanceOf[js.Any])
    
    inline def setTransThresUndefined: Self = StObject.set(x, "transThres", js.undefined)
    
    inline def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    inline def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
  }
}
