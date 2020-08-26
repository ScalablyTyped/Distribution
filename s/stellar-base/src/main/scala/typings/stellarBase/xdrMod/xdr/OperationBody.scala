package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationBody extends js.Object {
  def allowTrustOp(): AllowTrustOp = js.native
  def allowTrustOp(value: AllowTrustOp): AllowTrustOp = js.native
  def bumpSequenceOp(): BumpSequenceOp = js.native
  def bumpSequenceOp(value: BumpSequenceOp): BumpSequenceOp = js.native
  def changeTrustOp(): ChangeTrustOp = js.native
  def changeTrustOp(value: ChangeTrustOp): ChangeTrustOp = js.native
  def createAccountOp(): CreateAccountOp = js.native
  def createAccountOp(value: CreateAccountOp): CreateAccountOp = js.native
  def createPassiveSellOfferOp(): CreatePassiveSellOfferOp = js.native
  def createPassiveSellOfferOp(value: CreatePassiveSellOfferOp): CreatePassiveSellOfferOp = js.native
  def destination(): MuxedAccount = js.native
  def destination(value: MuxedAccount): MuxedAccount = js.native
  def manageBuyOfferOp(): ManageBuyOfferOp = js.native
  def manageBuyOfferOp(value: ManageBuyOfferOp): ManageBuyOfferOp = js.native
  def manageDataOp(): ManageDataOp = js.native
  def manageDataOp(value: ManageDataOp): ManageDataOp = js.native
  def manageSellOfferOp(): ManageSellOfferOp = js.native
  def manageSellOfferOp(value: ManageSellOfferOp): ManageSellOfferOp = js.native
  def pathPaymentStrictReceiveOp(): PathPaymentStrictReceiveOp = js.native
  def pathPaymentStrictReceiveOp(value: PathPaymentStrictReceiveOp): PathPaymentStrictReceiveOp = js.native
  def pathPaymentStrictSendOp(): PathPaymentStrictSendOp = js.native
  def pathPaymentStrictSendOp(value: PathPaymentStrictSendOp): PathPaymentStrictSendOp = js.native
  def paymentOp(): PaymentOp = js.native
  def paymentOp(value: PaymentOp): PaymentOp = js.native
  def setOptionsOp(): SetOptionsOp = js.native
  def setOptionsOp(value: SetOptionsOp): SetOptionsOp = js.native
  def switch(): OperationType = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def value(): CreateAccountOp | PaymentOp | PathPaymentStrictReceiveOp | ManageSellOfferOp | CreatePassiveSellOfferOp | SetOptionsOp | ChangeTrustOp | AllowTrustOp | MuxedAccount | ManageDataOp | BumpSequenceOp | ManageBuyOfferOp | PathPaymentStrictSendOp | Unit = js.native
}

