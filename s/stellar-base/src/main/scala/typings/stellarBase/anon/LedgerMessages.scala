package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.LedgerScpMessages
import typings.stellarBase.xdrMod.xdr.ScpQuorumSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LedgerMessages extends StObject {
  
  var ledgerMessages: LedgerScpMessages = js.native
  
  var quorumSets: js.Array[ScpQuorumSet] = js.native
}
object LedgerMessages {
  
  @scala.inline
  def apply(ledgerMessages: LedgerScpMessages, quorumSets: js.Array[ScpQuorumSet]): LedgerMessages = {
    val __obj = js.Dynamic.literal(ledgerMessages = ledgerMessages.asInstanceOf[js.Any], quorumSets = quorumSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerMessages]
  }
  
  @scala.inline
  implicit class LedgerMessagesMutableBuilder[Self <: LedgerMessages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgerMessages(value: LedgerScpMessages): Self = StObject.set(x, "ledgerMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuorumSets(value: js.Array[ScpQuorumSet]): Self = StObject.set(x, "quorumSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuorumSetsVarargs(value: ScpQuorumSet*): Self = StObject.set(x, "quorumSets", js.Array(value :_*))
  }
}
