package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkAclsFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkAcls.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given field.
    * A VPC will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}

object GetNetworkAclsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetNetworkAclsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkAclsFilter]
  }
}

