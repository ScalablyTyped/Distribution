package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.ping
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sent when the test is in the ping phase. */
trait PingEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  var ping: PingData
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double
  
  var timestamp: Date
  
  @JSName("type")
  var type_PingEvent: ping
}
object PingEvent {
  
  inline def apply(ping: PingData, progress: Double, timestamp: Date): PingEvent = {
    val __obj = js.Dynamic.literal(ping = ping.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ping")
    __obj.asInstanceOf[PingEvent]
  }
  
  extension [Self <: PingEvent](x: Self) {
    
    inline def setPing(value: PingData): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: ping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
