package typings.pulumiAws.receiptRuleMod

import typings.pulumiAws.outputMod.ses.ReceiptRuleAddHeaderAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleBounceAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleLambdaAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleS3Action
import typings.pulumiAws.outputMod.ses.ReceiptRuleSnsAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleStopAction
import typings.pulumiAws.outputMod.ses.ReceiptRuleWorkmailAction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule")
@js.native
class ReceiptRule protected () extends CustomResource {
  /**
    * Create a ReceiptRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReceiptRuleArgs) = this()
  def this(name: String, args: ReceiptRuleArgs, opts: CustomResourceOptions) = this()
  
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: Output_[js.UndefOr[js.Array[ReceiptRuleAddHeaderAction]]] = js.native
  
  /**
    * The name of the rule to place this rule after
    */
  val after: Output_[js.UndefOr[String]] = js.native
  
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: Output_[js.UndefOr[js.Array[ReceiptRuleBounceAction]]] = js.native
  
  /**
    * If true, the rule will be enabled
    */
  val enabled: Output_[Boolean] = js.native
  
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: Output_[js.UndefOr[js.Array[ReceiptRuleLambdaAction]]] = js.native
  
  /**
    * The name of the rule
    */
  val name: Output_[String] = js.native
  
  /**
    * A list of email addresses
    */
  val recipients: Output_[js.UndefOr[js.Array[String]]] = js.native
  
  /**
    * The name of the rule set
    */
  val ruleSetName: Output_[String] = js.native
  
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: Output_[js.UndefOr[js.Array[ReceiptRuleS3Action]]] = js.native
  
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: Output_[Boolean] = js.native
  
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: Output_[js.UndefOr[js.Array[ReceiptRuleSnsAction]]] = js.native
  
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: Output_[js.UndefOr[js.Array[ReceiptRuleStopAction]]] = js.native
  
  /**
    * Require or Optional
    */
  val tlsPolicy: Output_[String] = js.native
  
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: Output_[js.UndefOr[js.Array[ReceiptRuleWorkmailAction]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule")
@js.native
object ReceiptRule extends js.Object {
  
  /**
    * Get an existing ReceiptRule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ReceiptRule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReceiptRule = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleState): ReceiptRule = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): ReceiptRule = js.native
  
  /**
    * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
}
