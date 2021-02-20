package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.log
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These are various log messages. Only sent when `verbosity` is 1 or
  * greater. Higher verbosity leads to more messages. That's all I know.
  */
@js.native
trait LogEvent
  extends BaseEvent
     with SpeedTestEvent {
  
  /** Levels include `info` and `warning` and may include others. */
  var level: String = js.native
  
  var message: String = js.native
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double = js.native
  
  var timestamp: Date = js.native
  
  @JSName("type")
  var type_LogEvent: log = js.native
}
object LogEvent {
  
  @scala.inline
  def apply(level: String, message: String, progress: Double, timestamp: Date, `type`: log): LogEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEvent]
  }
  
  @scala.inline
  implicit class LogEventMutableBuilder[Self <: LogEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
