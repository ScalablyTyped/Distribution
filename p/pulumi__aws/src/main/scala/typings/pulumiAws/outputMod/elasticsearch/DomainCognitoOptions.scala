package typings.pulumiAws.outputMod.elasticsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainCognitoOptions extends StObject {
  
  /**
    * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * ID of the Cognito Identity Pool to use
    */
  var identityPoolId: String = js.native
  
  /**
    * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
    */
  var roleArn: String = js.native
  
  /**
    * ID of the Cognito User Pool to use
    */
  var userPoolId: String = js.native
}
object DomainCognitoOptions {
  
  @scala.inline
  def apply(identityPoolId: String, roleArn: String, userPoolId: String): DomainCognitoOptions = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainCognitoOptions]
  }
  
  @scala.inline
  implicit class DomainCognitoOptionsMutableBuilder[Self <: DomainCognitoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPoolId(value: String): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
  }
}
