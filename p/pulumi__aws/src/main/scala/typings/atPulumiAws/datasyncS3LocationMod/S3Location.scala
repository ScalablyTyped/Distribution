package typings.atPulumiAws.datasyncS3LocationMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_BucketAccessRoleArn
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/s3Location", "S3Location")
@js.native
class S3Location protected () extends CustomResource {
  /**
    * Create a S3Location resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: S3LocationArgs) = this()
  def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Output[ARN] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Output[Anon_BucketAccessRoleArn] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Output[String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
  val uri: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/s3Location", "S3Location")
@js.native
object S3Location extends js.Object {
  /**
    * Get an existing S3Location resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState): S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): S3Location = js.native
  /**
    * Returns true if the given object is an instance of S3Location.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3Location.S3Location */ Boolean = js.native
}

