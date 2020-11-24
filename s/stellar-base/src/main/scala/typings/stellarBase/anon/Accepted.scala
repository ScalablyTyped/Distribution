package typings.stellarBase.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accepted extends js.Object {
  
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
  implicit class AcceptedOps[Self <: Accepted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptedVarargs(value: Buffer*): Self = this.set("accepted", js.Array(value :_*))
    
    @scala.inline
    def setAccepted(value: js.Array[Buffer]): Self = this.set("accepted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = this.set("quorumSetHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVotesVarargs(value: Buffer*): Self = this.set("votes", js.Array(value :_*))
    
    @scala.inline
    def setVotes(value: js.Array[Buffer]): Self = this.set("votes", value.asInstanceOf[js.Any])
  }
}
