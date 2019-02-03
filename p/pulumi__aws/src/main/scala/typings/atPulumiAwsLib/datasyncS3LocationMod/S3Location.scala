package typings
package atPulumiAwsLib.datasyncS3LocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/s3Location", "S3Location")
@js.native
class S3Location protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a S3Location resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: S3LocationArgs) = this()
  def this(name: java.lang.String, args: S3LocationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Location.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_BucketAccessRoleArn] = js.native
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
  val uri: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncS3LocationMod.S3LocationState
  ): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncS3LocationMod.S3LocationState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.datasyncS3LocationMod.S3Location = js.native
}

