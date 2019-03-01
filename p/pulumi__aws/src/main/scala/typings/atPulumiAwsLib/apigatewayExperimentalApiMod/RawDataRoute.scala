package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawDataRoute extends Route {
  var data: js.Any
  var method: Method
  var path: java.lang.String
}

object RawDataRoute {
  @scala.inline
  def apply(data: js.Any, method: Method, path: java.lang.String): RawDataRoute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RawDataRoute]
  }
}

