package typings.atPulumiAws.typesOutputMod.cfg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleSource extends js.Object {
  /**
    * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the [`aws.lambda.Permission` resource](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html).
    */
  var owner: String
  /**
    * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
    */
  var sourceDetails: js.UndefOr[js.Array[RuleSourceSourceDetail]] = js.undefined
  /**
    * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the [`arn` attribute of the `aws.lambda.Function` resource](https://www.terraform.io/docs/providers/aws/r/lambda_function.html#arn).
    */
  var sourceIdentifier: String
}

object RuleSource {
  @scala.inline
  def apply(owner: String, sourceIdentifier: String, sourceDetails: js.Array[RuleSourceSourceDetail] = null): RuleSource = {
    val __obj = js.Dynamic.literal(owner = owner, sourceIdentifier = sourceIdentifier)
    if (sourceDetails != null) __obj.updateDynamic("sourceDetails")(sourceDetails)
    __obj.asInstanceOf[RuleSource]
  }
}

