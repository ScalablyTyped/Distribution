package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.Curve25519Secret")
@js.native
class Curve25519Secret protected ()
  extends typings.stellarBase.xdrMod.default.Curve25519Secret {
  def this(attributes: Key) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.Curve25519Secret")
@js.native
object Curve25519Secret extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret, io: Buffer): Unit = js.native
}
