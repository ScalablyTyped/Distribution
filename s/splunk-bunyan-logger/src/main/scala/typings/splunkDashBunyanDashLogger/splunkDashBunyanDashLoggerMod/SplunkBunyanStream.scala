package typings.splunkDashBunyanDashLogger.splunkDashBunyanDashLoggerMod

import typings.bunyan.bunyanMod.Stream
import typings.splunkDashLogging.splunkDashLoggingMod.EventFormatter
import typings.splunkDashLogging.splunkDashLoggingMod.SendContext
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkBunyanStream extends Stream {
  @JSName("stream")
  var stream_SplunkBunyanStream: SplunkStream = js.native
  def flush(): Unit = js.native
  def flush(callback: js.Function3[/* error */ Error, /* req */ js.Any, /* res */ js.Any, Unit]): Unit = js.native
  def on(event: String, callback: js.Function2[/* err */ Error, /* context */ SendContext, Unit]): Unit = js.native
  def setEventFormatter(eventFormatter: EventFormatter): Unit = js.native
}

