package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcsFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](http://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcs.html).
    */
  var name: String = js.native
  /**
    * Set of values that are accepted for the given field.
    * A VPC will be selected if any one of the given values matches.
    */
  var values: js.Array[String] = js.native
}

object GetVpcsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetVpcsFilter]
  }
}

