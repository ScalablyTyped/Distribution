package typings.sharedb.libSharedbMod

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
    val __obj = js.Dynamic.literal(o = o, p = p, t = t)
  
    __obj.asInstanceOf[SubtypeOp]
  }
}

