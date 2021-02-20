package typings.stellarBase.anon

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accepted extends StObject {
  
  var accepted: js.Array[Buffer] = js.native
  
  var quorumSetHash: Buffer = js.native
  
  var votes: js.Array[Buffer] = js.native
}
object Accepted {
  
  @scala.inline
  def apply(accepted: js.Array[Buffer], quorumSetHash: Buffer, votes: js.Array[Buffer]): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any], quorumSetHash = quorumSetHash.asInstanceOf[js.Any], votes = votes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  
  @scala.inline
  implicit class AcceptedMutableBuilder[Self <: Accepted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccepted(value: js.Array[Buffer]): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptedVarargs(value: Buffer*): Self = StObject.set(x, "accepted", js.Array(value :_*))
    
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = StObject.set(x, "quorumSetHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotes(value: js.Array[Buffer]): Self = StObject.set(x, "votes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotesVarargs(value: Buffer*): Self = StObject.set(x, "votes", js.Array(value :_*))
  }
}
