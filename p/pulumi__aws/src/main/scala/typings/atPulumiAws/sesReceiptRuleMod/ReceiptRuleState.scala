package typings.atPulumiAws.sesReceiptRuleMod

import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleAddHeaderAction
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleBounceAction
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleLambdaAction
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleS3Action
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleSnsAction
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleStopAction
import typings.atPulumiAws.typesInputMod.ses.ReceiptRuleWorkmailAction
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRuleState extends js.Object {
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleAddHeaderAction]]]] = js.native
  /**
    * The name of the rule to place this rule after
    */
  val after: js.UndefOr[Input[String]] = js.native
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleBounceAction]]]] = js.native
  /**
    * If true, the rule will be enabled
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleLambdaAction]]]] = js.native
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of email addresses
    */
  val recipients: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[Input[String]] = js.native
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: js.UndefOr[Input[js.Array[Input[ReceiptRuleS3Action]]]] = js.native
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleSnsAction]]]] = js.native
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleStopAction]]]] = js.native
  /**
    * Require or Optional
    */
  val tlsPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: js.UndefOr[Input[js.Array[Input[ReceiptRuleWorkmailAction]]]] = js.native
}

object ReceiptRuleState {
  @scala.inline
  def apply(
    addHeaderActions: Input[js.Array[Input[ReceiptRuleAddHeaderAction]]] = null,
    after: Input[String] = null,
    bounceActions: Input[js.Array[Input[ReceiptRuleBounceAction]]] = null,
    enabled: Input[Boolean] = null,
    lambdaActions: Input[js.Array[Input[ReceiptRuleLambdaAction]]] = null,
    name: Input[String] = null,
    recipients: Input[js.Array[Input[String]]] = null,
    ruleSetName: Input[String] = null,
    s3Actions: Input[js.Array[Input[ReceiptRuleS3Action]]] = null,
    scanEnabled: Input[Boolean] = null,
    snsActions: Input[js.Array[Input[ReceiptRuleSnsAction]]] = null,
    stopActions: Input[js.Array[Input[ReceiptRuleStopAction]]] = null,
    tlsPolicy: Input[String] = null,
    workmailActions: Input[js.Array[Input[ReceiptRuleWorkmailAction]]] = null
  ): ReceiptRuleState = {
    val __obj = js.Dynamic.literal()
    if (addHeaderActions != null) __obj.updateDynamic("addHeaderActions")(addHeaderActions.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (bounceActions != null) __obj.updateDynamic("bounceActions")(bounceActions.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (lambdaActions != null) __obj.updateDynamic("lambdaActions")(lambdaActions.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recipients != null) __obj.updateDynamic("recipients")(recipients.asInstanceOf[js.Any])
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    if (s3Actions != null) __obj.updateDynamic("s3Actions")(s3Actions.asInstanceOf[js.Any])
    if (scanEnabled != null) __obj.updateDynamic("scanEnabled")(scanEnabled.asInstanceOf[js.Any])
    if (snsActions != null) __obj.updateDynamic("snsActions")(snsActions.asInstanceOf[js.Any])
    if (stopActions != null) __obj.updateDynamic("stopActions")(stopActions.asInstanceOf[js.Any])
    if (tlsPolicy != null) __obj.updateDynamic("tlsPolicy")(tlsPolicy.asInstanceOf[js.Any])
    if (workmailActions != null) __obj.updateDynamic("workmailActions")(workmailActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleState]
  }
}

