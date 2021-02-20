package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NCommit extends StObject {
  
  var ballot: ScpBallot = js.native
  
  var nCommit: Double = js.native
  
  var nH: Double = js.native
  
  var nPrepared: Double = js.native
  
  var quorumSetHash: Buffer = js.native
}
object NCommit {
  
  @scala.inline
  def apply(ballot: ScpBallot, nCommit: Double, nH: Double, nPrepared: Double, quorumSetHash: Buffer): NCommit = {
    val __obj = js.Dynamic.literal(ballot = ballot.asInstanceOf[js.Any], nCommit = nCommit.asInstanceOf[js.Any], nH = nH.asInstanceOf[js.Any], nPrepared = nPrepared.asInstanceOf[js.Any], quorumSetHash = quorumSetHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[NCommit]
  }
  
  @scala.inline
  implicit class NCommitMutableBuilder[Self <: NCommit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBallot(value: ScpBallot): Self = StObject.set(x, "ballot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNCommit(value: Double): Self = StObject.set(x, "nCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNH(value: Double): Self = StObject.set(x, "nH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNPrepared(value: Double): Self = StObject.set(x, "nPrepared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = StObject.set(x, "quorumSetHash", value.asInstanceOf[js.Any])
  }
}
