package typings.atPulumiAws.typesInputMod.codebuild

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironmentRegistryCredential extends js.Object {
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
    */
  var credential: Input[String]
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var credentialProvider: Input[String]
}

object ProjectEnvironmentRegistryCredential {
  @scala.inline
  def apply(credential: Input[String], credentialProvider: Input[String]): ProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectEnvironmentRegistryCredential]
  }
}

