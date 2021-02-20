package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.TransactionResultResult")
@js.native
class TransactionResultResult ()
  extends typings.stellarBase.xdrMod.xdr.TransactionResultResult
object TransactionResultResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.txFailed")
  @js.native
  def txFailed(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.txFeeBumpInnerFailed")
  @js.native
  def txFeeBumpInnerFailed(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.txFeeBumpInnerSuccess")
  @js.native
  def txFeeBumpInnerSuccess(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.txSuccess")
  @js.native
  def txSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.TransactionResultResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult, io: Buffer): Unit = js.native
}
