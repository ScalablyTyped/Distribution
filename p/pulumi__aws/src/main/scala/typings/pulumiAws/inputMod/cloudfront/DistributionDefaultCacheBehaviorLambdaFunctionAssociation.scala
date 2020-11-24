package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionDefaultCacheBehaviorLambdaFunctionAssociation extends js.Object {
  
  /**
    * The specific event to trigger this function.
    * Valid values: `viewer-request`, `origin-request`, `viewer-response`,
    * `origin-response`
    */
  var eventType: Input[String] = js.native
  
  /**
    * When set to true it exposes the request body to the lambda function. Defaults to false. Valid values: `true`, `false`.
    */
  var includeBody: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * ARN of the Lambda function.
    */
  var lambdaArn: Input[String] = js.native
}
object DistributionDefaultCacheBehaviorLambdaFunctionAssociation {
  
  @scala.inline
  def apply(eventType: Input[String], lambdaArn: Input[String]): DistributionDefaultCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], lambdaArn = lambdaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDefaultCacheBehaviorLambdaFunctionAssociation]
  }
  
  @scala.inline
  implicit class DistributionDefaultCacheBehaviorLambdaFunctionAssociationOps[Self <: DistributionDefaultCacheBehaviorLambdaFunctionAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventType(value: Input[String]): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaArn(value: Input[String]): Self = this.set("lambdaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBody(value: Input[Boolean]): Self = this.set("includeBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeBody: Self = this.set("includeBody", js.undefined)
  }
}
