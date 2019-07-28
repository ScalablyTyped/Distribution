package typings.atPulumiAws.s3BucketNotificationMod

import typings.atPulumiAws.Anon_EventsFilterPrefix
import typings.atPulumiAws.Anon_EventsFilterPrefixFilterSuffix
import typings.atPulumiAws.Anon_EventsFilterPrefixFilterSuffixId
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val bucket: Output[String] = js.native
  /**
    * Used to configure notifications to a Lambda Function (documented below).
    */
  val lambdaFunctions: Output[js.UndefOr[js.Array[Anon_EventsFilterPrefix]]] = js.native
  /**
    * The notification configuration to SQS Queue (documented below).
    */
  val queues: Output[js.UndefOr[js.Array[Anon_EventsFilterPrefixFilterSuffix]]] = js.native
  /**
    * The notification configuration to SNS Topic (documented below).
    */
  val topics: Output[js.UndefOr[js.Array[Anon_EventsFilterPrefixFilterSuffixId]]] = js.native
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
    */
  def get(name: String, id: Input[ID]): BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState): BucketNotification = js.native
  def get(name: String, id: Input[ID], state: BucketNotificationState, opts: CustomResourceOptions): BucketNotification = js.native
  /**
    * Returns true if the given object is an instance of BucketNotification.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketNotification.BucketNotification */ Boolean = js.native
}

