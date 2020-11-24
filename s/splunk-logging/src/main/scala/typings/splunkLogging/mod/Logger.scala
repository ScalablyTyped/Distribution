package typings.splunkLogging.mod

import typings.request.mod.CoreOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("splunk-logging", "Logger")
@js.native
class Logger protected () extends js.Object {
  def this(config: Config) = this()
  
  def error(error: Error, context: SendContext): Unit = js.native
  
  def eventFormatter(message: js.Any, severity: String): js.Any = js.native
  @JSName("eventFormatter")
  var eventFormatter_Original: EventFormatter = js.native
  
  def flush(): Unit = js.native
  def flush(callback: Callback): Unit = js.native
  
  var requestOptions: CoreOptions = js.native
  
  def send(context: SendContext): Unit = js.native
  def send(context: SendContext, callback: Callback): Unit = js.native
  
  val serializedEventQueue: js.Array[_] = js.native
}
