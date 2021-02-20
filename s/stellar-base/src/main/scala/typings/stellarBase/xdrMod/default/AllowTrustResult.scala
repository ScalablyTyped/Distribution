package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.AllowTrustResult")
@js.native
class AllowTrustResult ()
  extends typings.stellarBase.xdrMod.xdr.AllowTrustResult
object AllowTrustResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.allowTrustSuccess")
  @js.native
  def allowTrustSuccess(): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AllowTrustResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AllowTrustResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AllowTrustResult, io: Buffer): Unit = js.native
}
