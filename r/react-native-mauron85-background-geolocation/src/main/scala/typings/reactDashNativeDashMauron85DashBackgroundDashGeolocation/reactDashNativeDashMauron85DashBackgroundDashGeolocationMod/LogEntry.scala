package typings.reactDashNativeDashMauron85DashBackgroundDashGeolocation.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
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
    val __obj = js.Dynamic.literal(id = id, level = level, message = message, stackTrace = stackTrace, timestamp = timestamp)
  
    __obj.asInstanceOf[LogEntry]
  }
}

