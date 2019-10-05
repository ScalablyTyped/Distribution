package typings.atPulumiAws.typesInputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCustomerGatewayFilter extends js.Object {
  var name: String
  var values: js.Array[String]
}

object GetCustomerGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetCustomerGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name, values = values)
  
    __obj.asInstanceOf[GetCustomerGatewayFilter]
  }
}

