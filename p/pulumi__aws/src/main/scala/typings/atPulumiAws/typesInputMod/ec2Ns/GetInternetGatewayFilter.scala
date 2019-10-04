package typings.atPulumiAws.typesInputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInternetGatewayFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInternetGateways.html).
    */
  var name: String
  /**
    * Set of values that are accepted for the given field.
    * An Internet Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String]
}

object GetInternetGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetInternetGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetInternetGatewayFilter]
  }
}

