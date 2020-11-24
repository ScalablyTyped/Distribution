package typings.raven.mod.transports

import typings.node.httpMod.Agent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raven", "transports.HTTPTransport")
@js.native
class HTTPTransport () extends Transport {
  def this(options: HTTPTransportOptions) = this()
  
  var agent: Agent = js.native
  
  var defaultPort: String = js.native
  
  var options: HTTPTransportOptions = js.native
}
