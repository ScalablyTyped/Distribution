package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sync Options
  *
  * @see Sequelize.sync
  */
trait SyncOptions extends js.Object {
  /**
    * Alters tables to fit models. Not recommended for production use. Deletes data in columns
    * that were removed or had their type changed in the model.
    */
  var alter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If force is true, each DAO will do DROP TABLE IF EXISTS ..., before it tries to create its own table
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If hooks is true then beforeSync, afterSync, beforBulkSync, afterBulkSync hooks will be called
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A function that logs sql queries, or false for no logging
    */
  var logging: js.UndefOr[js.Function | scala.Boolean] = js.undefined
  /**
    * Match a regex against the database name before syncing, a safety check for cases where force: true is
    * used in tests but not live code
    */
  var `match`: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
    * The schema that the tables should be created in. This can be overriden for each table in sequelize.define
    */
  var schema: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An optional parameter to specify the schema search_path (Postgres only)
    */
  var searchPath: js.UndefOr[java.lang.String] = js.undefined
}

object SyncOptions {
  @scala.inline
  def apply(
    alter: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    logging: js.Function | scala.Boolean = null,
    `match`: stdLib.RegExp = null,
    schema: java.lang.String = null,
    searchPath: java.lang.String = null
  ): SyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alter)) __obj.updateDynamic("alter")(alter)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    __obj.asInstanceOf[SyncOptions]
  }
}

