package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commit extends StObject {
  
  var commit: ScpBallot = js.native
  
  var commitQuorumSetHash: Buffer = js.native
  
  var nH: Double = js.native
}
object Commit {
  
  @scala.inline
  def apply(commit: ScpBallot, commitQuorumSetHash: Buffer, nH: Double): Commit = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], commitQuorumSetHash = commitQuorumSetHash.asInstanceOf[js.Any], nH = nH.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commit]
  }
  
  @scala.inline
  implicit class CommitMutableBuilder[Self <: Commit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommit(value: ScpBallot): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitQuorumSetHash(value: Buffer): Self = StObject.set(x, "commitQuorumSetHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNH(value: Double): Self = StObject.set(x, "nH", value.asInstanceOf[js.Any])
  }
}
