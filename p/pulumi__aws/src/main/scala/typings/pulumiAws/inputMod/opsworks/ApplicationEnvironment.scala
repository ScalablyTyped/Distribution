package typings.pulumiAws.inputMod.opsworks

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationEnvironment extends js.Object {
  var key: Input[String] = js.native
  var secure: js.UndefOr[Input[Boolean]] = js.native
  var value: Input[String] = js.native
}

object ApplicationEnvironment {
  @scala.inline
  def apply(key: Input[String], value: Input[String], secure: Input[Boolean] = null): ApplicationEnvironment = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationEnvironment]
  }
}

