package typings.atPulumiAws.directconnectGetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGatewayArgs extends js.Object {
  /**
    * The name of the gateway to retrieve.
    */
  val name: String = js.native
}

object GetGatewayArgs {
  @scala.inline
  def apply(name: String): GetGatewayArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGatewayArgs]
  }
}

