package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
//  Model
// ~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/model.js
//
/**
  * Options to pass to Model on drop
  */
trait DropOptions extends LoggingOptions {
  /**
    * Also drop all objects depending on this table, such as views. Only works in postgres
    */
  var cascade: js.UndefOr[Boolean] = js.undefined
}

object DropOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    cascade: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null
  ): DropOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.get.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropOptions]
  }
}

