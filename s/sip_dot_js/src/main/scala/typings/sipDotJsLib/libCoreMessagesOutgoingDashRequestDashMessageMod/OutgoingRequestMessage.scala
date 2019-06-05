package typings
package sipDotJsLib.libCoreMessagesOutgoingDashRequestDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected () extends js.Object {
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: OutgoingRequestMessageOptions) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libCoreMessagesUriMod.URI, fromURI: sipDotJsLib.libCoreMessagesUriMod.URI, toURI: sipDotJsLib.libCoreMessagesUriMod.URI, options: OutgoingRequestMessageOptions, extraHeaders: js.Array[java.lang.String], body: sipDotJsLib.libCoreMessagesBodyMod.Body) = this()
  var body: js.UndefOr[sipDotJsLib.Anon_BodyContentType] = js.native
  var branch: js.UndefOr[java.lang.String] = js.native
  val callId: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var extraHeaders: js.Array[java.lang.String] = js.native
  val from: sipDotJsLib.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  val fromTag: java.lang.String = js.native
  val fromURI: sipDotJsLib.libCoreMessagesUriMod.URI = js.native
  val headers: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  val method: java.lang.String = js.native
  var options: js.Any = js.native
  val ruri: sipDotJsLib.libCoreMessagesUriMod.URI = js.native
  val to: sipDotJsLib.libCoreMessagesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  val toTag: js.UndefOr[java.lang.String] = js.native
  val toURI: sipDotJsLib.libCoreMessagesUriMod.URI = js.native
  /**
    * Get the value of the given header name at the given position.
    * @param name - header name
    * @returns Returns the specified header, undefined if header doesn't exist.
    */
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Get the header/s of the given name.
    * @param name - header name
    * @returns Array with all the headers of the specified name.
    */
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Verify the existence of the given header.
    * @param name - header name
    * @returns true if header with given name exists, false otherwise
    */
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  /**
    * Replace the the given header by the given value.
    * @param name - header name
    * @param value - header value
    */
  def setHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setHeader(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * The Via header field indicates the transport used for the transaction
    * and identifies the location where the response is to be sent.  A Via
    * header field value is added only after the transport that will be
    * used to reach the next hop has been selected (which may involve the
    * usage of the procedures in [4]).
    *
    * When the UAC creates a request, it MUST insert a Via into that
    * request.  The protocol name and protocol version in the header field
    * MUST be SIP and 2.0, respectively.  The Via header field value MUST
    * contain a branch parameter.  This parameter is used to identify the
    * transaction created by that request.  This parameter is used by both
    * the client and the server.
    * https://tools.ietf.org/html/rfc3261#section-8.1.1.7
    * @param branchParameter - The branch parameter.
    * @param scheme - The scheme.
    */
  def setViaHeader(branch: java.lang.String): scala.Unit = js.native
  def setViaHeader(branch: java.lang.String, scheme: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  var makeNameAddrHeader: js.Any = js.native
}

