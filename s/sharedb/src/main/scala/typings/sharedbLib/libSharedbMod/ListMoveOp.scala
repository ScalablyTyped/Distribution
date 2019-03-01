package typings
package sharedbLib.libSharedbMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lm")(lm)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ListMoveOp]
  }
}

