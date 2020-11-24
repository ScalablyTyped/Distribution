package typings.pulumiAws.bucketNotificationMod

import typings.pulumiAws.outputMod.s3.BucketNotificationLambdaFunction
import typings.pulumiAws.outputMod.s3.BucketNotificationQueue
import typings.pulumiAws.outputMod.s3.BucketNotificationTopic
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification")
@js.native
class BucketNotification protected () extends CustomResource {
  /**
    * Create a BucketNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BucketNotificationArgs) = this()
  def this(name: String, args: BucketNotificationArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: Output_[String] = js.native
  
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: Output_[js.UndefOr[js.Array[BucketNotificationLambdaFunction]]] = js.native
  
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: Output_[js.UndefOr[js.Array[BucketNotificationQueue]]] = js.native
  
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: Output_[js.UndefOr[js.Array[BucketNotificationTopic]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification")
@js.native
object BucketNotification extends js.Object {
  
  /**
    * Get an existing BucketNotification resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): BucketNotification = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState): BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): BucketNotification = js.native
  
  /**
    * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
}
