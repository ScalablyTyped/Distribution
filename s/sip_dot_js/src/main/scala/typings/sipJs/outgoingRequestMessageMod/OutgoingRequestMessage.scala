package typings.sipJs.outgoingRequestMessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.sipJs.bodyMod.Body
import typings.sipJs.grammarMod.NameAddrHeader
import typings.sipJs.grammarMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
@js.native
class OutgoingRequestMessage protected () extends js.Object {
  def this(method: String, ruri: URI, fromURI: URI, toURI: URI) = this()
  def this(method: String, ruri: URI, fromURI: URI, toURI: URI, options: OutgoingRequestMessageOptions) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String]
  ) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.UndefOr[scala.Nothing],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: js.UndefOr[scala.Nothing],
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.UndefOr[scala.Nothing],
    body: Body
  ) = this()
  def this(
    method: String,
    ruri: URI,
    fromURI: URI,
    toURI: URI,
    options: OutgoingRequestMessageOptions,
    extraHeaders: js.Array[String],
    body: Body
  ) = this()
  
  var body: js.UndefOr[typings.sipJs.anon.Body] = js.native
  
  var branch: js.UndefOr[String] = js.native
  
  val callId: String = js.native
  
  var cseq: Double = js.native
  
  var extraHeaders: js.Array[String] = js.native
  
  val from: NameAddrHeader = js.native
  
  val fromTag: String = js.native
  
  val fromURI: URI = js.native
  
  /**
    * Get the value of the given header name at the given position.
    * @param name - header name
    * @returns Returns the specified header, undefined if header doesn't exist.
    */
  def getHeader(name: String): js.UndefOr[String] = js.native
  
  /**
    * Get the header/s of the given name.
    * @param name - header name
    * @returns Array with all the headers of the specified name.
    */
  def getHeaders(name: String): js.Array[String] = js.native
  
  /**
    * Verify the existence of the given header.
    * @param name - header name
    * @returns true if header with given name exists, false otherwise
    */
  def hasHeader(name: String): Boolean = js.native
  
  val headers: StringDictionary[js.Array[String]] = js.native
  
  val method: String = js.native
  
  var options: js.Any = js.native
  
  val ruri: URI = js.native
  
  /**
    * Replace the the given header by the given value.
    * @param name - header name
    * @param value - header value
    */
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
  
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
    * @param transport - The sent protocol transport.
    */
  def setViaHeader(branch: String, transport: String): Unit = js.native
  
  val to: NameAddrHeader = js.native
  
  val toTag: js.UndefOr[String] = js.native
  
  val toURI: URI = js.native
}
/* static members */
@JSImport("sip.js/lib/core/messages/outgoing-request-message", "OutgoingRequestMessage")
@js.native
object OutgoingRequestMessage extends js.Object {
  
  /** Get a copy of the default options. */
  var getDefaultOptions: js.Any = js.native
  
  var makeNameAddrHeader: js.Any = js.native
}
