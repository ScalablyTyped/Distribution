package typings
package atPulumiAwsLib.glueSecurityConfigurationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationState extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchEncryptionJobBookmarksEncryption]
  ] = js.undefined
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SecurityConfigurationState {
  @scala.inline
  def apply(
    encryptionConfiguration: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchEncryptionJobBookmarksEncryption] = null,
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SecurityConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationState]
  }
}

