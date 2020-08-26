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
  @scala.inline
  implicit class GetRestApiEndpointConfigurationOps[Self <: GetRestApiEndpointConfiguration] (val x: Self) extends AnyVal {
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
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcEndpointIdsVarargs(value: String*): Self = this.set("vpcEndpointIds", js.Array(value :_*))
    @scala.inline
    def setVpcEndpointIds(value: js.Array[String]): Self = this.set("vpcEndpointIds", value.asInstanceOf[js.Any])
  }
  
}

