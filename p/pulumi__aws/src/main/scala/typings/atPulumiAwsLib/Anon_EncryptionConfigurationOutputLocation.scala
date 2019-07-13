package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionConfigurationOutputLocation extends js.Object {
  var encryptionConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[Anon_EncryptionOptionKmsKeyArnInput]] = js.undefined
  var outputLocation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EncryptionConfigurationOutputLocation {
  @scala.inline
  def apply(
    encryptionConfiguration: atPulumiPulumiLib.outputMod.Input[Anon_EncryptionOptionKmsKeyArnInput] = null,
    outputLocation: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_EncryptionConfigurationOutputLocation = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionConfigurationOutputLocation]
  }
}

