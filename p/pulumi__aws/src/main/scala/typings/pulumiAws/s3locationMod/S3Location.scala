package typings.pulumiAws.s3locationMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.outputMod.datasync.S3LocationS3Config
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/datasync/s3location", "S3Location")
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
  val arn: Output_[String] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the S3 Bucket.
    */
  val s3BucketArn: Output_[ARN] = js.native
  
  /**
    * Configuration block containing information for connecting to S3.
    */
  val s3Config: Output_[S3LocationS3Config] = js.native
  
  /**
    * Prefix to perform actions as source or destination.
    */
  val subdirectory: Output_[String] = js.native
  
  /**
    * Key-value pairs of resource tags to assign to the DataSync Location.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  val uri: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/datasync/s3location", "S3Location")
@js.native
object S3Location extends js.Object {
  
  /**
    * Get an existing S3Location resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): S3Location = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState): S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): S3Location = js.native
  
  /**
    * Returns true if the given object is an instance of S3Location.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3location.S3Location */ Boolean = js.native
}
