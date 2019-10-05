package typings.raven.ravenMod.transports

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.OutgoingHttpHeaders
import typings.raven.ravenMod.CaptureCallback
import typings.raven.ravenMod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "transports.Transport")
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

