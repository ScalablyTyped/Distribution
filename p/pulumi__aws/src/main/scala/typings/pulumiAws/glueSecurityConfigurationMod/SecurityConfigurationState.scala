package typings.pulumiAws.glueSecurityConfigurationMod

import typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityConfigurationState extends js.Object {
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: js.UndefOr[Input[SecurityConfigurationEncryptionConfiguration]] = js.native
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
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

