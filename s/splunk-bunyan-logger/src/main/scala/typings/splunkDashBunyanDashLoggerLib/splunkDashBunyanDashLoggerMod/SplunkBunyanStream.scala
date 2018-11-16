package typings
package splunkDashBunyanDashLoggerLib.splunkDashBunyanDashLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplunkBunyanStream
  extends bunyanLib.bunyanMod.LoggerNs.Stream {
  @JSName("stream")
  var stream_SplunkBunyanStream: SplunkStream = js.native
  def flush(): scala.Unit = js.native
  def flush(callback: js.Function3[/* error */ nodeLib.Error, /* req */ js.Any, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  def on(
    event: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.Error, 
      /* context */ splunkDashLoggingLib.splunkDashLoggingMod.SendContext, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setEventFormatter(eventFormatter: splunkDashLoggingLib.splunkDashLoggingMod.EventFormatter): scala.Unit = js.native
}

