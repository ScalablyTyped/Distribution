package typings
package atPulumiAwsLib.docdbClusterInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceState extends js.Object {
  /**
    * Specifies whether any database modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of cluster instance
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance window. Default `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The EC2 Availability Zone that the DB instance is created in. See [docs](https://docs.aws.amazon.com/AmazonDocDB/latest/APIReference/API_CreateDBInstance.html) about the details.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifier of the [`aws_docdb_cluster`](https://www.terraform.io/docs/providers/aws/r/docdb_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DB subnet group to associate with this DB instance.
    */
  val dbSubnetGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The region-unique, immutable identifier for the DB instance.
    */
  val dbiResourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The DNS address for this instance. May not be writable
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the database engine to be used for the DocDB instance. Defaults to `docdb`. Valid Values: `docdb`.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database engine version
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The indentifier for the DocDB instance, if omitted, Terraform will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifer`.
    */
  val identifierPrefix: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The instance class to use. For details on CPU and memory, see [Scaling for DocDB Instances][2]. DocDB currently
    * supports the below instance classes. Please see [AWS Documentation][4] for complete details.
    * - db.r4.large
    * - db.r4.xlarge
    * - db.r4.2xlarge
    * - db.r4.4xlarge
    * - db.r4.8xlarge
    * - db.r4.16xlarge
    */
  val instanceClass: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN for the KMS encryption key if one is set to the cluster.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database port
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled.
    */
  val preferredBackupWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object ClusterInstanceState {
  @scala.inline
  def apply(
    applyImmediately: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    autoMinorVersionUpgrade: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    clusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dbSubnetGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dbiResourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    identifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    identifierPrefix: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceClass: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    preferredBackupWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    preferredMaintenanceWindow: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    promotionTier: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    publiclyAccessible: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    storageEncrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    writer: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): ClusterInstanceState = {
    val __obj = js.Dynamic.literal()
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (dbSubnetGroupName != null) __obj.updateDynamic("dbSubnetGroupName")(dbSubnetGroupName.asInstanceOf[js.Any])
    if (dbiResourceId != null) __obj.updateDynamic("dbiResourceId")(dbiResourceId.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (identifierPrefix != null) __obj.updateDynamic("identifierPrefix")(identifierPrefix.asInstanceOf[js.Any])
    if (instanceClass != null) __obj.updateDynamic("instanceClass")(instanceClass.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (promotionTier != null) __obj.updateDynamic("promotionTier")(promotionTier.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterInstanceState]
  }
}

