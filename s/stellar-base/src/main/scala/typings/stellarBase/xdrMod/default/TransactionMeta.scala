package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TransactionMeta")
@js.native
class TransactionMeta ()
  extends typings.stellarBase.xdrMod.xdr.TransactionMeta
object TransactionMeta {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionMeta): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionMeta): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionMeta, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.0")
  @js.native
  def `0`(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationMeta]): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.1")
  @js.native
  def `1`(value: typings.stellarBase.xdrMod.xdr.TransactionMetaV1): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionMeta.2")
  @js.native
  def `2`(value: typings.stellarBase.xdrMod.xdr.TransactionMetaV2): typings.stellarBase.xdrMod.xdr.TransactionMeta = js.native
}
