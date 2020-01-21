package typings.reactNativeMaterialDropdown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownOffset extends js.Object {
  /** Left offset */
  var left: Double
  /** Top offset */
  var top: Double
}

object DropDownOffset {
  @scala.inline
  def apply(left: Double, top: Double): DropDownOffset = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DropDownOffset]
  }
}

