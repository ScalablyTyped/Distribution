package typings.atPulumiAws.typesOutputMod.ec2transitgateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayFilter extends js.Object {
  /**
    * Name of the filter.
    */
  var name: String
  /**
    * List of one or more values for the filter.
    */
  var values: js.Array[String]
}

object GetTransitGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetTransitGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetTransitGatewayFilter]
  }
}

