package typings
package ravenLib.ravenMod

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
    var agent: nodeLib.httpMod.Agent = js.native
    var defaultPort: java.lang.String = js.native
    var options: HTTPTransportOptions = js.native
  }
  
  trait HTTPTransportOptions extends js.Object {
    var agent: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
    var ca: js.UndefOr[java.lang.String] = js.undefined
    var headers: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
    var hostname: js.UndefOr[java.lang.String] = js.undefined
    var method: js.UndefOr[ravenLib.ravenLibStrings.POST | ravenLib.ravenLibStrings.GET] = js.undefined
    var path: js.UndefOr[java.lang.String] = js.undefined
    var port: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  abstract class Transport ()
    extends nodeLib.eventsMod.EventEmitter {
    def send(
      client: ravenLib.ravenMod.Client,
      message: js.Any,
      headers: nodeLib.httpMod.OutgoingHttpHeaders,
      eventId: java.lang.String,
      cb: ravenLib.ravenMod.CaptureCallback
    ): scala.Unit = js.native
  }
  
  val http: HTTPTransport = js.native
  val https: HTTPSTransport = js.native
}

