package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInternetGatewayFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInternetGateways.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given field.
    * An Internet Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}

object GetInternetGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInternetGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInternetGatewayFilter]
  }
}

