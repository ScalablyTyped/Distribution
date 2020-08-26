package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.StellarMessage")
@js.native
class StellarMessage ()
  extends typings.stellarBase.mod.xdr.StellarMessage

/* static members */
@JSImport("stellar-sdk", "xdr.StellarMessage")
@js.native
object StellarMessage extends js.Object {
  def auth(value: typings.stellarBase.xdrMod.xdr.Auth): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def dontHave(value: typings.stellarBase.xdrMod.xdr.DontHave): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def errorMsg(value: typings.stellarBase.xdrMod.xdr.Error): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getPeer(): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getScpQuorumset(value: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getScpState(value: Double): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def getTxSet(value: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def hello(value: typings.stellarBase.xdrMod.xdr.Hello): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarMessage): Boolean = js.native
  def peer(value: js.Array[typings.stellarBase.xdrMod.xdr.PeerAddress]): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def scpMessage(value: typings.stellarBase.xdrMod.xdr.ScpEnvelope): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def scpQuorumset(value: typings.stellarBase.xdrMod.xdr.ScpQuorumSet): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def surveyRequest(value: typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def surveyResponse(value: typings.stellarBase.xdrMod.xdr.SignedSurveyResponseMessage): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarMessage): Buffer = js.native
  def transaction(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def txSet(value: typings.stellarBase.xdrMod.xdr.TransactionSet): typings.stellarBase.xdrMod.xdr.StellarMessage = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarMessage, io: Buffer): Unit = js.native
}

