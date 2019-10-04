package typings.atPulumiAws.typesOutputMod.opsworksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEnvironment extends js.Object {
  var key: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object ApplicationEnvironment {
  @scala.inline
  def apply(key: String, value: String, secure: js.UndefOr[Boolean] = js.undefined): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key, value = value)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ApplicationEnvironment]
  }
}

