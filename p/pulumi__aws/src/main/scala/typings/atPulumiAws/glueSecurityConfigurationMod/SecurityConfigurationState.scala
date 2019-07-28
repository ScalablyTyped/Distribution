package typings.atPulumiAws.glueSecurityConfigurationMod

import typings.atPulumiAws.Anon_CloudwatchEncryptionJobBookmarksEncryption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationState extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: js.UndefOr[Input[Anon_CloudwatchEncryptionJobBookmarksEncryption]] = js.undefined
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object SecurityConfigurationState {
  @scala.inline
  def apply(
    encryptionConfiguration: Input[Anon_CloudwatchEncryptionJobBookmarksEncryption] = null,
    name: Input[String] = null
  ): SecurityConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationState]
  }
}

