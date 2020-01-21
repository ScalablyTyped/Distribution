package typings.sharedb.sharedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddNumOp extends Op {
  var na: Double
  var p: Path
}

object AddNumOp {
  @scala.inline
  def apply(na: Double, p: Path): AddNumOp = {
    val __obj = js.Dynamic.literal(na = na.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddNumOp]
  }
}

