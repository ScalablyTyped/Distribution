package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDeleteOp extends Op {
  var ld: js.Any
  var p: Path
}

object ListDeleteOp {
  @scala.inline
  def apply(ld: js.Any, p: Path): ListDeleteOp = {
    val __obj = js.Dynamic.literal(ld = ld, p = p)
  
    __obj.asInstanceOf[ListDeleteOp]
  }
}

