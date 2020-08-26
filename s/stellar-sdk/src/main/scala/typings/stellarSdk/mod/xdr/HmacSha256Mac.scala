package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.MacBuffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.HmacSha256Mac")
@js.native
class HmacSha256Mac protected ()
  extends typings.stellarBase.mod.xdr.HmacSha256Mac {
  def this(attributes: MacBuffer) = this()
}

/* static members */
@JSImport("stellar-sdk", "xdr.HmacSha256Mac")
@js.native
object HmacSha256Mac extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.HmacSha256Mac): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.HmacSha256Mac = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.HmacSha256Mac): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.HmacSha256Mac, io: Buffer): Unit = js.native
}

