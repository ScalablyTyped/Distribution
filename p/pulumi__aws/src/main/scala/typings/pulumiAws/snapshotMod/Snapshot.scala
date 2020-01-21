package typings.pulumiAws.snapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs/snapshot", "Snapshot")
@js.native
class Snapshot protected () extends CustomResource {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotArgs) = this()
  def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: Output_[String] = js.native
  /**
    * A description of what the snapshot is.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: Output_[Boolean] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: Output_[String] = js.native
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: Output_[String] = js.native
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: Output_[String] = js.native
  /**
    * A mapping of tags to assign to the snapshot
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: Output_[String] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ebs/snapshot", "Snapshot")
@js.native
object Snapshot extends js.Object {
  /**
    * Get an existing Snapshot resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState): Snapshot = js.native
  def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): Snapshot = js.native
  /**
    * Returns true if the given object is an instance of Snapshot.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
}

