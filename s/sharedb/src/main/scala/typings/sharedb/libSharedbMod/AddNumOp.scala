package typings.sharedb.libSharedbMod

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
    val __obj = js.Dynamic.literal(na = na, p = p)
  
    __obj.asInstanceOf[AddNumOp]
  }
}

