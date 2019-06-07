package typings
package atPulumiAwsLib.s3BucketMetricMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
@js.native
class BucketMetric protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a BucketMetric resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BucketMetricArgs) = this()
  def this(name: java.lang.String, args: BucketMetricArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the bucket to put metric configuration.
    */
  val bucket: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_KeyPrefix]] = js.native
  /**
    * Unique identifier of the metrics configuration for the bucket.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/s3/bucketMetric", "BucketMetric")
@js.native
object BucketMetric extends js.Object {
  /**
    * Get an existing BucketMetric resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketMetricMod.BucketMetricState
  ): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.s3BucketMetricMod.BucketMetricState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.s3BucketMetricMod.BucketMetric = js.native
  /**
    * Returns true if the given object is an instance of BucketMetric.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/s3/bucketMetric.BucketMetric */ scala.Boolean = js.native
}

