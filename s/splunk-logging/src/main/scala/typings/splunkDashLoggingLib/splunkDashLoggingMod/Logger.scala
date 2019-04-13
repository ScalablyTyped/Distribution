package typings
package splunkDashLoggingLib.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("splunk-logging", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(config: Config) = this()
  @JSName("eventFormatter")
  var eventFormatter_Original: EventFormatter = js.native
  var requestOptions: requestLib.requestMod.CoreOptions = js.native
  val serializedEventQueue: js.Array[_] = js.native
  def error(error: stdLib.Error, context: SendContext): scala.Unit = js.native
  def eventFormatter(message: js.Any, severity: java.lang.String): js.Any = js.native
  def flush(): scala.Unit = js.native
  def flush(callback: Callback): scala.Unit = js.native
  def send(context: SendContext): scala.Unit = js.native
  def send(context: SendContext, callback: Callback): scala.Unit = js.native
}

