package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StellarMessage extends js.Object {
  def auth(): Auth = js.native
  def auth(value: Auth): Auth = js.native
  def dontHave(): DontHave = js.native
  def dontHave(value: DontHave): DontHave = js.native
  def envelope(): ScpEnvelope = js.native
  def envelope(value: ScpEnvelope): ScpEnvelope = js.native
  def error(): Error = js.native
  def error(value: Error): Error = js.native
  def getScpLedgerSeq(): Double = js.native
  def getScpLedgerSeq(value: Double): Double = js.native
  def hello(): Hello = js.native
  def hello(value: Hello): Hello = js.native
  def peers(): js.Array[PeerAddress] = js.native
  def peers(value: js.Array[PeerAddress]): js.Array[PeerAddress] = js.native
  def qSet(): ScpQuorumSet = js.native
  def qSet(value: ScpQuorumSet): ScpQuorumSet = js.native
  def qSetHash(): Buffer = js.native
  def qSetHash(value: Buffer): Buffer = js.native
  def signedSurveyRequestMessage(): SignedSurveyRequestMessage = js.native
  def signedSurveyRequestMessage(value: SignedSurveyRequestMessage): SignedSurveyRequestMessage = js.native
  def signedSurveyResponseMessage(): SignedSurveyResponseMessage = js.native
  def signedSurveyResponseMessage(value: SignedSurveyResponseMessage): SignedSurveyResponseMessage = js.native
  def switch(): MessageType = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def transaction(): TransactionEnvelope = js.native
  def transaction(value: TransactionEnvelope): TransactionEnvelope = js.native
  def txSet(): TransactionSet = js.native
  def txSet(value: TransactionSet): TransactionSet = js.native
  def txSetHash(): Buffer = js.native
  def txSetHash(value: Buffer): Buffer = js.native
  def value(): Error | Hello | Auth | DontHave | js.Array[PeerAddress] | Buffer | TransactionSet | TransactionEnvelope | SignedSurveyRequestMessage | SignedSurveyResponseMessage | ScpQuorumSet | ScpEnvelope | Double | Unit = js.native
}

