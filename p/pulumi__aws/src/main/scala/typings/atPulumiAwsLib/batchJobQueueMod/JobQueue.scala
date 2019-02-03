package typings
package atPulumiAwsLib.batchJobQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
@js.native
class JobQueue protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a JobQueue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: JobQueueArgs) = this()
  def this(name: java.lang.String, args: JobQueueArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name of the job queue.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the set of compute environments
    * mapped to a job queue and their order.  The position of the compute environments
    * in the list will dictate the order. You can associate up to 3 compute environments
    * with a job queue.
    */
  val computeEnvironments: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * Specifies the name of the job queue.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The priority of the job queue. Job queues with a higher priority
    * are evaluated first when associated with the same compute environment.
    */
  val priority: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The state of the job queue. Must be one of: `ENABLED` or `DISABLED`
    */
  val state: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/batch/jobQueue", "JobQueue")
@js.native
object JobQueue extends js.Object {
  /**
    * Get an existing JobQueue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobQueueMod.JobQueueState
  ): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.batchJobQueueMod.JobQueueState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.batchJobQueueMod.JobQueue = js.native
}

