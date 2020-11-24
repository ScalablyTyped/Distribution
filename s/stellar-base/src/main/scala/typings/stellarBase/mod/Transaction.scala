package typings.stellarBase.mod

import typings.stellarBase.anon.MinTime
import typings.stellarBase.xdrMod.default.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "Transaction")
@js.native
class Transaction[TMemo /* <: Memo[MemoType] */, TOps /* <: js.Array[Operation] */] protected () extends TransactionI {
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
  
  var memo: TMemo = js.native
  
  var operations: TOps = js.native
  
  var sequence: String = js.native
  
  var source: String = js.native
  
  var timeBounds: js.UndefOr[MinTime] = js.native
}
