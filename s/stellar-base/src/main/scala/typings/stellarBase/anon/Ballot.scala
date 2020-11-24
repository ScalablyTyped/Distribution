package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ballot extends js.Object {
  
  var ballot: ScpBallot = js.native
  
  var nC: Double = js.native
  
  var nH: Double = js.native
  
  var prepared: Null | ScpBallot = js.native
  
  var preparedPrime: Null | ScpBallot = js.native
  
  var quorumSetHash: Buffer = js.native
}
object Ballot {
  
  @scala.inline
  def apply(ballot: ScpBallot, nC: Double, nH: Double, quorumSetHash: Buffer): Ballot = {
    val __obj = js.Dynamic.literal(ballot = ballot.asInstanceOf[js.Any], nC = nC.asInstanceOf[js.Any], nH = nH.asInstanceOf[js.Any], quorumSetHash = quorumSetHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ballot]
  }
  
  @scala.inline
  implicit class BallotOps[Self <: Ballot] (val x: Self) extends AnyVal {
    
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
    def setBallot(value: ScpBallot): Self = this.set("ballot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNC(value: Double): Self = this.set("nC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNH(value: Double): Self = this.set("nH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = this.set("quorumSetHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepared(value: ScpBallot): Self = this.set("prepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreparedNull: Self = this.set("prepared", null)
    
    @scala.inline
    def setPreparedPrime(value: ScpBallot): Self = this.set("preparedPrime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreparedPrimeNull: Self = this.set("preparedPrime", null)
  }
}
