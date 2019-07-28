package typings.rsync.rsyncMod

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
    val __obj = js.Dynamic.literal(action = action, pattern = pattern)
  
    __obj.asInstanceOf[Pattern]
  }
}

