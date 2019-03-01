package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options passed to Model.destroy in addition to truncate
  */
trait TruncateOptions
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * Only used in conjuction with TRUNCATE. Truncates  all tables that have foreign-key references to the
    * named table, or to any tables added to the group due to CASCADE.
    *
    * Defaults to false;
    */
  var cascade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete instead of setting deletedAt to current timestamp (only applicable if paranoid is enabled)
    *
    * Defaults to false;
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    logging: scala.Boolean | js.Function = null,
    searchPath: java.lang.String = null,
    transaction: Transaction = null
  ): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    __obj.asInstanceOf[TruncateOptions]
  }
}

