package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubtypeOp extends Op {
  var o: js.Any
  var p: Path
  var t: String
}

object SubtypeOp {
  @scala.inline
  def apply(o: js.Any, p: Path, t: String): SubtypeOp = {
    val __obj = js.Dynamic.literal(o = o.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SubtypeOp]
  }
}

