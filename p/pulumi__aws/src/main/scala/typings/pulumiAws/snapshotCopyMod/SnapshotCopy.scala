package typings.pulumiAws.snapshotCopyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy")
@js.native
class SnapshotCopy protected () extends CustomResource {
  /**
    * Create a SnapshotCopy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SnapshotCopyArgs) = this()
  def this(name: String, args: SnapshotCopyArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the EBS Snapshot.
    */
  val arn: Output_[String] = js.native
  /**
    * The data encryption key identifier for the snapshot.
    * * `sourceSnapshotId` The ARN of the copied snapshot.
    * * `sourceRegion` The region of the source snapshot.
    */
  val dataEncryptionKeyId: Output_[String] = js.native
  /**
    * A description of what the snapshot is.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: Output_[js.UndefOr[String]] = js.native
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: Output_[String] = js.native
  /**
    * The AWS account ID of the snapshot owner.
    */
  val ownerId: Output_[String] = js.native
  /**
    * The region of the source snapshot.
    */
  val sourceRegion: Output_[String] = js.native
  /**
    * The ARN for the snapshot to be copied.
    */
  val sourceSnapshotId: Output_[String] = js.native
  /**
    * A map of tags for the snapshot.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  val volumeId: Output_[String] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ebs/snapshotCopy", "SnapshotCopy")
@js.native
object SnapshotCopy extends js.Object {
  /**
    * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SnapshotCopy = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SnapshotCopy = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyState): SnapshotCopy = js.native
  def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): SnapshotCopy = js.native
  /**
    * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
}

