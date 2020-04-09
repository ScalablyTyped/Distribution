package typings.pulumiAws.queuePolicyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy")
@js.native
class QueuePolicy protected () extends CustomResource {
  /**
    * Create a QueuePolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: QueuePolicyArgs) = this()
  def this(name: String, args: QueuePolicyArgs, opts: CustomResourceOptions) = this()
  /**
    * The JSON policy for the SQS queue.
    */
  val policy: Output_[String] = js.native
  /**
    * The URL of the SQS Queue to which to attach the policy
    */
  val queueUrl: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/sqs/queuePolicy", "QueuePolicy")
@js.native
object QueuePolicy extends js.Object {
  /**
    * Get an existing QueuePolicy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): QueuePolicy = js.native
  def get(name: String, id: Input[ID], state: QueuePolicyState): QueuePolicy = js.native
  def get(name: String, id: Input[ID], state: QueuePolicyState, opts: CustomResourceOptions): QueuePolicy = js.native
  /**
    * Returns true if the given object is an instance of QueuePolicy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queuePolicy.QueuePolicy */ Boolean = js.native
}

