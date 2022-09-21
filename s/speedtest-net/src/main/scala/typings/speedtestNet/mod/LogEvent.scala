package typings.speedtestNet.mod

import typings.speedtestNet.speedtestNetStrings.log
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These are various log messages. Only sent when `verbosity` is 1 or
  * greater. Higher verbosity leads to more messages. That's all I know.
  */
trait LogEvent
  extends StObject
     with BaseEvent
     with SpeedTestEvent {
  
  /** Levels include `info` and `warning` and may include others. */
  var level: String
  
  var message: String
  
  /** Indicates the overall progress of the test as a fraction (0 to 1). */
  var progress: Double
  
  var timestamp: js.Date
  
  @JSName("type")
  var type_LogEvent: log
}
object LogEvent {
  
  inline def apply(level: String, message: String, progress: Double, timestamp: js.Date): LogEvent = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[LogEvent]
  }
  
  extension [Self <: LogEvent](x: Self) {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
