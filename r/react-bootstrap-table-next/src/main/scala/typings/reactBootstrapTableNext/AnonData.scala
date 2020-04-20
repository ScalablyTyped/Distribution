package typings.reactBootstrapTableNext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[T /* <: js.Object */] extends js.Object {
  var data: js.Array[T]
}

object AnonData {
  @scala.inline
  def apply[T /* <: js.Object */](data: js.Array[T]): AnonData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[T]]
  }
}

