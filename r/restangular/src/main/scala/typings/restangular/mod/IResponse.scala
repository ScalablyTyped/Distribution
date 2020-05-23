package typings.restangular.mod

import typings.restangular.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var config: Method
  var data: js.Any
  var status: Double
  def headers(name: String): String
}

object IResponse {
  @scala.inline
  def apply(config: Method, data: js.Any, headers: String => String, status: Double): IResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = js.Any.fromFunction1(headers), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponse]
  }
}

