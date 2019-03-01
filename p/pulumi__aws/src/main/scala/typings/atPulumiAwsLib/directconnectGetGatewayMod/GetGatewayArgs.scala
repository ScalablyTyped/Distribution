package typings
package atPulumiAwsLib.directconnectGetGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGatewayArgs extends js.Object {
  /**
    * The name of the gateway to retrieve.
    */
  val name: java.lang.String
}

object GetGatewayArgs {
  @scala.inline
  def apply(name: java.lang.String): GetGatewayArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetGatewayArgs]
  }
}

