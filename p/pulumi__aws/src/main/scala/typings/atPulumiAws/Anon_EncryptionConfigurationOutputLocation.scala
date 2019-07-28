package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncryptionConfigurationOutputLocation extends js.Object {
  var encryptionConfiguration: js.UndefOr[Input[Anon_EncryptionOptionKmsKeyArnInput]] = js.undefined
  var outputLocation: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EncryptionConfigurationOutputLocation {
  @scala.inline
  def apply(
    encryptionConfiguration: Input[Anon_EncryptionOptionKmsKeyArnInput] = null,
    outputLocation: Input[String] = null
  ): Anon_EncryptionConfigurationOutputLocation = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (outputLocation != null) __obj.updateDynamic("outputLocation")(outputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncryptionConfigurationOutputLocation]
  }
}

