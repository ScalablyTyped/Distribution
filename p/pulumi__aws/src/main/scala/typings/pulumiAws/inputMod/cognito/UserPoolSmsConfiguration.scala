package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolSmsConfiguration extends StObject {
  
  /**
    * The external ID used in IAM role trust relationships. For more information about using external IDs, see [How to Use an External ID When Granting Access to Your AWS Resources to a Third Party](http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html).
    */
  var externalId: Input[String] = js.native
  
  /**
    * The ARN of the Amazon SNS caller. This is usually the IAM role that you've given Cognito permission to assume.
    */
  var snsCallerArn: Input[String] = js.native
}
object UserPoolSmsConfiguration {
  
  @scala.inline
  def apply(externalId: Input[String], snsCallerArn: Input[String]): UserPoolSmsConfiguration = {
    val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], snsCallerArn = snsCallerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolSmsConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolSmsConfigurationMutableBuilder[Self <: UserPoolSmsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalId(value: Input[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsCallerArn(value: Input[String]): Self = StObject.set(x, "snsCallerArn", value.asInstanceOf[js.Any])
  }
}
