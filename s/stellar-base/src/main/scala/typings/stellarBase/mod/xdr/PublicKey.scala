package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.PublicKey")
@js.native
class PublicKey ()
  extends typings.stellarBase.xdrMod.default.PublicKey
object PublicKey {
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSImport("stellar-base", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  @JSImport("stellar-base", "xdr.PublicKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.PublicKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.publicKeyTypeEd25519")
  @js.native
  def publicKeyTypeEd25519(value: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.PublicKey = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.PublicKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.PublicKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.PublicKey.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.PublicKey, io: Buffer): Unit = js.native
}
