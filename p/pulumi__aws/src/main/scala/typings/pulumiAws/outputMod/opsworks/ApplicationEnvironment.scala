package typings.pulumiAws.outputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEnvironment extends js.Object {
  /**
    * Variable name.
    */
  var key: String = js.native
  /**
    * Set visibility of the variable value to `true` or `false`.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /**
    * Variable value.
    */
  var value: String = js.native
}

object ApplicationEnvironment {
  @scala.inline
  def apply(key: String, value: String, secure: js.UndefOr[Boolean] = js.undefined): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
}

