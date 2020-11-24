package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Curve25519Public")
@js.native
class Curve25519Public protected ()
  extends typings.stellarBase.mod.xdr.Curve25519Public {
  def this(attributes: Key) = this()
}
/* static members */
@JSImport("stellar-sdk", "xdr.Curve25519Public")
@js.native
object Curve25519Public extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.Curve25519Public): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Public = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Curve25519Public): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.Curve25519Public, io: Buffer): Unit = js.native
}
