package typings.atPulumiAws.typesInputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNatGatewayFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNatGateways.html).
    */
  var name: String
  /**
    * Set of values that are accepted for the given field.
    * An Nat Gateway will be selected if any one of the given values matches.
    */
  var values: js.Array[String]
}

object GetNatGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetNatGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetNatGatewayFilter]
  }
}

