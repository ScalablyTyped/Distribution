package typings.restify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders extends js.Object {
  var headers: js.Array[String]
}

object AnonHeaders {
  @scala.inline
  def apply(headers: js.Array[String]): AnonHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}

