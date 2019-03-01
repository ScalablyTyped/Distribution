package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectInsertOp extends Op {
  var oi: js.Any
  var p: Path
}

object ObjectInsertOp {
  @scala.inline
  def apply(oi: js.Any, p: Path): ObjectInsertOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oi")(oi)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ObjectInsertOp]
  }
}

