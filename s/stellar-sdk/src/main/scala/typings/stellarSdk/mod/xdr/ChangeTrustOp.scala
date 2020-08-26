package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Limit
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ChangeTrustOp")
@js.native
class ChangeTrustOp protected ()
  extends typings.stellarBase.mod.xdr.ChangeTrustOp {
  def this(attributes: Limit) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.ChangeTrustOp")
@js.native
object ChangeTrustOp extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustOp = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ChangeTrustOp, io: Buffer): Unit = js.native
}

