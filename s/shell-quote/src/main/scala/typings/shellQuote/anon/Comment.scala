package typings.shellQuote.anon

import typings.shellQuote.mod._ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends _ParseEntry {
  var comment: String
}

object Comment {
  @scala.inline
  def apply(comment: String): Comment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

