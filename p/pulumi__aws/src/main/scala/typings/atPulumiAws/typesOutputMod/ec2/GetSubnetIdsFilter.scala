package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubnetIdsFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSubnets.html).
    * For example, if matching against tag `Name`, use:
    */
  var name: String
  /**
    * Set of values that are accepted for the given field.
    * Subnet IDs will be selected if any one of the given values match.
    */
  var values: js.Array[String]
}

object GetSubnetIdsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetSubnetIdsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetSubnetIdsFilter]
  }
}

