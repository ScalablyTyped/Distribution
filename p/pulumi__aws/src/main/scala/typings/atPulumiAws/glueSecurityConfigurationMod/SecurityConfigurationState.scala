package typings.atPulumiAws.glueSecurityConfigurationMod

import typings.atPulumiAws.typesInputMod.glueNs.SecurityConfigurationEncryptionConfiguration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityConfigurationState extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: js.UndefOr[Input[SecurityConfigurationEncryptionConfiguration]] = js.undefined
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
}

object SecurityConfigurationState {
  @scala.inline
  def apply(
    encryptionConfiguration: Input[SecurityConfigurationEncryptionConfiguration] = null,
    name: Input[String] = null
  ): SecurityConfigurationState = {
    val __obj = js.Dynamic.literal()
    if (encryptionConfiguration != null) __obj.updateDynamic("encryptionConfiguration")(encryptionConfiguration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationState]
  }
}

