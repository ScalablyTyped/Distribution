package typings.stellarBase.mod

import typings.stellarBase.xdrMod.default.TransactionEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "FeeBumpTransaction")
@js.native
class FeeBumpTransaction protected () extends TransactionI {
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
  
  var feeSource: String = js.native
  
  var innerTransaction: Transaction[Memo[MemoType], js.Array[Operation]] = js.native
}
