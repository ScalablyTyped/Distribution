package typings.atPulumiAws.typesOutputMod.opsworks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEnvironment extends js.Object {
  var key: String = js.native
  var secure: js.UndefOr[Boolean] = js.native
  var value: String = js.native
}

object ApplicationEnvironment {
  @scala.inline
  def apply(key: String, value: String, secure: js.UndefOr[Boolean] = js.undefined): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
}

