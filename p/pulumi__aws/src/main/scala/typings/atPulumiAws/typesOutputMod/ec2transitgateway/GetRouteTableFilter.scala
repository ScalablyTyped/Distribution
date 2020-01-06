package typings.atPulumiAws.typesOutputMod.ec2transitgateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteTableFilter extends js.Object {
  /**
    * Name of the filter.
    */
  var name: String = js.native
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}

object GetRouteTableFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetRouteTableFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRouteTableFilter]
  }
}

