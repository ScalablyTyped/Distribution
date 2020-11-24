package typings.pulumiAws.glueSecurityConfigurationMod

import typings.pulumiAws.inputMod.glue.SecurityConfigurationEncryptionConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityConfigurationArgs extends js.Object {
  
  /**
    * Configuration block containing encryption configuration. Detailed below.
    */
  val encryptionConfiguration: Input[SecurityConfigurationEncryptionConfiguration] = js.native
  
  /**
    * Name of the security configuration.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object SecurityConfigurationArgs {
  
  @scala.inline
  def apply(encryptionConfiguration: Input[SecurityConfigurationEncryptionConfiguration]): SecurityConfigurationArgs = {
    val __obj = js.Dynamic.literal(encryptionConfiguration = encryptionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityConfigurationArgs]
  }
  
  @scala.inline
  implicit class SecurityConfigurationArgsOps[Self <: SecurityConfigurationArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncryptionConfiguration(value: Input[SecurityConfigurationEncryptionConfiguration]): Self = this.set("encryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
