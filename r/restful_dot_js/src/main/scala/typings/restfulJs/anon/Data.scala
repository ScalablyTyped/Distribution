package typings.restfulJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T] extends js.Object {
  var data: T
  var headers: typings.restfulJs.mod.Headers
  var status: Double
  var statusText: String
}

object Data {
  @scala.inline
  def apply[T](data: T, headers: typings.restfulJs.mod.Headers, status: Double, statusText: String): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

