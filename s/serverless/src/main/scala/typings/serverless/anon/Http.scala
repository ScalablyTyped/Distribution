package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Http[T /* <: js.Object */] extends js.Object {
  var http: T | String
}

object Http {
  @scala.inline
  def apply[/* <: js.Object */ T](http: T | String): Http[T] = {
    val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[Http[T]]
  }
}

