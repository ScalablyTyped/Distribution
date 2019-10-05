package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfacesFilter extends js.Object {
  /**
    * The name of the field to filter by, as defined by
    * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeNetworkInterfaces.html).
    */
  var name: String
  /**
    * Set of values that are accepted for the given field.
    */
  var values: js.Array[String]
}

object GetNetworkInterfacesFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetNetworkInterfacesFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetNetworkInterfacesFilter]
  }
}

