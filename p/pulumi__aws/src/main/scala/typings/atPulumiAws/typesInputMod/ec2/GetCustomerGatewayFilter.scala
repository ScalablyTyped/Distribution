package typings.atPulumiAws.typesInputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCustomerGatewayFilter extends js.Object {
  var name: String = js.native
  var values: js.Array[String] = js.native
}

object GetCustomerGatewayFilter {
  @scala.inline
  def apply(name: String, values: js.Array[String]): GetCustomerGatewayFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCustomerGatewayFilter]
  }
}

