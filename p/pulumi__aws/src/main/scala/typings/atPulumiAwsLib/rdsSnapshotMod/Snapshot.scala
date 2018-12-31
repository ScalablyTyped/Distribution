package typings
package atPulumiAwsLib.rdsSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/rds/snapshot", "Snapshot")
@js.native
class Snapshot protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a Snapshot resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SnapshotArgs) = this()
  def this(name: java.lang.String, args: SnapshotArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Specifies the allocated storage size in gigabytes (GB).
    */
  val allocatedStorage: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  val availabilityZone: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The DB Instance Identifier from which to take the snapshot.
    */
  val dbInstanceIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  val dbSnapshotArn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The Identifier for the snapshot.
    */
  val dbSnapshotIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  val encrypted: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * Specifies the name of the database engine.
    */
  val engine: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the version of the database engine.
    */
  val engineVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  val iops: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * License model information for the restored DB instance.
    */
  val licenseModel: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Provides the option group name for the DB snapshot.
    */
  val optionGroupName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val port: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  val snapshotType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The DB snapshot Arn that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
    */
  val sourceDbSnapshotIdentifier: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The region that the DB snapshot was created in or copied from.
    */
  val sourceRegion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the status of this DB snapshot.
    */
  val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val storageType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  val vpcId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState
  ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.rdsSnapshotMod.SnapshotState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.rdsSnapshotMod.Snapshot = js.native
}

