package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngularThres extends StObject {
  
  var angularThres: js.UndefOr[Double] = js.native
  
  var fixedFrame: js.UndefOr[java.lang.String] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var repubServiceName: js.UndefOr[java.lang.String] = js.native
  
  var ros: typings.roslib.mod.Ros = js.native
  
  var serverName: js.UndefOr[java.lang.String] = js.native
  
  var topicTimeout: js.UndefOr[Double] = js.native
  
  var transThres: js.UndefOr[Double] = js.native
  
  var updateDelay: js.UndefOr[Double] = js.native
}
object AngularThres {
  
  @scala.inline
  def apply(ros: typings.roslib.mod.Ros): AngularThres = {
    val __obj = js.Dynamic.literal(ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngularThres]
  }
  
  @scala.inline
  implicit class AngularThresMutableBuilder[Self <: AngularThres] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngularThres(value: Double): Self = StObject.set(x, "angularThres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularThresUndefined: Self = StObject.set(x, "angularThres", js.undefined)
    
    @scala.inline
    def setFixedFrame(value: java.lang.String): Self = StObject.set(x, "fixedFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedFrameUndefined: Self = StObject.set(x, "fixedFrame", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setRepubServiceName(value: java.lang.String): Self = StObject.set(x, "repubServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepubServiceNameUndefined: Self = StObject.set(x, "repubServiceName", js.undefined)
    
    @scala.inline
    def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: java.lang.String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerNameUndefined: Self = StObject.set(x, "serverName", js.undefined)
    
    @scala.inline
    def setTopicTimeout(value: Double): Self = StObject.set(x, "topicTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicTimeoutUndefined: Self = StObject.set(x, "topicTimeout", js.undefined)
    
    @scala.inline
    def setTransThres(value: Double): Self = StObject.set(x, "transThres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransThresUndefined: Self = StObject.set(x, "transThres", js.undefined)
    
    @scala.inline
    def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
  }
}
