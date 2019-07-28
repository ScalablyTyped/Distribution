package typings.atPulumiAws.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyArgs extends js.Object {
  /**
    * The ID of the API Key to look up.
    */
  val id: String
}

object GetKeyArgs {
  @scala.inline
  def apply(id: String): GetKeyArgs = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetKeyArgs]
  }
}

