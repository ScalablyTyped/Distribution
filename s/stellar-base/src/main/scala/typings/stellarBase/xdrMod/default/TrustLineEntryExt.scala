package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt")
@js.native
class TrustLineEntryExt ()
  extends typings.stellarBase.xdrMod.xdr.TrustLineEntryExt
object TrustLineEntryExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TrustLineEntryExt.1")
  @js.native
  def `1`(value: typings.stellarBase.xdrMod.xdr.TrustLineEntryV1): typings.stellarBase.xdrMod.xdr.TrustLineEntryExt = js.native
}
