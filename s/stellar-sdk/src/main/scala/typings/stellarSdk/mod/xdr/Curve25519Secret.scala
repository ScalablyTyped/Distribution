package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Key
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Curve25519Secret")
@js.native
class Curve25519Secret protected ()
  extends typings.stellarBase.mod.xdr.Curve25519Secret {
  def this(attributes: Key) = this()
}
object Curve25519Secret {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Curve25519Secret = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Curve25519Secret.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Curve25519Secret, io: Buffer): Unit = js.native
}
