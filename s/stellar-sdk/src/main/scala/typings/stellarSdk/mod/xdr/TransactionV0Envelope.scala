package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Signatures
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
class TransactionV0Envelope protected ()
  extends typings.stellarBase.mod.xdr.TransactionV0Envelope {
  def this(attributes: Signatures) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.TransactionV0Envelope")
@js.native
object TransactionV0Envelope extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Envelope = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope, io: Buffer): Unit = js.native
}

