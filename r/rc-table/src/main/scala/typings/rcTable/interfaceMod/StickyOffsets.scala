package typings.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StickyOffsets extends js.Object {
  var left: js.Array[Double]
  var right: js.Array[Double]
}

object StickyOffsets {
  @scala.inline
  def apply(left: js.Array[Double], right: js.Array[Double]): StickyOffsets = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StickyOffsets]
  }
}

