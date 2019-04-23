package typings
package sipDotJsLib.libSIPMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/SIPMessage", "IncomingRequest")
@js.native
class IncomingRequest protected () extends IncomingMessage {
  def this(ua: sipDotJsLib.libUAMod.UA) = this()
  var logger: js.Any = js.native
  var ruri: js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  var transaction: js.UndefOr[sipDotJsLib.libTransactionsMod.ServerTransaction] = js.native
  var transport: js.UndefOr[sipDotJsLib.libTransportMod.Transport] = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  /**
    * Stateful reply.
    * @param {Number} code status code
    * @param {String} reason reason phrase
    * @param {Object} headers extra headers
    * @param {String} body body
    */
  def reply(code: scala.Double): java.lang.String = js.native
  def reply(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def reply(code: scala.Double, reason: java.lang.String, extraHeaders: js.Array[java.lang.String]): java.lang.String = js.native
  def reply(
    code: scala.Double,
    reason: java.lang.String,
    extraHeaders: js.Array[java.lang.String],
    body: java.lang.String
  ): java.lang.String = js.native
  def reply(
    code: scala.Double,
    reason: java.lang.String,
    extraHeaders: js.Array[java.lang.String],
    body: sipDotJsLib.Anon_Body
  ): java.lang.String = js.native
  /**
    * Stateless reply.
    * @param {Number} code status code
    * @param {String} reason reason phrase
    */
  def reply_sl(code: scala.Double): java.lang.String = js.native
  def reply_sl(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
}

