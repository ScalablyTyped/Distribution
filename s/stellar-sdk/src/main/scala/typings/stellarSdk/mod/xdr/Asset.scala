package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.Asset")
@js.native
class Asset ()
  extends typings.stellarBase.mod.xdr.Asset
object Asset {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.assetTypeCreditAlphanum12")
  @js.native
  def assetTypeCreditAlphanum12(value: typings.stellarBase.xdrMod.xdr.AssetAlphaNum12): typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.assetTypeCreditAlphanum4")
  @js.native
  def assetTypeCreditAlphanum4(value: typings.stellarBase.xdrMod.xdr.AssetAlphaNum4): typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.assetTypeNative")
  @js.native
  def assetTypeNative(): typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Asset = js.native
  @JSImport("stellar-sdk", "xdr.Asset.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Asset = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Asset = js.native
  @JSImport("stellar-sdk", "xdr.Asset.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Asset): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Asset = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Asset): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Asset.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.Asset.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.Asset.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Asset, io: Buffer): Unit = js.native
}
