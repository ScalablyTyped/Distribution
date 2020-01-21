package typings.sipJs.mod

import typings.sipJs.bodyMod.Body
import typings.sipJs.coreMod.OutgoingRequestMessage
import typings.sipJs.outgoingRequestMessageMod.OutgoingRequestMessageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "OutgoingRequest")
@js.native
class OutgoingRequest protected () extends OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typings.sipJs.uriMod.URI,
    fromURI: typings.sipJs.uriMod.URI,
    toURI: typings.sipJs.uriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.uriMod.URI,
    fromURI: typings.sipJs.uriMod.URI,
    toURI: typings.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.uriMod.URI,
    fromURI: typings.sipJs.uriMod.URI,
    toURI: typings.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipJs.uriMod.URI,
    fromURI: typings.sipJs.uriMod.URI,
    toURI: typings.sipJs.uriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
}

/* static members */
@JSImport("sip.js", "OutgoingRequest")
@js.native
object OutgoingRequest extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}

