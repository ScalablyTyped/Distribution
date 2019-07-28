package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingOptions extends js.Object {
  /**
    * Print query execution time in milliseconds when logging SQL.
    */
  var benchmark: js.UndefOr[Boolean] = js.undefined
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
}

object LoggingOptions {
  @scala.inline
  def apply(benchmark: js.UndefOr[Boolean] = js.undefined, logging: Boolean | js.Function = null): LoggingOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingOptions]
  }
}

