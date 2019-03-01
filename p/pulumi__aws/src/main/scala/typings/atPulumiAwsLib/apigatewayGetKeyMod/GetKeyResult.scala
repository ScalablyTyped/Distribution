package typings
package atPulumiAwsLib.apigatewayGetKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetKeyResult extends js.Object {
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
  def apply(name: java.lang.String, value: java.lang.String): GetKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GetKeyResult]
  }
}

