package typings
package atPulumiAwsLib.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyArgs extends js.Object {
  /**
    * The ID of the API Key to look up.
    */
  val id: java.lang.String
}

object GetKeyArgs {
  @scala.inline
  def apply(id: java.lang.String): GetKeyArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetKeyArgs]
  }
}

