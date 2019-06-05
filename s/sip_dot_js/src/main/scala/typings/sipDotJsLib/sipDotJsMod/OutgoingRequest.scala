package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "OutgoingRequest")
@js.native
class OutgoingRequest protected ()
  extends sipDotJsLib.libCoreMod.OutgoingRequestMessage {
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod.OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String], body: sipDotJsLib.libCoreMessagesBodyMod.Body) = this()
}

/* static members */
@JSImport("sip.js", "OutgoingRequest")
@js.native
object OutgoingRequest extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}

