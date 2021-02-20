package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.Weight
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.Signer")
@js.native
class Signer protected ()
  extends typings.stellarBase.xdrMod.xdr.Signer {
  def this(attributes: Weight) = this()
}
object Signer {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Signer = js.native
  @JSImport("stellar-base/types/xdr", "default.Signer.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Signer = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Signer = js.native
  @JSImport("stellar-base/types/xdr", "default.Signer.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Signer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Signer): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Signer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Signer): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Signer.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.Signer.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.Signer.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Signer, io: Buffer): Unit = js.native
}
