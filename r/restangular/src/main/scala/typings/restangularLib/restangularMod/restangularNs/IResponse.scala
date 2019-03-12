package typings
package restangularLib.restangularMod.restangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  var config: restangularLib.Anon_Method
  var data: js.Any
  var status: scala.Double
  def headers(name: java.lang.String): java.lang.String
}

object IResponse {
  @scala.inline
  def apply(
    config: restangularLib.Anon_Method,
    data: js.Any,
    headers: java.lang.String => java.lang.String,
    status: scala.Double
  ): IResponse = {
    val __obj = js.Dynamic.literal(config = config, data = data, headers = js.Any.fromFunction1(headers), status = status)
  
    __obj.asInstanceOf[IResponse]
  }
}

