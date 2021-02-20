package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset")
@js.native
class AllowTrustOpAsset ()
  extends typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset
object AllowTrustOpAsset {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.assetTypeCreditAlphanum12")
  @js.native
  def assetTypeCreditAlphanum12(value: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.assetTypeCreditAlphanum4")
  @js.native
  def assetTypeCreditAlphanum4(value: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustOpAsset.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AllowTrustOpAsset, io: Buffer): Unit = js.native
}
