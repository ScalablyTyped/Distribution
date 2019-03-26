package typings
package atPulumiCloudLib.httpServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpServer extends js.Object {
  val url: atPulumiPulumiLib.outputMod.Output[java.lang.String]
}

@JSImport("@pulumi/cloud/httpServer", "HttpServer")
@js.native
class HttpServerCls protected () extends HttpServer {
  /**
    * @param createRequestListener Function that, when called, will produce the [[requestListener]]
    * function that will be called for each http request to the server.  The function will be
    * called once when the module is loaded.  As such, it is a suitable place for expensive
    * computation (like setting up a set of routes).  The function returned can then utilize the
    * results of that computation.
    */
  def this(name: java.lang.String, createRequestListener: RequestListenerFactory) = this()
  def this(name: java.lang.String, createRequestListener: RequestListenerFactory, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
  /* CompleteClass */
  override val url: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

object HttpServer {
  @scala.inline
  def apply(url: atPulumiPulumiLib.outputMod.Output[java.lang.String]): HttpServer = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[HttpServer]
  }
}

