package typings.reactTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[D /* <: js.Object */] extends js.Object {
  var data: js.Array[D]
  var depth: Double
  var subRows: js.Array[D]
}

object Data {
  @scala.inline
  def apply[/* <: js.Object */ D](data: js.Array[D], depth: Double, subRows: js.Array[D]): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
}

