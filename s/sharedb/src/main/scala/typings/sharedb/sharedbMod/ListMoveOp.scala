package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMoveOp extends Op {
  var lm: js.Any
  var p: Path
}

object ListMoveOp {
  @scala.inline
  def apply(lm: js.Any, p: Path): ListMoveOp = {
    val __obj = js.Dynamic.literal(lm = lm.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMoveOp]
  }
}

