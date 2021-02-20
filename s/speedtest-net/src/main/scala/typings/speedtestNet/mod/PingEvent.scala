package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.ping
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sent when the test is in the ping phase. */
@js.native
trait PingEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  var ping: PingData = js.native
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var timestamp: Date = js.native
  
  @JSName("type")
  var type_PingEvent: ping = js.native
}
object PingEvent {
  
  @scala.inline
  def apply(ping: PingData, progress: Double, timestamp: Date, `type`: ping): PingEvent = {
    val __obj = js.Dynamic.literal(ping = ping.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PingEvent]
  }
  
  @scala.inline
  implicit class PingEventMutableBuilder[Self <: PingEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPing(value: PingData): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ping): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
