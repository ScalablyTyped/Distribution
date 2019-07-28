package typings.sharedb.libSharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDeleteOp extends Op {
  var p: Path
  var sd: String
}

object StringDeleteOp {
  @scala.inline
  def apply(p: Path, sd: String): StringDeleteOp = {
    val __obj = js.Dynamic.literal(p = p, sd = sd)
  
    __obj.asInstanceOf[StringDeleteOp]
  }
}

