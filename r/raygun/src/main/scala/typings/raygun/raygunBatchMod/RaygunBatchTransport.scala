package typings.raygun.raygunBatchMod

import typings.node.httpMod.IncomingMessage
import typings.raygun.anon.HttpOptions
import typings.raygun.typesMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raygun/build/raygun.batch", "RaygunBatchTransport")
@js.native
class RaygunBatchTransport protected () extends js.Object {
  def this(options: HttpOptions) = this()
  
  var batchId: js.Any = js.native
  
  var httpOptions: js.Any = js.native
  
  var interval: js.Any = js.native
  
  var intervalId: js.Any = js.native
  
  var messageQueue: js.Any = js.native
  
  var process: js.Any = js.native
  
  def send(message: String, callback: Callback[IncomingMessage]): Unit = js.native
  
  def startProcessing(): Unit = js.native
  
  def stopProcessing(): Unit = js.native
}
