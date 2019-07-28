package typings.atPulumiAws.glueSecurityConfigurationMod

import typings.atPulumiAws.Anon_CloudwatchEncryptionJobBookmarksEncryption
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationArgs extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: Input[Anon_CloudwatchEncryptionJobBookmarksEncryption]
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object SecurityConfigurationArgs {
  @scala.inline
  def apply(
    encryptionConfiguration: Input[Anon_CloudwatchEncryptionJobBookmarksEncryption],
    name: Input[String] = null
  ): SecurityConfigurationArgs = {
    val __obj = js.Dynamic.literal(encryptionConfiguration = encryptionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationArgs]
  }
}

