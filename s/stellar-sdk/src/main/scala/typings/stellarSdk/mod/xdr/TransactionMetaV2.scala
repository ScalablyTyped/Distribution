package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.TxChangesAfter
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TransactionMetaV2")
@js.native
class TransactionMetaV2 protected ()
  extends typings.stellarBase.mod.xdr.TransactionMetaV2 {
  def this(attributes: TxChangesAfter) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.TransactionMetaV2")
@js.native
object TransactionMetaV2 extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionMetaV2): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionMetaV2 = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionMetaV2): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionMetaV2, io: Buffer): Unit = js.native
}

