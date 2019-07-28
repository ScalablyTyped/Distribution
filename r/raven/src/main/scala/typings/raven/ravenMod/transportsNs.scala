package typings.raven.ravenMod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Agent
import typings.node.httpMod.OutgoingHttpHeaders
import typings.raven.ravenMod.transportsNs.HTTPSTransport
import typings.raven.ravenMod.transportsNs.HTTPTransport
import typings.raven.ravenMod.transportsNs.HTTPTransportOptions
import typings.raven.ravenMod.transportsNs.Transport
import typings.raven.ravenStrings.GET
import typings.raven.ravenStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "transports")
@js.native
object transportsNs extends js.Object {
  @js.native
  class HTTPSTransport () extends HTTPTransport
  
  @js.native
  class HTTPTransport () extends Transport {
    def this(options: HTTPTransportOptions) = this()
    var agent: Agent = js.native
    var defaultPort: String = js.native
    var options: HTTPTransportOptions = js.native
  }
  
  trait HTTPTransportOptions extends js.Object {
    var agent: js.UndefOr[Agent] = js.undefined
    var ca: js.UndefOr[String] = js.undefined
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
    var hostname: js.UndefOr[String] = js.undefined
    var method: js.UndefOr[POST | GET] = js.undefined
    var path: js.UndefOr[String] = js.undefined
    var port: js.UndefOr[Double] = js.undefined
    var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  abstract class Transport () extends EventEmitter {
    def send(
      client: Client,
      message: js.Any,
      headers: OutgoingHttpHeaders,
      eventId: String,
      cb: CaptureCallback
    ): Unit = js.native
  }
  
  val http: HTTPTransport = js.native
  val https: HTTPSTransport = js.native
}

