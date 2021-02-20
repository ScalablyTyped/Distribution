package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult")
@js.native
class InnerTransactionResultResult ()
  extends typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult
object InnerTransactionResultResult {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txBadAuth")
  @js.native
  def txBadAuth(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txBadAuthExtra")
  @js.native
  def txBadAuthExtra(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txBadSeq")
  @js.native
  def txBadSeq(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txBadSponsorship")
  @js.native
  def txBadSponsorship(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txFailed")
  @js.native
  def txFailed(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txInsufficientBalance")
  @js.native
  def txInsufficientBalance(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txInsufficientFee")
  @js.native
  def txInsufficientFee(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txInternalError")
  @js.native
  def txInternalError(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txMissingOperation")
  @js.native
  def txMissingOperation(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txNoAccount")
  @js.native
  def txNoAccount(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txNotSupported")
  @js.native
  def txNotSupported(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txSuccess")
  @js.native
  def txSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txTooEarly")
  @js.native
  def txTooEarly(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.txTooLate")
  @js.native
  def txTooLate(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.InnerTransactionResultResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult, io: Buffer): Unit = js.native
}
