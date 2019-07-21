package typings
package rocksetLib.rocksetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateIntegrationResponse extends js.Object {
  // integration object that was created
  var data: js.UndefOr[Integration] = js.undefined
}

object CreateIntegrationResponse {
  @scala.inline
  def apply(data: Integration = null): CreateIntegrationResponse = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CreateIntegrationResponse]
  }
}

