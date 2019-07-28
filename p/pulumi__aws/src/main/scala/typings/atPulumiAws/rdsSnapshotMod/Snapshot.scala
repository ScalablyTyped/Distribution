package typings.atPulumiAws.rdsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
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
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: Output[Double] = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: Output[String] = js.native
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: Output[String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: Output[String] = js.native
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: Output[Boolean] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: Output[String] = js.native
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: Output[String] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: Output[Double] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: Output[String] = js.native
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: Output[String] = js.native
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: Output[String] = js.native
  val port: Output[Double] = js.native
  val snapshotType: Output[String] = js.native
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: Output[String] = js.native
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: Output[String] = js.native
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: Output[String] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: Output[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val vpcId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/rds/snapshot.Snapshot */ Boolean = js.native
}

