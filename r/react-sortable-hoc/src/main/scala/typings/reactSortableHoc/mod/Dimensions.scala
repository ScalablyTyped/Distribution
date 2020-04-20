package typings.reactSortableHoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimensions extends js.Object {
  var height: Double
  var width: Double
}

object Dimensions {
  @scala.inline
  def apply(height: Double, width: Double): Dimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
}

