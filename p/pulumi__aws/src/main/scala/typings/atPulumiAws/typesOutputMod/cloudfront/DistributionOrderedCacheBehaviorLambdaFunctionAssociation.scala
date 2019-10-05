package typings.atPulumiAws.typesOutputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionOrderedCacheBehaviorLambdaFunctionAssociation extends js.Object {
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

object DistributionOrderedCacheBehaviorLambdaFunctionAssociation {
  @scala.inline
  def apply(eventType: String, lambdaArn: String, includeBody: js.UndefOr[Boolean] = js.undefined): DistributionOrderedCacheBehaviorLambdaFunctionAssociation = {
    val __obj = js.Dynamic.literal(eventType = eventType, lambdaArn = lambdaArn)
    if (!js.isUndefined(includeBody)) __obj.updateDynamic("includeBody")(includeBody)
    __obj.asInstanceOf[DistributionOrderedCacheBehaviorLambdaFunctionAssociation]
  }
}

