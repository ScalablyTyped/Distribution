package typings.atPulumiAws.batchMod

import typings.atPulumiAws.batchJobQueueMod.JobQueueArgs
import typings.atPulumiAws.batchJobQueueMod.JobQueueState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/batch", "JobQueue")
@js.native
class JobQueue protected ()
  extends typings.atPulumiAws.batchJobQueueMod.JobQueue {
  /**
    * Create a JobQueue resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: JobQueueArgs) = this()
  def this(name: String, args: JobQueueArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/batch", "JobQueue")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
  def get(name: String, id: Input[ID], state: JobQueueState): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
  def get(name: String, id: Input[ID], state: JobQueueState, opts: CustomResourceOptions): typings.atPulumiAws.batchJobQueueMod.JobQueue = js.native
  /**
    * Returns true if the given object is an instance of JobQueue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/batch/jobQueue.JobQueue */ Boolean = js.native
}

