package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainCognitoOption extends StObject {
  
  /**
    * Whether node to node encryption is enabled.
    */
  var enabled: Boolean = js.native
  
  /**
    * The Cognito Identity pool used by the domain.
    */
  var identityPoolId: String = js.native
  
  /**
    * The IAM Role with the AmazonESCognitoAccess policy attached.
    */
  var roleArn: String = js.native
  
  /**
    * The Cognito User pool used by the domain.
    */
  var userPoolId: String = js.native
}
object GetDomainCognitoOption {
  
  @scala.inline
  def apply(enabled: Boolean, identityPoolId: String, roleArn: String, userPoolId: String): GetDomainCognitoOption = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainCognitoOption]
  }
  
  @scala.inline
  implicit class GetDomainCognitoOptionMutableBuilder[Self <: GetDomainCognitoOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
  }
}
