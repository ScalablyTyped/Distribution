package typings.pulumiAws.activityMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sfn/activity", "Activity")
@js.native
class Activity protected () extends CustomResource {
  /**
    * Create a Activity resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ActivityArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ActivityArgs, opts: CustomResourceOptions) = this()
  /**
    * The date the activity was created.
    */
  val creationDate: Output_[String] = js.native
  /**
    * The name of the activity to create.
    */
  val name: Output_[String] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sfn/activity", "Activity")
@js.native
object Activity extends js.Object {
  /**
    * Get an existing Activity resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Activity = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Activity = js.native
  def get(name: String, id: Input[ID], state: ActivityState): Activity = js.native
  def get(name: String, id: Input[ID], state: ActivityState, opts: CustomResourceOptions): Activity = js.native
  /**
    * Returns true if the given object is an instance of Activity.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sfn/activity.Activity */ Boolean = js.native
}

