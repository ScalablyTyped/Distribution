package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compression extends StObject {
  
  var compression: js.UndefOr[java.lang.String] = js.undefined
  
  var latch: js.UndefOr[Boolean] = js.undefined
  
  var messageType: java.lang.String
  
  var name: java.lang.String
  
  var queue_length: js.UndefOr[Double] = js.undefined
  
  var queue_size: js.UndefOr[Double] = js.undefined
  
  var reconnect_on_close: js.UndefOr[Boolean] = js.undefined
  
  var ros: typings.roslib.mod.Ros
  
  var throttle_rate: js.UndefOr[Double] = js.undefined
}
object Compression {
  
  inline def apply(messageType: java.lang.String, name: java.lang.String, ros: typings.roslib.mod.Ros): Compression = {
    val __obj = js.Dynamic.literal(messageType = messageType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ros = ros.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compression] (val x: Self) extends AnyVal {
    
    inline def setCompression(value: java.lang.String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setLatch(value: Boolean): Self = StObject.set(x, "latch", value.asInstanceOf[js.Any])
    
    inline def setLatchUndefined: Self = StObject.set(x, "latch", js.undefined)
    
    inline def setMessageType(value: java.lang.String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueue_length(value: Double): Self = StObject.set(x, "queue_length", value.asInstanceOf[js.Any])
    
    inline def setQueue_lengthUndefined: Self = StObject.set(x, "queue_length", js.undefined)
    
    inline def setQueue_size(value: Double): Self = StObject.set(x, "queue_size", value.asInstanceOf[js.Any])
    
    inline def setQueue_sizeUndefined: Self = StObject.set(x, "queue_size", js.undefined)
    
    inline def setReconnect_on_close(value: Boolean): Self = StObject.set(x, "reconnect_on_close", value.asInstanceOf[js.Any])
    
    inline def setReconnect_on_closeUndefined: Self = StObject.set(x, "reconnect_on_close", js.undefined)
    
    inline def setRos(value: typings.roslib.mod.Ros): Self = StObject.set(x, "ros", value.asInstanceOf[js.Any])
    
    inline def setThrottle_rate(value: Double): Self = StObject.set(x, "throttle_rate", value.asInstanceOf[js.Any])
    
    inline def setThrottle_rateUndefined: Self = StObject.set(x, "throttle_rate", js.undefined)
  }
}
