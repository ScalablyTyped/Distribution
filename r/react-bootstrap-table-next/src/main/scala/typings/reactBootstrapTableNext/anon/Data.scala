package typings.reactBootstrapTableNext.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T /* <: js.Object */] extends js.Object {
  var data: js.Array[T]
}

object Data {
  @scala.inline
  def apply[/* <: js.Object */ T](data: js.Array[T]): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

