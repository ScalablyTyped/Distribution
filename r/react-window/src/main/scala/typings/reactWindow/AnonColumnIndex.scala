package typings.reactWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnIndex extends js.Object {
  var columnIndex: Double
  var data: js.Any
  var rowIndex: Double
}

object AnonColumnIndex {
  @scala.inline
  def apply(columnIndex: Double, data: js.Any, rowIndex: Double): AnonColumnIndex = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumnIndex]
  }
}

