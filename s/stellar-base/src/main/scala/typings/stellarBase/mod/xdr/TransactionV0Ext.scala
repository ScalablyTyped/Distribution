package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionV0Ext")
@js.native
class TransactionV0Ext ()
  extends typings.stellarBase.xdrMod.default.TransactionV0Ext
object TransactionV0Ext {
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionV0Ext): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionV0Ext): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionV0Ext.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionV0Ext, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionV0Ext.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.TransactionV0Ext = js.native
}
