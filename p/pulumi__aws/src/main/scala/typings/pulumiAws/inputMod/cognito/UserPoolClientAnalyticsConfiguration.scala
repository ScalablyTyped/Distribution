package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPoolClientAnalyticsConfiguration extends StObject {
  
  /**
    * The application ID for an Amazon Pinpoint application.
    */
  var applicationId: Input[String] = js.native
  
  /**
    * An ID for the Analytics Configuration.
    */
  var externalId: Input[String] = js.native
  
  /**
    * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * If set to `true`, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
    */
  var userDataShared: js.UndefOr[Input[Boolean]] = js.native
}
object UserPoolClientAnalyticsConfiguration {
  
  @scala.inline
  def apply(applicationId: Input[String], externalId: Input[String], roleArn: Input[String]): UserPoolClientAnalyticsConfiguration = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolClientAnalyticsConfiguration]
  }
  
  @scala.inline
  implicit class UserPoolClientAnalyticsConfigurationMutableBuilder[Self <: UserPoolClientAnalyticsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: Input[String]): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: Input[String]): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataShared(value: Input[Boolean]): Self = StObject.set(x, "userDataShared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataSharedUndefined: Self = StObject.set(x, "userDataShared", js.undefined)
  }
}
