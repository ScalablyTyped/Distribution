package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListReplaceOp extends Op {
  var ld: js.Any
  var li: js.Any
  var p: Path
}

object ListReplaceOp {
  @scala.inline
  def apply(ld: js.Any, li: js.Any, p: Path): ListReplaceOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ld")(ld)
    __obj.updateDynamic("li")(li)
    __obj.updateDynamic("p")(p)
    __obj.asInstanceOf[ListReplaceOp]
  }
}

