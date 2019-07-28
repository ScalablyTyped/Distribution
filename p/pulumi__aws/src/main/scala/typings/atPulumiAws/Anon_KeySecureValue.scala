package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySecureValue extends js.Object {
  var key: Input[String]
  var secure: js.UndefOr[Input[Boolean]] = js.undefined
  var value: Input[String]
}

object Anon_KeySecureValue {
  @scala.inline
  def apply(key: Input[String], value: Input[String], secure: Input[Boolean] = null): Anon_KeySecureValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySecureValue]
  }
}

