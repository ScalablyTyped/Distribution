package typings.pulumiAws.inputMod.cfg

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleSource extends js.Object {
  /**
    * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
    */
  var owner: Input[String] = js.native
  /**
    * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
    */
  var sourceDetails: js.UndefOr[Input[js.Array[Input[RuleSourceSourceDetail]]]] = js.native
  /**
    * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
    */
  var sourceIdentifier: Input[String] = js.native
}

object RuleSource {
  @scala.inline
  def apply(owner: Input[String], sourceIdentifier: Input[String]): RuleSource = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleSource]
  }
  @scala.inline
  implicit class RuleSourceOps[Self <: RuleSource] (val x: Self) extends AnyVal {
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
    def setOwner(value: Input[String]): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceIdentifier(value: Input[String]): Self = this.set("sourceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDetailsVarargs(value: Input[RuleSourceSourceDetail]*): Self = this.set("sourceDetails", js.Array(value :_*))
    @scala.inline
    def setSourceDetails(value: Input[js.Array[Input[RuleSourceSourceDetail]]]): Self = this.set("sourceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDetails: Self = this.set("sourceDetails", js.undefined)
  }
  
}

