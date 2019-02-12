package typings
package atPulumiAwsLib.docdbClusterSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSnapshotState extends js.Object {
  /**
    * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DocDB Cluster Identifier from which to take the snapshot.
    */
  val dbClusterIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
    */
  val dbClusterSnapshotArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Identifier for the snapshot.
    */
  val dbClusterSnapshotIdentifier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies the name of the database engine.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Version of the database engine for this DocDB cluster snapshot.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Port that the DocDB cluster was listening on at the time of the snapshot.
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  val snapshotType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val sourceDbClusterSnapshotArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The status of this DocDB Cluster Snapshot.
    */
  val status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the DocDB cluster snapshot is encrypted.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The VPC ID associated with the DocDB cluster snapshot.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

