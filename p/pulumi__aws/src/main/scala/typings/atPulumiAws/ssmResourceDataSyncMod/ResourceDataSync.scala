package typings.atPulumiAws.ssmResourceDataSyncMod

import typings.atPulumiAws.Anon_BucketNameKmsKeyArnPrefix
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync")
@js.native
class ResourceDataSync protected () extends CustomResource {
  /**
    * Create a ResourceDataSync resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceDataSyncArgs) = this()
  def this(name: String, args: ResourceDataSyncArgs, opts: CustomResourceOptions) = this()
  /**
    * Name for the configuration.
    */
  val name: Output[String] = js.native
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: Output[Anon_BucketNameKmsKeyArnPrefix] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/resourceDataSync", "ResourceDataSync")
@js.native
object ResourceDataSync extends js.Object {
  /**
    * Get an existing ResourceDataSync resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): ResourceDataSync = js.native
  def get(name: String, id: Input[ID], state: ResourceDataSyncState): ResourceDataSync = js.native
  def get(name: String, id: Input[ID], state: ResourceDataSyncState, opts: CustomResourceOptions): ResourceDataSync = js.native
  /**
    * Returns true if the given object is an instance of ResourceDataSync.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/resourceDataSync.ResourceDataSync */ Boolean = js.native
}

