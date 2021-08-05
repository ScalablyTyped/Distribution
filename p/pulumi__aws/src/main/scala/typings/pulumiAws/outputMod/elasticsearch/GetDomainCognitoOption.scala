package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainCognitoOption extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean
  
  /**
    * The Cognito Identity pool used by the domain.
    */
  var identityPoolId: String
  
  /**
    * The IAM Role with the AmazonESCognitoAccess policy attached.
    */
  var roleArn: String
  
  /**
    * The Cognito User pool used by the domain.
    */
  var userPoolId: String
}
object GetDomainCognitoOption {
  
  inline def apply(enabled: Boolean, identityPoolId: String, roleArn: String, userPoolId: String): GetDomainCognitoOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainCognitoOption]
  }
  
  extension [Self <: GetDomainCognitoOption](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
  }
}
