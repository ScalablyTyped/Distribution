package typings
package atPulumiAwsLib.s3BucketNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucketNotification", "BucketNotification")
@js.native
class BucketNotification protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a BucketNotification resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BucketNotificationArgs) = this()
  def this(name: java.lang.String, args: BucketNotificationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the bucket to put notification configuration.
    */
  val bucket: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_LambdaFunctionArnFilterPrefix]]] = js.native
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_QueueArnFilterPrefix]]] = js.native
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_TopicArnFilterPrefix]]] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationState
  ): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketNotificationMod.BucketNotificationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketNotificationMod.BucketNotification = js.native
}

