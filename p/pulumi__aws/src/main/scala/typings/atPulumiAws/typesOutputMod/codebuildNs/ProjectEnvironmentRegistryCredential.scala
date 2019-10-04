package typings.atPulumiAws.typesOutputMod.codebuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectEnvironmentRegistryCredential extends js.Object {
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.
    */
  var credential: String
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var credentialProvider: String
}

object ProjectEnvironmentRegistryCredential {
  @scala.inline
  def apply(credential: String, credentialProvider: String): ProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential, credentialProvider = credentialProvider)
  
    __obj.asInstanceOf[ProjectEnvironmentRegistryCredential]
  }
}

