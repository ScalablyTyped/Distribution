package typings.stellarSdk.mod.xdr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.PaymentResultCode")
@js.native
class PaymentResultCode ()
  extends typings.stellarBase.mod.xdr.PaymentResultCode

/* static members */
@JSImport("stellar-sdk", "xdr.PaymentResultCode")
@js.native
object PaymentResultCode extends js.Object {
  def paymentLineFull(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentMalformed(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentNoDestination(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentNoIssuer(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentNoTrust(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentNotAuthorized(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentSrcNoTrust(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentSrcNotAuthorized(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentSuccess(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
  def paymentUnderfunded(): typings.stellarBase.xdrMod.xdr.PaymentResultCode = js.native
}

