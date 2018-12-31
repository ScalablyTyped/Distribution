package typings
package atPulumiAwsLib.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/securityhub", "StandardsSubscription")
@js.native
class StandardsSubscription protected ()
  extends atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription {
  /**
    * Create a StandardsSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/securityhub", "StandardsSubscription")
@js.native
object StandardsSubscription extends js.Object {
  /**
    * Get an existing StandardsSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionState
  ): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscriptionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.securityhubStandardsSubscriptionMod.StandardsSubscription = js.native
}

