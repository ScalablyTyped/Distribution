package typings
package atPulumiAwsLib.sesReceiptRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/receiptRule", "ReceiptRule")
@js.native
class ReceiptRule protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ReceiptRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ReceiptRuleArgs) = this()
  def this(name: java.lang.String, args: ReceiptRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * A list of Add Header Action blocks. Documented below.
    */
  val addHeaderActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_HeaderName]]] = js.native
  /**
    * The name of the rule to place this rule after
    */
  val after: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A list of Bounce Action blocks. Documented below.
    */
  val bounceActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Message]]] = js.native
  /**
    * If true, the rule will be enabled
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A list of Lambda Action blocks. Documented below.
    */
  val lambdaActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_FunctionArnInvocationType]]] = js.native
  /**
    * The name of the rule
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of email addresses
    */
  val recipients: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of S3 Action blocks. Documented below.
    */
  val s3Actions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_BucketNameKmsKeyArn]]] = js.native
  /**
    * If true, incoming emails will be scanned for spam and viruses
    */
  val scanEnabled: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A list of SNS Action blocks. Documented below.
    */
  val snsActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_Position]]] = js.native
  /**
    * A list of Stop Action blocks. Documented below.
    */
  val stopActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_PositionScope]]] = js.native
  /**
    * Require or Optional
    */
  val tlsPolicy: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A list of WorkMail Action blocks. Documented below.
    */
  val workmailActions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_OrganizationArn]]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesReceiptRuleMod.ReceiptRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesReceiptRuleMod.ReceiptRuleState
  ): atPulumiAwsLib.sesReceiptRuleMod.ReceiptRule = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesReceiptRuleMod.ReceiptRuleState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesReceiptRuleMod.ReceiptRule = js.native
  /**
    * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ scala.Boolean = js.native
}

