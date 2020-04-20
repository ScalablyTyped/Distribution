package typings.pulumiAws.outputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRestApiEndpointConfiguration extends js.Object {
  var types: js.Array[String] = js.native
  var vpcEndpointIds: js.Array[String] = js.native
}

object GetRestApiEndpointConfiguration {
  @scala.inline
  def apply(types: js.Array[String], vpcEndpointIds: js.Array[String]): GetRestApiEndpointConfiguration = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], vpcEndpointIds = vpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRestApiEndpointConfiguration]
  }
}

