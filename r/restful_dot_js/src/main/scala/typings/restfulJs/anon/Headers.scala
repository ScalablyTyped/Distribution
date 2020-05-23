package typings.restfulJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers[T] extends js.Object {
  var data: js.Array[T]
  var headers: typings.restfulJs.mod.Headers
  var status: Double
  var statusText: String
}

object Headers {
  @scala.inline
  def apply[T](data: js.Array[T], headers: typings.restfulJs.mod.Headers, status: Double, statusText: String): Headers[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers[T]]
  }
}

