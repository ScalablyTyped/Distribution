package typings.atPulumiAws.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
  /**
    * Set to the ID of the API Key.
    */
  val id: String
  /**
    * Set to the name of the API Key.
    */
  val name: String
  /**
    * Set to the value of the API Key.
    */
  val value: String
}

object GetKeyResult {
  @scala.inline
  def apply(id: String, name: String, value: String): GetKeyResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, value = value)
  
    __obj.asInstanceOf[GetKeyResult]
  }
}

