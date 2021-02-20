package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.InnerTransactionResultResult")
@js.native
class InnerTransactionResultResult ()
  extends typings.stellarBase.xdrMod.default.InnerTransactionResultResult
object InnerTransactionResultResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadAuth")
  @js.native
  def txBadAuth(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadAuthExtra")
  @js.native
  def txBadAuthExtra(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadSeq")
  @js.native
  def txBadSeq(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txBadSponsorship")
  @js.native
  def txBadSponsorship(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txFailed")
  @js.native
  def txFailed(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInsufficientBalance")
  @js.native
  def txInsufficientBalance(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInsufficientFee")
  @js.native
  def txInsufficientFee(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txInternalError")
  @js.native
  def txInternalError(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txMissingOperation")
  @js.native
  def txMissingOperation(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txNoAccount")
  @js.native
  def txNoAccount(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txNotSupported")
  @js.native
  def txNotSupported(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txSuccess")
  @js.native
  def txSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txTooEarly")
  @js.native
  def txTooEarly(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.txTooLate")
  @js.native
  def txTooLate(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.InnerTransactionResultResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult, io: Buffer): Unit = js.native
}
