package typings
package atPulumiAwsLib.redshiftSnapshotCopyGrantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/redshift/snapshotCopyGrant", "SnapshotCopyGrant")
@js.native
class SnapshotCopyGrant protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SnapshotCopyGrant resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SnapshotCopyGrantArgs) = this()
  def this(name: java.lang.String, args: SnapshotCopyGrantArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The unique identifier for the customer master key (CMK) that the grant applies to. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. To specify a CMK in a different AWS account, you must use the key ARN. If not specified, the default key is used.
    */
  val kmsKeyId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A friendly name for identifying the grant.
    */
  val snapshotCopyGrantName: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState
  ): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrantState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.redshiftSnapshotCopyGrantMod.SnapshotCopyGrant = js.native
}

