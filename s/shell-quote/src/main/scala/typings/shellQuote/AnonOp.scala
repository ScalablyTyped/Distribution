package typings.shellQuote

import typings.shellQuote.mod._ParseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOp extends _ParseEntry {
  var op: String
}

object AnonOp {
  @scala.inline
  def apply(op: String): AnonOp = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOp]
  }
}

