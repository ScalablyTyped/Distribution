package typings
package atPulumiAwsLib.sesActiveReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses/activeReceiptRuleSet", "ActiveReceiptRuleSet")
@js.native
class ActiveReceiptRuleSet protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a ActiveReceiptRuleSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ActiveReceiptRuleSetArgs) = this()
  def this(name: java.lang.String, args: ActiveReceiptRuleSetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetState
  ): atPulumiAwsLib.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSetState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sesActiveReceiptRuleSetMod.ActiveReceiptRuleSet = js.native
}

