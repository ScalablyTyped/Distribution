package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySecureValue extends js.Object {
  var key: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var secure: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var value: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_KeySecureValue {
  @scala.inline
  def apply(
    key: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    value: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    secure: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_KeySecureValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (secure != null) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySecureValue]
  }
}

