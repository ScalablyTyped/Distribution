package typings.restfulJs

import typings.restfulJs.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[T] extends js.Object {
  var data: T
  var headers: Headers
  var status: Double
  var statusText: String
}

object AnonData {
  @scala.inline
  def apply[T](data: T, headers: Headers, status: Double, statusText: String): AnonData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[T]]
  }
}

