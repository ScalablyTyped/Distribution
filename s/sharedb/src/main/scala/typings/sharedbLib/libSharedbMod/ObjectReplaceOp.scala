package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectReplaceOp extends Op {
  var od: js.Any
  var oi: js.Any
  var p: Path
}

object ObjectReplaceOp {
  @scala.inline
  def apply(od: js.Any, oi: js.Any, p: Path): ObjectReplaceOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("od")(od)
    __obj.updateDynamic("oi")(oi)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ObjectReplaceOp]
  }
}

