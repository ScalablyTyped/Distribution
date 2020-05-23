package typings.shellQuote.anon

import typings.shellQuote.mod._ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Op extends _ParseEntry {
  var op: String
}

object Op {
  @scala.inline
  def apply(op: String): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
}

