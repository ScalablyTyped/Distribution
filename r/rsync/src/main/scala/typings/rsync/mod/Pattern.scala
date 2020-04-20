package typings.rsync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern extends js.Object {
  var action: String
  var pattern: String
}

object Pattern {
  @scala.inline
  def apply(action: String, pattern: String): Pattern = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
}

