package typings.reactTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubRows extends js.Object {
  var data: js.Array[js.Object]
  var depth: Double
  var subRows: js.Array[js.Object]
}

object AnonSubRows {
  @scala.inline
  def apply(data: js.Array[js.Object], depth: Double, subRows: js.Array[js.Object]): AnonSubRows = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSubRows]
  }
}

