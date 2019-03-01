package typings
package atPulumiAwsLib.rdsGlobalClusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalClusterArgs extends js.Object {
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
  val globalClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object GlobalClusterArgs {
  @scala.inline
  def apply(
    globalClusterIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    deletionProtection: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    engine: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    storageEncrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): GlobalClusterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("globalClusterIdentifier")(globalClusterIdentifier.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalClusterArgs]
  }
}

