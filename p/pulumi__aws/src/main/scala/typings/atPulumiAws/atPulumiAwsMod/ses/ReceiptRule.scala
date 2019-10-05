package typings.atPulumiAws.atPulumiAwsMod.ses

import typings.atPulumiAws.sesReceiptRuleMod.ReceiptRuleArgs
import typings.atPulumiAws.sesReceiptRuleMod.ReceiptRuleState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ses.ReceiptRule")
@js.native
class ReceiptRule protected ()
  extends typings.atPulumiAws.sesMod.ReceiptRule {
  /**
    * Create a ReceiptRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReceiptRuleArgs) = this()
  def this(name: String, args: ReceiptRuleArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ses.ReceiptRule")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleState): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleState, opts: CustomResourceOptions): typings.atPulumiAws.sesReceiptRuleMod.ReceiptRule = js.native
  /**
    * Returns true if the given object is an instance of ReceiptRule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRule.ReceiptRule */ Boolean = js.native
}

