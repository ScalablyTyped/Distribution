package typings.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogEntry extends js.Object {
  /** ID of log entry as stored in db. */
  var id: Double = js.native
  /** Log level */
  var level: LogLevel = js.native
  /** Log message */
  var message: String = js.native
  /** Recorded stacktrace. (Android only, on iOS part of message) */
  var stackTrace: String = js.native
  /** Timestamp in milliseconds since beginning of UNIX epoch. */
  var timestamp: Double = js.native
}

object LogEntry {
  @scala.inline
  def apply(id: Double, level: LogLevel, message: String, stackTrace: String, timestamp: Double): LogEntry = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogEntry]
  }
  @scala.inline
  implicit class LogEntryOps[Self <: LogEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackTrace(value: String): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

