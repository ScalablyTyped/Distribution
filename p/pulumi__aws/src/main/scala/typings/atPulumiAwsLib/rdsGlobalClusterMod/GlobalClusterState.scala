package typings
package atPulumiAwsLib.rdsGlobalClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalClusterState extends js.Object {
  /**
    * RDS Global Cluster Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name for an automatically created database on cluster creation.
    */
  val databaseName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Name of the database engine to be used for this DB cluster. Valid values: `aurora`. Defaults to `aurora`.
    */
  val engine: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Engine version of the Aurora global database.
    */
  val engineVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val globalClusterIdentifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * AWS Region-unique, immutable identifier for the global database cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the DB cluster is accessed
    */
  val globalClusterResourceId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object GlobalClusterState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deletionProtection: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    globalClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    globalClusterResourceId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    storageEncrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
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

