package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionDefaultCacheBehaviorLambdaFunctionAssociation extends StObject {
  
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: String
  
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: String
}
object DistributionDefaultCacheBehaviorLambdaFunctionAssociation {
  
  inline def apply(eventType: String, lambdaArn: String): DistributionDefaultCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]
  }
  
  extension [Self <: DistributionDefaultCacheBehaviorLambdaFunctionAssociation](x: Self) {
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIncludeBody(value: Boolean): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeBodyUndefined: Self = StObject.set(x, "includeBody", js.undefined)
    
    inline def setLambdaArn(value: String): Self = StObject.set(x, "lambdaArn", value.asInstanceOf[js.Any])
  }
}
