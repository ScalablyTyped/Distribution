package typings.reactDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[D /* <: js.Object */] extends js.Object {
  var data: js.Array[D]
  var depth: Double
  var subRows: js.Array[D]
}

object Anon_Data {
  @scala.inline
  def apply[D /* <: js.Object */](data: js.Array[D], depth: Double, subRows: js.Array[D]): Anon_Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Data[D]]
  }
}

