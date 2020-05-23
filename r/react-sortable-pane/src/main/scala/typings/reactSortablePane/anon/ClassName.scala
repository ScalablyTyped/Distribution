package typings.reactSortablePane.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassName extends js.Object {
  var className: String
  var grid: js.Array[Double]
  var maxHeight: js.UndefOr[scala.Nothing] = js.undefined
  var maxWidth: js.UndefOr[scala.Nothing] = js.undefined
  var minHeight: Double
  var minWidth: Double
  var resizable: X
}

object ClassName {
  @scala.inline
  def apply(className: String, grid: js.Array[Double], minHeight: Double, minWidth: Double, resizable: X): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
}

