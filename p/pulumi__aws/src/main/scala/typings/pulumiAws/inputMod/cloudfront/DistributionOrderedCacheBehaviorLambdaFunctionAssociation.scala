package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionOrderedCacheBehaviorLambdaFunctionAssociation extends StObject {
  
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: Input[String]
  
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: Input[String]
}
object DistributionOrderedCacheBehaviorLambdaFunctionAssociation {
  
  inline def apply(eventType: Input[String], lambdaArn: Input[String]): DistributionOrderedCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]
  }
  
  extension [Self <: DistributionOrderedCacheBehaviorLambdaFunctionAssociation](x: Self) {
    
    inline def setEventType(value: Input[String]): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setIncludeBody(value: Input[Boolean]): Self = StObject.set(x, "includeBody", value.asInstanceOf[js.Any])
    
    inline def setIncludeBodyUndefined: Self = StObject.set(x, "includeBody", js.undefined)
    
    inline def setLambdaArn(value: Input[String]): Self = StObject.set(x, "lambdaArn", value.asInstanceOf[js.Any])
  }
}
