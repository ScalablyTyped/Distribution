package typings.atPulumiAws.sesReceiptRuleMod

import typings.atPulumiAws.Anon_BucketNameKmsKeyArnObjectKeyPrefix
import typings.atPulumiAws.Anon_FunctionArnInvocationTypePosition
import typings.atPulumiAws.Anon_HeaderNameHeaderValue
import typings.atPulumiAws.Anon_MessagePosition
import typings.atPulumiAws.Anon_OrganizationArnPosition
import typings.atPulumiAws.Anon_PositionScopeTopicArn
import typings.atPulumiAws.Anon_PositionTopicArn
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleArgs extends js.Object {
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[Input[js.Array[Input[Anon_HeaderNameHeaderValue]]]] = js.undefined
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[Input[js.Array[Input[Anon_MessagePosition]]]] = js.undefined
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[Input[js.Array[Input[Anon_FunctionArnInvocationTypePosition]]]] = js.undefined
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * The name of the rule set
    */
  val ruleSetName: Input[String]
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[Input[js.Array[Input[Anon_BucketNameKmsKeyArnObjectKeyPrefix]]]] = js.undefined
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[Input[js.Array[Input[Anon_PositionTopicArn]]]] = js.undefined
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[Input[js.Array[Input[Anon_PositionScopeTopicArn]]]] = js.undefined
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[Input[js.Array[Input[Anon_OrganizationArnPosition]]]] = js.undefined
}

object ReceiptRuleArgs {
  @scala.inline
  def apply(
    ruleSetName: Input[String],
    addHeaderActions: Input[js.Array[Input[Anon_HeaderNameHeaderValue]]] = null,
    after: Input[String] = null,
    bounceActions: Input[js.Array[Input[Anon_MessagePosition]]] = null,
    enabled: Input[Boolean] = null,
    lambdaActions: Input[js.Array[Input[Anon_FunctionArnInvocationTypePosition]]] = null,
    name: Input[String] = null,
    recipients: Input[js.Array[Input[String]]] = null,
    s3Actions: Input[js.Array[Input[Anon_BucketNameKmsKeyArnObjectKeyPrefix]]] = null,
    scanEnabled: Input[Boolean] = null,
    snsActions: Input[js.Array[Input[Anon_PositionTopicArn]]] = null,
    stopActions: Input[js.Array[Input[Anon_PositionScopeTopicArn]]] = null,
    tlsPolicy: Input[String] = null,
    workmailActions: Input[js.Array[Input[Anon_OrganizationArnPosition]]] = null
  ): ReceiptRuleArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
    if (addHeaderActions != null) __obj.updateDynamic("addHeaderActions")(addHeaderActions.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (bounceActions != null) __obj.updateDynamic("bounceActions")(bounceActions.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lambdaActions != null) __obj.updateDynamic("lambdaActions")(lambdaActions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (s3Actions != null) __obj.updateDynamic("s3Actions")(s3Actions.asInstanceOf[js.Any])
    if (scanEnabled != null) __obj.updateDynamic("scanEnabled")(scanEnabled.asInstanceOf[js.Any])
    if (snsActions != null) __obj.updateDynamic("snsActions")(snsActions.asInstanceOf[js.Any])
    if (stopActions != null) __obj.updateDynamic("stopActions")(stopActions.asInstanceOf[js.Any])
    if (tlsPolicy != null) __obj.updateDynamic("tlsPolicy")(tlsPolicy.asInstanceOf[js.Any])
    if (workmailActions != null) __obj.updateDynamic("workmailActions")(workmailActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleArgs]
  }
}

