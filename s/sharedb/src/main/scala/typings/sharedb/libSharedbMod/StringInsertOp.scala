package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringInsertOp extends Op {
  var p: Path
  var si: String
}

object StringInsertOp {
  @scala.inline
  def apply(p: Path, si: String): StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringInsertOp]
  }
}

