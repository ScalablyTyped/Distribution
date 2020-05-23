package typings.pulumiAws.outputMod.globalaccelerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointGroupEndpointConfiguration extends js.Object {
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID.
    */
  var endpointId: js.UndefOr[String] = js.native
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify.
    */
  var weight: js.UndefOr[Double] = js.native
}

object EndpointGroupEndpointConfiguration {
  @scala.inline
  def apply(endpointId: String = null, weight: js.UndefOr[Double] = js.undefined): EndpointGroupEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointGroupEndpointConfiguration]
  }
}

