package typings.semanticRelease.mod

import typings.semanticRelease.anon.Email
import typings.semanticRelease.anon.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  /**
    * The commit author information.
    */
  var author: Email
  /**
    * The commit body.
    */
  var body: String
  /**
    * The commit abbreviated and full hash.
    */
  var commit: Long
  /**
    * The committer information.
    */
  var committer: Email
  /**
    * The committer date.
    */
  var committerDate: String
  /**
    * The commit hash.
    */
  var hash: String
  /**
    * The commit full message (subject and body).
    */
  var message: String
  /**
    * The commit subject.
    */
  var subject: String
  /**
    * The commit abbreviated and full tree hash.
    */
  var tree: Long
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
}

