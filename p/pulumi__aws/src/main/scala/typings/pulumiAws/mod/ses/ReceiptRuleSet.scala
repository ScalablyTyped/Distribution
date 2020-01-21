package typings.pulumiAws.mod.ses

import typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSetArgs
import typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ses.ReceiptRuleSet")
@js.native
class ReceiptRuleSet protected ()
  extends typings.pulumiAws.sesMod.ReceiptRuleSet {
  /**
    * Create a ReceiptRuleSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReceiptRuleSetArgs) = this()
  def this(name: String, args: ReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "ses.ReceiptRuleSet")
@js.native
object ReceiptRuleSet extends js.Object {
  /**
    * Get an existing ReceiptRuleSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleSetState): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ReceiptRuleSetState, opts: CustomResourceOptions): typings.pulumiAws.receiptRuleSetMod.ReceiptRuleSet = js.native
  /**
    * Returns true if the given object is an instance of ReceiptRuleSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/receiptRuleSet.ReceiptRuleSet */ Boolean = js.native
}

