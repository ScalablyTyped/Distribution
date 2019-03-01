package typings
package sharedbLib.libSharedbMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("od")(od)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ObjectDeleteOp]
  }
}

