package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CrlConfigurationAnonCustomCnameEnabled extends js.Object {
  var crlConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_CustomCnameEnabled]] = js.undefined
}

object Anon_CrlConfigurationAnonCustomCnameEnabled {
  @scala.inline
  def apply(crlConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_CustomCnameEnabled] = null): Anon_CrlConfigurationAnonCustomCnameEnabled = {
    val __obj = js.Dynamic.literal()
    if (crlConfiguration != null) __obj.updateDynamic("crlConfiguration")(crlConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CrlConfigurationAnonCustomCnameEnabled]
  }
}

