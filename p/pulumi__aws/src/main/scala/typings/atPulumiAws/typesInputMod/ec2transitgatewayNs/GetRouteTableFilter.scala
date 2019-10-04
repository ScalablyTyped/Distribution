package typings.atPulumiAws.typesInputMod.ec2transitgatewayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRouteTableFilter extends js.Object {
  /**
    * Name of the filter.
    */
  var name: String
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String]
}

object GetRouteTableFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetRouteTableFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetRouteTableFilter]
  }
}

