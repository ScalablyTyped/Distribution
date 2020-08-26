package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.ChangeTrustResult")
@js.native
class ChangeTrustResult ()
  extends typings.stellarBase.mod.xdr.ChangeTrustResult

/* static members */
@JSImport("stellar-sdk", "xdr.ChangeTrustResult")
@js.native
object ChangeTrustResult extends js.Object {
  def changeTrustSuccess(): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ChangeTrustResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ChangeTrustResult, io: Buffer): Unit = js.native
}

