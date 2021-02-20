package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt")
@js.native
class InnerTransactionResultExt ()
  extends typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt
object InnerTransactionResultExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
}
