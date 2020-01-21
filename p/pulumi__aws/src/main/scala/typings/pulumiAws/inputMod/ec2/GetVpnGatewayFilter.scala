package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnGatewayFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpnGateways.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given field.
    * A VPN Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}

object GetVpnGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpnGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpnGatewayFilter]
  }
}

