package typings.semanticRelease.mod

import typings.semanticRelease.anon.Email
import typings.semanticRelease.anon.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends js.Object {
  /**
    * The commit author information.
    */
  var author: Email = js.native
  /**
    * The commit body.
    */
  var body: String = js.native
  /**
    * The commit abbreviated and full hash.
    */
  var commit: Long = js.native
  /**
    * The committer information.
    */
  var committer: Email = js.native
  /**
    * The committer date.
    */
  var committerDate: String = js.native
  /**
    * The commit hash.
    */
  var hash: String = js.native
  /**
    * The commit full message (subject and body).
    */
  var message: String = js.native
  /**
    * The commit subject.
    */
  var subject: String = js.native
  /**
    * The commit abbreviated and full tree hash.
    */
  var tree: Long = js.native
}

object Commit {
  @scala.inline
  def apply(
    author: Email,
    body: String,
    commit: Long,
    committer: Email,
    committerDate: String,
    hash: String,
    message: String,
    subject: String,
    tree: Long
  ): Commit = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], committer = committer.asInstanceOf[js.Any], committerDate = committerDate.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
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
    def setAuthor(value: Email): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: Long): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitter(value: Email): Self = this.set("committer", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitterDate(value: String): Self = this.set("committerDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: Long): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
  
}

