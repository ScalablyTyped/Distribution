package typings.pulumiAws.globalClusterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalClusterArgs extends js.Object {
  /**
    * Name for an automatically created database on cluster creation.
    */
  val databaseName: js.UndefOr[Input[String]] = js.native
  /**
    * If the Global Cluster should have deletion protection enabled. The database can't be deleted when this value is set to `true`. The default is `false`.
    */
  val deletionProtection: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Name of the database engine to be used for this DB cluster. Valid values: `aurora`. Defaults to `aurora`.
    */
  val engine: js.UndefOr[Input[String]] = js.native
  /**
    * Engine version of the Aurora global database.
    */
  val engineVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The global cluster identifier.
    */
  val globalClusterIdentifier: Input[String] = js.native
  /**
    * Specifies whether the DB cluster is encrypted. The default is `false`.
    */
  val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
}

object GlobalClusterArgs {
  @scala.inline
  def apply(
    globalClusterIdentifier: Input[String],
    databaseName: Input[String] = null,
    deletionProtection: Input[Boolean] = null,
    engine: Input[String] = null,
    engineVersion: Input[String] = null,
    storageEncrypted: Input[Boolean] = null
  ): GlobalClusterArgs = {
    val __obj = js.Dynamic.literal(globalClusterIdentifier = globalClusterIdentifier.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (deletionProtection != null) __obj.updateDynamic("deletionProtection")(deletionProtection.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (storageEncrypted != null) __obj.updateDynamic("storageEncrypted")(storageEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalClusterArgs]
  }
}

