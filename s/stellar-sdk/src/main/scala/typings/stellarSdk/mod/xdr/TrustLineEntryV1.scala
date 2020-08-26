package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.ExtLiabilities
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TrustLineEntryV1")
@js.native
class TrustLineEntryV1 protected ()
  extends typings.stellarBase.mod.xdr.TrustLineEntryV1 {
  def this(attributes: ExtLiabilities) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.TrustLineEntryV1")
@js.native
object TrustLineEntryV1 extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TrustLineEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TrustLineEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TrustLineEntryV1 = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryV1): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryV1 = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryV1): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryV1, io: Buffer): Unit = js.native
}

