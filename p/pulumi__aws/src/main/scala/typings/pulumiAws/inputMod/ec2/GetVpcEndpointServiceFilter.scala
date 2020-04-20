package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcEndpointServiceFilter extends js.Object {
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeVpcEndpointServices API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcEndpointServices.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given filter field. Results will be selected if any given value matches.
    */
  var values: js.Array[String] = js.native
}

object GetVpcEndpointServiceFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcEndpointServiceFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcEndpointServiceFilter]
  }
}

