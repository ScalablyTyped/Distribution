package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Balance
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TrustLineEntry")
@js.native
class TrustLineEntry protected ()
  extends typings.stellarBase.mod.xdr.TrustLineEntry {
  def this(attributes: Balance) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.TrustLineEntry")
@js.native
object TrustLineEntry extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TrustLineEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TrustLineEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TrustLineEntry = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TrustLineEntry): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntry = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TrustLineEntry): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TrustLineEntry, io: Buffer): Unit = js.native
}

