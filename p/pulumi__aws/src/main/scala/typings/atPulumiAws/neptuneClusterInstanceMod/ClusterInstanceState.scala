package typings.atPulumiAws.neptuneClusterInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInstanceState extends js.Object {
  /**
    * The hostname of the instance. See also `endpoint` and `port`.
    */
  val address: js.UndefOr[Input[String]] = js.undefined
  /**
    * Specifies whether any instance modifications
    * are applied immediately, or during the next maintenance window. Default is`false`.
    */
  val applyImmediately: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of neptune instance
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
    */
  val autoMinorVersionUpgrade: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The EC2 Availability Zone that the neptune instance is created in.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The identifier of the [`aws_neptune_cluster`](https://www.terraform.io/docs/providers/aws/r/neptune_cluster.html) in which to launch this instance.
    */
  val clusterIdentifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * The region-unique, immutable identifier for the neptune instance.
    */
  val dbiResourceId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The connection endpoint in `address:port` format.
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
    */
  val engine: js.UndefOr[Input[String]] = js.undefined
  /**
    * The neptune engine version.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * The indentifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
    */
  val identifier: js.UndefOr[Input[String]] = js.undefined
  /**
    * Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * The instance class to use.
    */
  val instanceClass: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN for the KMS encryption key if one is set to the neptune cluster.
    */
  val kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the neptune parameter group to associate with this instance.
    */
  val neptuneParameterGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptune_subnet_group_name` of the attached [`aws_neptune_cluster`](https://www.terraform.io/docs/providers/aws/r/neptune_cluster.html).
    */
  val neptuneSubnetGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port on which the DB accepts connections. Defaults to `8182`.
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
    */
  val preferredBackupWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * The window to perform maintenance in.
    * Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
    */
  val preferredMaintenanceWindow: js.UndefOr[Input[String]] = js.undefined
  /**
    * Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
    */
  val promotionTier: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Bool to control if instance is publicly accessible. Default is `false`.
    */
  val publiclyAccessible: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether the neptune cluster is encrypted.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A mapping of tags to assign to the instance.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
    */
  val writer: js.UndefOr[Input[Boolean]] = js.undefined
}

object ClusterInstanceState {
  @scala.inline
  def apply(
    address: Input[String] = null,
    applyImmediately: Input[Boolean] = null,
    arn: Input[String] = null,
    autoMinorVersionUpgrade: Input[Boolean] = null,
    availabilityZone: Input[String] = null,
    clusterIdentifier: Input[String] = null,
    dbiResourceId: Input[String] = null,
    endpoint: Input[String] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    identifier: Input[String] = null,
    identifierPrefix: Input[String] = null,
    instanceClass: Input[String] = null,
    kmsKeyArn: Input[String] = null,
    neptuneParameterGroupName: Input[String] = null,
    neptuneSubnetGroupName: Input[String] = null,
    port: Input[Double] = null,
    preferredBackupWindow: Input[String] = null,
    preferredMaintenanceWindow: Input[String] = null,
    promotionTier: Input[Double] = null,
    publiclyAccessible: Input[Boolean] = null,
    storageEncrypted: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    writer: Input[Boolean] = null
  ): ClusterInstanceState = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (clusterIdentifier != null) __obj.updateDynamic("clusterIdentifier")(clusterIdentifier.asInstanceOf[js.Any])
    if (dbiResourceId != null) __obj.updateDynamic("dbiResourceId")(dbiResourceId.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (identifierPrefix != null) __obj.updateDynamic("identifierPrefix")(identifierPrefix.asInstanceOf[js.Any])
    if (instanceClass != null) __obj.updateDynamic("instanceClass")(instanceClass.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (neptuneParameterGroupName != null) __obj.updateDynamic("neptuneParameterGroupName")(neptuneParameterGroupName.asInstanceOf[js.Any])
    if (neptuneSubnetGroupName != null) __obj.updateDynamic("neptuneSubnetGroupName")(neptuneSubnetGroupName.asInstanceOf[js.Any])
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

