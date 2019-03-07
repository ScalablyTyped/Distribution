package typings
package atPulumiAwsLib.apigatewayExperimentalApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyRoute extends Route {
  var path: java.lang.String
  var target: java.lang.String | atPulumiPulumiLib.outputMod.Output[Endpoint]
}

object ProxyRoute {
  @scala.inline
  def apply(path: java.lang.String, target: java.lang.String | atPulumiPulumiLib.outputMod.Output[Endpoint]): ProxyRoute = {
    val __obj = js.Dynamic.literal(path = path, target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProxyRoute]
  }
}

