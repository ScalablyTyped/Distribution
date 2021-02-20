package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.StellarValueExt")
@js.native
class StellarValueExt ()
  extends typings.stellarBase.xdrMod.default.StellarValueExt
object StellarValueExt {
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.stellarValueBasic")
  @js.native
  def stellarValueBasic(): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.stellarValueSigned")
  @js.native
  def stellarValueSigned(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.StellarValueExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarValueExt, io: Buffer): Unit = js.native
}
