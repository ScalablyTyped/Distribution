package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInsertOp extends Op {
  var li: js.Any
  var p: Path
}

object ListInsertOp {
  @scala.inline
  def apply(li: js.Any, p: Path): ListInsertOp = {
    val __obj = js.Dynamic.literal(li = li, p = p)
  
    __obj.asInstanceOf[ListInsertOp]
  }
}

