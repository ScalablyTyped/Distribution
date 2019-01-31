package typings
package sipDotJsLib.typesSipDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/sip-message", "IncomingRequest")
@js.native
class IncomingRequest protected () extends IncomingMessage {
  def this(ua: sipDotJsLib.typesUaMod.UA) = this()
  var ruri: js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  var serverTransaction: js.UndefOr[
    sipDotJsLib.typesTransactionsMod.NonInviteServerTransaction | sipDotJsLib.typesTransactionsMod.InviteServerTransaction
  ] = js.native
  var transport: js.UndefOr[sipDotJsLib.typesTransportMod.Transport] = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def reply(code: scala.Double): java.lang.String = js.native
  def reply(code: scala.Double, reason: java.lang.String): java.lang.String = js.native
  def reply(code: scala.Double, reason: java.lang.String, extraHeaders: js.Array[java.lang.String]): java.lang.String = js.native
  def reply(
    code: scala.Double,
    reason: java.lang.String,
    extraHeaders: js.Array[java.lang.String],
    body: js.Any
  ): java.lang.String = js.native
  def reply(
    code: scala.Double,
    reason: java.lang.String,
    extraHeaders: js.Array[java.lang.String],
    body: js.Any,
    onSuccess: js.Function1[/* response */ sipDotJsLib.Anon_Msg, scala.Unit]
  ): java.lang.String = js.native
  def reply(
    code: scala.Double,
    reason: java.lang.String,
    extraHeaders: js.Array[java.lang.String],
    body: js.Any,
    onSuccess: js.Function1[/* response */ sipDotJsLib.Anon_Msg, scala.Unit],
    onFailure: js.Function0[scala.Unit]
  ): java.lang.String = js.native
  def reply_sl(code: scala.Double): scala.Unit = js.native
  def reply_sl(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
}

