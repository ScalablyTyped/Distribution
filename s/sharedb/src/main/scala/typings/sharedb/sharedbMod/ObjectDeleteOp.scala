package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectDeleteOp extends Op {
  var od: js.Any
  var p: Path
}

object ObjectDeleteOp {
  @scala.inline
  def apply(od: js.Any, p: Path): ObjectDeleteOp = {
    val __obj = js.Dynamic.literal(od = od.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDeleteOp]
  }
}

