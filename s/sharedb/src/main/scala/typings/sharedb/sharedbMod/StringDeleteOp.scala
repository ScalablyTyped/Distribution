package typings.sharedb.sharedbMod

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
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], sd = sd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StringDeleteOp]
  }
}

