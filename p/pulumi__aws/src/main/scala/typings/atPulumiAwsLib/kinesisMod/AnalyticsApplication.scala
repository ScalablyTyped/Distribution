package typings
package atPulumiAwsLib.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
@js.native
class AnalyticsApplication protected ()
  extends atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication {
  /**
    * Create a AnalyticsApplication resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/kinesis", "AnalyticsApplication")
@js.native
object AnalyticsApplication extends js.Object {
  /**
    * Get an existing AnalyticsApplication resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState
  ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplicationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.kinesisAnalyticsApplicationMod.AnalyticsApplication = js.native
}

