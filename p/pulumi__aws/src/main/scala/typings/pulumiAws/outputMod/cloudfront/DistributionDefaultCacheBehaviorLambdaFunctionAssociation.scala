package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionDefaultCacheBehaviorLambdaFunctionAssociation extends StObject {
  
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: String = js.native
  
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Boolean] = js.native
  
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: String = js.native
}
object DistributionDefaultCacheBehaviorLambdaFunctionAssociation {
  
  @scala.inline
  def apply(eventType: String, lambdaArn: String): DistributionDefaultCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]
  }
  
  @scala.inline
  implicit class DistributionDefaultCacheBehaviorLambdaFunctionAssociationMutableBuilder[Self <: DistributionDefaultCacheBehaviorLambdaFunctionAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBody(value: Boolean): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBodyUndefined: Self = StObject.set(x, "includeBody", js.undefined)
    
    @scala.inline
    def setLambdaArn(value: String): Self = StObject.set(x, "lambdaArn", value.asInstanceOf[js.Any])
  }
}
