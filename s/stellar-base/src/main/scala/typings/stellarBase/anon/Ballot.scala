package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ballot extends StObject {
  
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
  implicit class BallotMutableBuilder[Self <: Ballot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBallot(value: ScpBallot): Self = StObject.set(x, "ballot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNC(value: Double): Self = StObject.set(x, "nC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNH(value: Double): Self = StObject.set(x, "nH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepared(value: ScpBallot): Self = StObject.set(x, "prepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreparedNull: Self = StObject.set(x, "prepared", null)
    
    @scala.inline
    def setPreparedPrime(value: ScpBallot): Self = StObject.set(x, "preparedPrime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreparedPrimeNull: Self = StObject.set(x, "preparedPrime", null)
    
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = StObject.set(x, "quorumSetHash", value.asInstanceOf[js.Any])
  }
}
