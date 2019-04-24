package typings
package atPulumiAwsLib.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
  /**
    * Set to the ID of the API Key.
    */
  val id: java.lang.String
  /**
    * Set to the name of the API Key.
    */
  val name: java.lang.String
  /**
    * Set to the value of the API Key.
    */
  val value: java.lang.String
}

object GetKeyResult {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, value: java.lang.String): GetKeyResult = {
    val __obj = js.Dynamic.literal(id = id, name = name, value = value)
  
    __obj.asInstanceOf[GetKeyResult]
  }
}

