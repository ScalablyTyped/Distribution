package typings.atPulumiAws.typesInputMod.ec2transitgateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayFilter extends js.Object {
  /**
    * Name of the filter.
    */
  var name: String = js.native
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String] = js.native
}

object GetTransitGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetTransitGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTransitGatewayFilter]
  }
}

