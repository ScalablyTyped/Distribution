package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NCommit extends js.Object {
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
  implicit class NCommitOps[Self <: NCommit] (val x: Self) extends AnyVal {
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
    def setNCommit(value: Double): Self = this.set("nCommit", value.asInstanceOf[js.Any])
    @scala.inline
    def setNH(value: Double): Self = this.set("nH", value.asInstanceOf[js.Any])
    @scala.inline
    def setNPrepared(value: Double): Self = this.set("nPrepared", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuorumSetHash(value: Buffer): Self = this.set("quorumSetHash", value.asInstanceOf[js.Any])
  }
  
}

