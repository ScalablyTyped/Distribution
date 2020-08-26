package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "OperationBody")
@js.native
class OperationBody ()
  extends typings.stellarBase.xdrMod.xdr.OperationBody

/* static members */
@JSImport("stellar-base/types/xdr", "OperationBody")
@js.native
object OperationBody extends js.Object {
  def accountMerge(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def allowTrust(value: typings.stellarBase.xdrMod.xdr.AllowTrustOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def bumpSequence(value: typings.stellarBase.xdrMod.xdr.BumpSequenceOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def changeTrust(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def createAccount(value: typings.stellarBase.xdrMod.xdr.CreateAccountOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def createPassiveSellOffer(value: typings.stellarBase.xdrMod.xdr.CreatePassiveSellOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def inflation(): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationBody): Boolean = js.native
  def manageBuyOffer(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def manageDatum(value: typings.stellarBase.xdrMod.xdr.ManageDataOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def manageSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def pathPaymentStrictReceive(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def pathPaymentStrictSend(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def payment(value: typings.stellarBase.xdrMod.xdr.PaymentOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def setOption(value: typings.stellarBase.xdrMod.xdr.SetOptionsOp): typings.stellarBase.xdrMod.xdr.OperationBody = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationBody): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationBody, io: Buffer): Unit = js.native
}

