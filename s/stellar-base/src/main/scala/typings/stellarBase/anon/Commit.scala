package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.ScpBallot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends js.Object {
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
  implicit class CommitOps[Self <: Commit] (val x: Self) extends AnyVal {
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
    def setCommit(value: ScpBallot): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitQuorumSetHash(value: Buffer): Self = this.set("commitQuorumSetHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setNH(value: Double): Self = this.set("nH", value.asInstanceOf[js.Any])
  }
  
}

