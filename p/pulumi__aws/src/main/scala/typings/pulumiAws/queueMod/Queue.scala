package typings.pulumiAws.queueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.mediaconvert.QueueReservationPlanSettings
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/mediaconvert/queue", "Queue")
@js.native
class Queue protected () extends CustomResource {
  /**
    * Create a Queue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: QueueArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
  /**
    * The Arn of the queue
    */
  val arn: Output_[String] = js.native
  /**
    * A description of the queue
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A unique identifier describing the queue
    */
  val name: Output_[String] = js.native
  /**
    * Specifies whether the pricing plan for the queue is on-demand or reserved. Valid values are `ON_DEMAND` or `RESERVED`. Default to `ON_DEMAND`.
    */
  val pricingPlan: Output_[js.UndefOr[String]] = js.native
  /**
    * A detail pricing plan of the  reserved queue. See below.
    */
  val reservationPlanSettings: Output_[QueueReservationPlanSettings] = js.native
  /**
    * A status of the queue. Valid values are `ACTIVE` or `RESERVED`. Default to `PAUSED`.
    */
  val status: Output_[js.UndefOr[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/mediaconvert/queue", "Queue")
@js.native
object Queue extends js.Object {
  /**
    * Get an existing Queue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Queue = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState): Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): Queue = js.native
  /**
    * Returns true if the given object is an instance of Queue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mediaconvert/queue.Queue */ Boolean = js.native
}

