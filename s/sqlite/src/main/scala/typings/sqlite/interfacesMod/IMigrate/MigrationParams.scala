package typings.sqlite.interfacesMod.IMigrate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationParams extends js.Object {
  /**
    * If true, will force the migration API to rollback and re-apply the latest migration over
    * again each time when Node.js app launches.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * Path to the migrations folder. Default is `path.join(process.cwd(), 'migrations')`
    */
  var migrationsPath: js.UndefOr[String] = js.undefined
  /**
    * Migrations table name. Default is 'migrations'
    */
  var table: js.UndefOr[String] = js.undefined
}

object MigrationParams {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined, migrationsPath: String = null, table: String = null): MigrationParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (migrationsPath != null) __obj.updateDynamic("migrationsPath")(migrationsPath.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationParams]
  }
}

