package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.ScpEnvelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages extends StObject {
  
  var ledgerSeq: Double = js.native
  
  var messages: js.Array[ScpEnvelope] = js.native
}
object Messages {
  
  @scala.inline
  def apply(ledgerSeq: Double, messages: js.Array[ScpEnvelope]): Messages = {
    val __obj = js.Dynamic.literal(ledgerSeq = ledgerSeq.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit class MessagesMutableBuilder[Self <: Messages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLedgerSeq(value: Double): Self = StObject.set(x, "ledgerSeq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: js.Array[ScpEnvelope]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: ScpEnvelope*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
