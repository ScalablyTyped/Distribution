package typings
package sharedbLib.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDeleteOp extends Op {
  var p: Path
  var sd: java.lang.String
}

object StringDeleteOp {
  @scala.inline
  def apply(p: Path, sd: java.lang.String): StringDeleteOp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("p")(p)
    __obj.updateDynamic("sd")(sd)
    __obj.asInstanceOf[StringDeleteOp]
  }
}

