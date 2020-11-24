package typings.pulumiAws.snapshotCopyGrantMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
@js.native
class SnapshotCopyGrant protected () extends CustomResource {
  /**
    * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotCopyGrantArgs) = this()
  def this(name: String, args: SnapshotCopyGrantArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN) of snapshot copy grant
    */
  val arn: Output_[String] = js.native
  
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
    */
  val kmsKeyId: Output_[String] = js.native
  
  /**
    * A friendly name for identifying the grant.
    */
  val snapshotCopyGrantName: Output_[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
@js.native
object SnapshotCopyGrant extends js.Object {
  
  /**
    * Get an existing SnapshotCopyGrant resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SnapshotCopyGrant = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotCopyGrant = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyGrantState): SnapshotCopyGrant = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyGrantState, opts: CustomResourceOptions): SnapshotCopyGrant = js.native
  
  /**
    * Returns true if the given object is an instance of SnapshotCopyGrant.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/redshift/snapshotCopyGrant.SnapshotCopyGrant */ Boolean = js.native
}
