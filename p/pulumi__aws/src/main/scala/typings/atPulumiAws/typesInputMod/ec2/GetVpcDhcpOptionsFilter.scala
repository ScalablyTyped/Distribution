package typings.atPulumiAws.typesInputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcDhcpOptionsFilter extends js.Object {
  /**
    * The name of the field to filter.
    */
  var name: String
  /**
    * Set of values for filtering.
    */
  var values: js.Array[String]
}

object GetVpcDhcpOptionsFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetVpcDhcpOptionsFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetVpcDhcpOptionsFilter]
  }
}

