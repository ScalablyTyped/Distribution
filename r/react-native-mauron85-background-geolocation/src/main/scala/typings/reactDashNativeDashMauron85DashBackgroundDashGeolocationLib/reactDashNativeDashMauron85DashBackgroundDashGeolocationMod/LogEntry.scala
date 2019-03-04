package typings
package reactDashNativeDashMauron85DashBackgroundDashGeolocationLib.reactDashNativeDashMauron85DashBackgroundDashGeolocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  /** ID of log entry as stored in db. */
  var id: scala.Double
  var level: java.lang.String
  var message: java.lang.String
  /** Recorded stacktrace. (Android only, on iOS part of message) */
  var stackTrace: java.lang.String
  /** Timestamp in milliseconds since beginning of UNIX epoch. */
  var timestamp: scala.Double
}

object LogEntry {
  @scala.inline
  def apply(
    id: scala.Double,
    level: java.lang.String,
    message: java.lang.String,
    stackTrace: java.lang.String,
    timestamp: scala.Double
  ): LogEntry = {
    val __obj = js.Dynamic.literal(id = id, level = level, message = message, stackTrace = stackTrace, timestamp = timestamp)
  
    __obj.asInstanceOf[LogEntry]
  }
}

