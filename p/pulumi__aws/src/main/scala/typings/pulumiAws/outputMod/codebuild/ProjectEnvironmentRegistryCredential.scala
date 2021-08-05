package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectEnvironmentRegistryCredential extends StObject {
  
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
  
  inline def apply(credential: String, credentialProvider: String): ProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectEnvironmentRegistryCredential]
  }
  
  extension [Self <: ProjectEnvironmentRegistryCredential](x: Self) {
    
    inline def setCredential(value: String): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    inline def setCredentialProvider(value: String): Self = StObject.set(x, "credentialProvider", value.asInstanceOf[js.Any])
  }
}
