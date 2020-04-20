package typings.pulumiAws.globalClusterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalClusterState extends js.Object {
  /**
    * RDS Global Cluster Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Name for an automatically created database on cluster creation.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the database engine to be used for this DB cluster. Valid values: `aurora`, `aurora-mysql`, `aurora-postgresql`. Defaults to `aurora`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Engine version of the Aurora global database.
    * * **NOTE:** When the engine is set to `aurora-mysql`, an engine version compatible with global database is required. The earliest available version is `5.7.mysql_aurora.2.06.0`.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The global cluster identifier.
    */
  val globalClusterIdentifier: js.UndefOr[Input[String]] = js.native
  /**
    * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
    */
  val globalClusterResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
}

object GlobalClusterState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    databaseName: Input[String] = null,
    deletionProtection: Input[Boolean] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    globalClusterIdentifier: Input[String] = null,
    globalClusterResourceId: Input[String] = null,
    storageEncrypted: Input[Boolean] = null
  ): GlobalClusterState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (globalClusterIdentifier != null) __obj.updateDynamic("globalClusterIdentifier")(globalClusterIdentifier.asInstanceOf[js.Any])
    if (globalClusterResourceId != null) __obj.updateDynamic("globalClusterResourceId")(globalClusterResourceId.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalClusterState]
  }
}

