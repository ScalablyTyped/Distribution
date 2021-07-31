package typings.reactNativeMauron85BackgroundGeolocation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogEntry extends StObject {
  
  /** ID of log entry as stored in db. */
  var id: Double
  
  /** Log level */
  var level: LogLevel
  
  /** Log message */
  var message: String
  
  /** Recorded stacktrace. (Android only, on iOS part of message) */
  var stackTrace: String
  
  /** Timestamp in milliseconds since beginning of UNIX epoch. */
  var timestamp: Double
}
object LogEntry {
  
  @scala.inline
  def apply(id: Double, level: LogLevel, message: String, stackTrace: String, timestamp: Double): LogEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  
  @scala.inline
  implicit class LogEntryMutableBuilder[Self <: LogEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackTrace(value: String): Self = StObject.set(x, "stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
