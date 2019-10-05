package typings.atPulumiAws.typesInputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcPeeringConnectionFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcPeeringConnections.html).
    */
  var name: String
  /**
    * Set of values that are accepted for the given field.
    * A VPC Peering Connection will be selected if any one of the given values matches.
    */
  var values: js.Array[String]
}

object GetVpcPeeringConnectionFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcPeeringConnectionFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetVpcPeeringConnectionFilter]
  }
}

