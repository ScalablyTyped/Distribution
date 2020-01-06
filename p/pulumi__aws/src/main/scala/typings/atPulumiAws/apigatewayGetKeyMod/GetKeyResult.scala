package typings.atPulumiAws.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKeyResult extends js.Object {
  /**
    * Set to the ID of the API Key.
    */
  val id: String = js.native
  /**
    * Set to the name of the API Key.
    */
  val name: String = js.native
  /**
    * Set to the value of the API Key.
    */
  val value: String = js.native
}

object GetKeyResult {
  @scala.inline
  def apply(id: String, name: String, value: String): GetKeyResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetKeyResult]
  }
}

