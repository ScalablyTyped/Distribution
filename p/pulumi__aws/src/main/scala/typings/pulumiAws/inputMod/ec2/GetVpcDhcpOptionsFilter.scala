package typings.pulumiAws.inputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcDhcpOptionsFilter extends js.Object {
  /**
    * The name of the field to filter.
    */
  var name: String = js.native
  /**
    * Set of values for filtering.
    */
  var values: js.Array[String] = js.native
}

object GetVpcDhcpOptionsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcDhcpOptionsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcDhcpOptionsFilter]
  }
}

