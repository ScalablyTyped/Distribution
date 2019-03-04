package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringInsertOp extends Op {
  var p: Path
  var si: java.lang.String
}

object StringInsertOp {
  @scala.inline
  def apply(p: Path, si: java.lang.String): StringInsertOp = {
    val __obj = js.Dynamic.literal(p = p, si = si)
  
    __obj.asInstanceOf[StringInsertOp]
  }
}

