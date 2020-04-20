package typings.shellQuote

import typings.shellQuote.mod._ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComment extends _ParseEntry {
  var comment: String
}

object AnonComment {
  @scala.inline
  def apply(comment: String): AnonComment = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComment]
  }
}

