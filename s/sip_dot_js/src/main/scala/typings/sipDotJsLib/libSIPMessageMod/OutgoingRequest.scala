package typings
package sipDotJsLib.libSIPMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SIPMessage", "OutgoingRequest")
@js.native
class OutgoingRequest protected () extends js.Object {
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.libUAMod.UA) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, ua: sipDotJsLib.libUAMod.UA) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.libUAMod.UA, params: js.Any) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, ua: sipDotJsLib.libUAMod.UA, params: js.Any) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String]) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
  def this(method: java.lang.String, ruri: java.lang.String, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: sipDotJsLib.Anon_Body) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: java.lang.String) = this()
  def this(method: java.lang.String, ruri: sipDotJsLib.libURIMod.URI, ua: sipDotJsLib.libUAMod.UA, params: js.Any, extraHeaders: js.Array[java.lang.String], body: sipDotJsLib.Anon_Body) = this()
  var body: js.UndefOr[java.lang.String | sipDotJsLib.Anon_Body] = js.native
  var branch: js.UndefOr[java.lang.String] = js.native
  var callId: java.lang.String = js.native
  var cseq: scala.Double = js.native
  var dialog: js.UndefOr[sipDotJsLib.libDialogsMod.Dialog] = js.native
  var extraHeaders: js.Array[java.lang.String] = js.native
  var from: js.UndefOr[sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader] = js.native
  var fromTag: java.lang.String = js.native
  var headers: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  var logger: js.Any = js.native
  var method: java.lang.String = js.native
  var reasonPhrase: js.Any = js.native
  var ruri: java.lang.String | sipDotJsLib.libURIMod.URI = js.native
  var statusCode: js.Any = js.native
  var to: js.UndefOr[sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader] = js.native
  var toTag: js.UndefOr[java.lang.String] = js.native
  var transaction: js.UndefOr[sipDotJsLib.libTransactionsMod.ClientTransaction] = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  /**
    * Cancel this request.
    * If this is not an INVITE request, a no-op.
    * @param reason Reason phrase.
    * @param extraHeaders Extra headers.
    */
  def cancel(): scala.Unit = js.native
  def cancel(reason: java.lang.String): scala.Unit = js.native
  def cancel(reason: java.lang.String, extraHeaders: js.Array[java.lang.String]): scala.Unit = js.native
  /**
    * Get the value of the given header name at the given position.
    * @param {String} name header name
    * @returns {String|undefined} Returns the specified header, undefined if header doesn't exist.
    */
  def getHeader(name: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Get the header/s of the given name.
    * @param {String} name header name
    * @returns {Array} Array with all the headers of the specified name.
    */
  def getHeaders(name: java.lang.String): js.Array[java.lang.String] = js.native
  /**
    * Verify the existence of the given header.
    * @param {String} name header name
    * @returns {boolean} true if header with given name exists, false otherwise
    */
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  /**
    * Replace the the given header by the given value.
    * @param {String} name header name
    * @param {String | Array} value header value
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
    * @param branchParameter The branch parameter.
    * @param transport The transport.
    */
  def setViaHeader(branch: java.lang.String, transport: sipDotJsLib.libTransportMod.Transport): scala.Unit = js.native
}

