package typings
package atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
@js.native
class SpotDatafeedSubscription protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SpotDatafeedSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SpotDatafeedSubscriptionArgs) = this()
  def this(name: java.lang.String, args: SpotDatafeedSubscriptionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
}

@JSImport("@pulumi/aws/ec2/spotDatafeedSubscription", "SpotDatafeedSubscription")
@js.native
object SpotDatafeedSubscription extends js.Object {
  /**
    * Get an existing SpotDatafeedSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionState
  ): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscriptionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2SpotDatafeedSubscriptionMod.SpotDatafeedSubscription = js.native
}

