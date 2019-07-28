package typings.sipDotJs.sipDotJsMod

import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions
import typings.sipDotJs.libCoreMod.OutgoingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "OutgoingRequest")
@js.native
class OutgoingRequest protected () extends OutgoingRequestMessage {
  def this(
    method: String,
    ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typings.sipDotJs.libCoreMessagesUriMod.URI
  ) = this()
  def this(
    method: String,
    ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    options: OutgoingRequestMessageOptions
  ) = this()
  def this(
    method: String,
    ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: typings.sipDotJs.libCoreMessagesUriMod.URI,
    fromURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
    toURI: typings.sipDotJs.libCoreMessagesUriMod.URI,
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

