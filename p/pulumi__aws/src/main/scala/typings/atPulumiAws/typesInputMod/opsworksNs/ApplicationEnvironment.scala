package typings.atPulumiAws.typesInputMod.opsworksNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationEnvironment extends js.Object {
  var key: Input[String]
  var secure: js.UndefOr[Input[Boolean]] = js.undefined
  var value: Input[String]
}

object ApplicationEnvironment {
  @scala.inline
  def apply(key: Input[String], value: Input[String], secure: Input[Boolean] = null): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
}

