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
  def apply(types: Input[String]): RestApiEndpointConfiguration = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestApiEndpointConfiguration]
  }
  @scala.inline
  implicit class RestApiEndpointConfigurationOps[Self <: RestApiEndpointConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTypes(value: Input[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcEndpointIdsVarargs(value: Input[String]*): Self = this.set("vpcEndpointIds", js.Array(value :_*))
    @scala.inline
    def setVpcEndpointIds(value: Input[js.Array[Input[String]]]): Self = this.set("vpcEndpointIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcEndpointIds: Self = this.set("vpcEndpointIds", js.undefined)
  }
  
}

