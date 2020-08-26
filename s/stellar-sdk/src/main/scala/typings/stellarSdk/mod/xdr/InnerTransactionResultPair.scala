package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Result
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.InnerTransactionResultPair")
@js.native
class InnerTransactionResultPair protected ()
  extends typings.stellarBase.mod.xdr.InnerTransactionResultPair {
  def this(attributes: Result) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.InnerTransactionResultPair")
@js.native
object InnerTransactionResultPair extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair, io: Buffer): Unit = js.native
}

