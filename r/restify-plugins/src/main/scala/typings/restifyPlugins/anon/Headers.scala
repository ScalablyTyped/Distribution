package typings.restifyPlugins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Headers extends js.Object {
  var headers: js.Array[String]
}

object Headers {
  @scala.inline
  def apply(headers: js.Array[String]): Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

