package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.OperationResultTr")
@js.native
class OperationResultTr ()
  extends typings.stellarBase.xdrMod.default.OperationResultTr

/* static members */
@JSImport("stellar-base", "xdr.OperationResultTr")
@js.native
object OperationResultTr extends js.Object {
  def accountMerge(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def allowTrust(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def bumpSequence(value: typings.stellarBase.xdrMod.xdr.BumpSequenceResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def changeTrust(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def createAccount(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def createPassiveSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def inflation(value: typings.stellarBase.xdrMod.xdr.InflationResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Boolean = js.native
  def manageBuyOffer(value: typings.stellarBase.xdrMod.xdr.ManageBuyOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def manageDatum(value: typings.stellarBase.xdrMod.xdr.ManageDataResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def manageSellOffer(value: typings.stellarBase.xdrMod.xdr.ManageSellOfferResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def pathPaymentStrictReceive(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictReceiveResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def pathPaymentStrictSend(value: typings.stellarBase.xdrMod.xdr.PathPaymentStrictSendResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def payment(value: typings.stellarBase.xdrMod.xdr.PaymentResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def setOption(value: typings.stellarBase.xdrMod.xdr.SetOptionsResult): typings.stellarBase.xdrMod.xdr.OperationResultTr = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.OperationResultTr): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.OperationResultTr, io: Buffer): Unit = js.native
}

