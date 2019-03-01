package typings
package atPulumiAwsLib.glueSecurityConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationArgs extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchEncryptionJobBookmarksEncryption]
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SecurityConfigurationArgs {
  @scala.inline
  def apply(
    encryptionConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchEncryptionJobBookmarksEncryption],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SecurityConfigurationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationArgs]
  }
}

