package typings.pulumiAws.snapshotScheduleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/redshift/snapshotSchedule", "SnapshotSchedule")
@js.native
class SnapshotSchedule protected () extends CustomResource {
  /**
    * Create a SnapshotSchedule resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotScheduleArgs) = this()
  def this(name: String, args: SnapshotScheduleArgs, opts: CustomResourceOptions) = this()
  
  val arn: Output_[String] = js.native
  
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
    */
  val definitions: Output_[js.Array[String]] = js.native
  
  /**
    * The description of the snapshot schedule.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
    */
  val forceDestroy: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The snapshot schedule identifier. If omitted, this provider will assign a random, unique identifier.
    */
  val identifier: Output_[String] = js.native
  
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/redshift/snapshotSchedule", "SnapshotSchedule")
@js.native
object SnapshotSchedule extends js.Object {
  
  /**
    * Get an existing SnapshotSchedule resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SnapshotSchedule = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotSchedule = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleState): SnapshotSchedule = js.native
  def get(name: String, id: Input[ID], state: SnapshotScheduleState, opts: CustomResourceOptions): SnapshotSchedule = js.native
  
  /**
    * Returns true if the given object is an instance of SnapshotSchedule.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotSchedule.SnapshotSchedule */ Boolean = js.native
}
