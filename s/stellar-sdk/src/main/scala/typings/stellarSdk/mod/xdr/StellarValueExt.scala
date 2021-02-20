package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.StellarValueExt")
@js.native
class StellarValueExt ()
  extends typings.stellarBase.mod.xdr.StellarValueExt
object StellarValueExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-sdk", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  @JSImport("stellar-sdk", "xdr.StellarValueExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.stellarValueBasic")
  @js.native
  def stellarValueBasic(): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.stellarValueSigned")
  @js.native
  def stellarValueSigned(value: typings.stellarBase.xdrMod.xdr.LedgerCloseValueSignature): typings.stellarBase.xdrMod.xdr.StellarValueExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.StellarValueExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.StellarValueExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.StellarValueExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.StellarValueExt, io: Buffer): Unit = js.native
}
