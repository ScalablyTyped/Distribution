package typings
package atPulumiAwsLib.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ses", "ReceiptRule")
@js.native
class ReceiptRule protected ()
  extends atPulumiAwsLib.sesReceiptRuleMod.ReceiptRule {
  /**
    * Create a ReceiptRule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sesReceiptRuleMod.ReceiptRuleArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sesReceiptRuleMod.ReceiptRuleArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ses", "ReceiptRule")
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
}

