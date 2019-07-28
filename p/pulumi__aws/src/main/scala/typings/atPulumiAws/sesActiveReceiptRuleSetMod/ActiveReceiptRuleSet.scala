package typings.atPulumiAws.sesActiveReceiptRuleSetMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet")
@js.native
class ActiveReceiptRuleSet protected () extends CustomResource {
  /**
    * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ActiveReceiptRuleSetArgs) = this()
  def this(name: String, args: ActiveReceiptRuleSetArgs, opts: CustomResourceOptions) = this()
  /**
    * The name of the rule set
    */
  val ruleSetName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet")
@js.native
object ActiveReceiptRuleSet extends js.Object {
  /**
    * Get an existing ActiveReceiptRuleSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ActiveReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState): ActiveReceiptRuleSet = js.native
  def get(name: String, id: Input[ID], state: ActiveReceiptRuleSetState, opts: CustomResourceOptions): ActiveReceiptRuleSet = js.native
  /**
    * Returns true if the given object is an instance of ActiveReceiptRuleSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ses/activeReceiptRuleSet.ActiveReceiptRuleSet */ Boolean = js.native
}

