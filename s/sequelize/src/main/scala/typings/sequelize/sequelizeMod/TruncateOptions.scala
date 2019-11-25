package typings.sequelize.sequelizeMod

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
  var cascade: js.UndefOr[Boolean] = js.undefined
  /**
    * Delete instead of setting deletedAt to current timestamp (only applicable if paranoid is enabled)
    *
    * Defaults to false;
    */
  var force: js.UndefOr[Boolean] = js.undefined
}

object TruncateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    cascade: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    searchPath: String = null,
    transaction: Transaction = null
  ): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[TruncateOptions]
  }
}

