package typings.pulumiAws.inputMod.apigateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestApiEndpointConfiguration extends js.Object {
  /**
    * A list of endpoint types. This resource currently only supports managing a single value. Valid values: `EDGE`, `REGIONAL` or `PRIVATE`. If unspecified, defaults to `EDGE`. Must be declared as `REGIONAL` in non-Commercial partitions. Refer to the [documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/create-regional-api.html) for more information on the difference between edge-optimized and regional APIs.
    */
  var types: Input[String] = js.native
  /**
    * A list of VPC Endpoint Ids. It is only supported for PRIVATE endpoint type.
    */
  var vpcEndpointIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object RestApiEndpointConfiguration {
  @scala.inline
  def apply(types: Input[String], vpcEndpointIds: Input[js.Array[Input[String]]] = null): RestApiEndpointConfiguration = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    if (vpcEndpointIds != null) __obj.updateDynamic("vpcEndpointIds")(vpcEndpointIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiEndpointConfiguration]
  }
}

