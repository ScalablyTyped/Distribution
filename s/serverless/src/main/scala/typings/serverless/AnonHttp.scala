package typings.serverless

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHttp[T /* <: js.Object */] extends js.Object {
  var http: T | String
}

object AnonHttp {
  @scala.inline
  def apply[T /* <: js.Object */](http: T | String): AnonHttp[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHttp[T]]
  }
}

