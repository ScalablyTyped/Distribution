package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectEnvironmentRegistryCredential extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
    */
  var credential: Input[String] = js.native
  
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var credentialProvider: Input[String] = js.native
}
object ProjectEnvironmentRegistryCredential {
  
  @scala.inline
  def apply(credential: Input[String], credentialProvider: Input[String]): ProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentRegistryCredential]
  }
  
  @scala.inline
  implicit class ProjectEnvironmentRegistryCredentialOps[Self <: ProjectEnvironmentRegistryCredential] (val x: Self) extends AnyVal {
    
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
    def setCredential(value: Input[String]): Self = this.set("credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialProvider(value: Input[String]): Self = this.set("credentialProvider", value.asInstanceOf[js.Any])
  }
}
