package typings.restfulJs

import typings.restfulJs.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders[T] extends js.Object {
  var data: js.Array[T]
  var headers: Headers
  var status: Double
  var statusText: String
}

object AnonHeaders {
  @scala.inline
  def apply[T](data: js.Array[T], headers: Headers, status: Double, statusText: String): AnonHeaders[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeaders[T]]
  }
}

