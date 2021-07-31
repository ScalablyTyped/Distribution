package typings.rascal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMax extends StObject {
  
  var channelMax: Double
  
  var connection_timeout: Double
  
  var heartbeat: Double
}
object ChannelMax {
  
  @scala.inline
  def apply(channelMax: Double, connection_timeout: Double, heartbeat: Double): ChannelMax = {
    val __obj = js.Dynamic.literal(channelMax = channelMax.asInstanceOf[js.Any], connection_timeout = connection_timeout.asInstanceOf[js.Any], heartbeat = heartbeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMax]
  }
  
  @scala.inline
  implicit class ChannelMaxMutableBuilder[Self <: ChannelMax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelMax(value: Double): Self = StObject.set(x, "channelMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnection_timeout(value: Double): Self = StObject.set(x, "connection_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeartbeat(value: Double): Self = StObject.set(x, "heartbeat", value.asInstanceOf[js.Any])
  }
}
