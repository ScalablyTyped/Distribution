package typings.atPulumiAws.datasyncMod

import typings.atPulumiAws.datasyncS3LocationMod.S3LocationArgs
import typings.atPulumiAws.datasyncS3LocationMod.S3LocationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync", "S3Location")
@js.native
class S3Location protected ()
  extends typings.atPulumiAws.datasyncS3LocationMod.S3Location {
  /**
    * Create a S3Location resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: S3LocationArgs) = this()
  def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/datasync", "S3Location")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState): typings.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
  def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typings.atPulumiAws.datasyncS3LocationMod.S3Location = js.native
  /**
    * Returns true if the given object is an instance of S3Location.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3Location.S3Location */ Boolean = js.native
}

