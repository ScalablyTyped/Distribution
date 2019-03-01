package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Schema Options provided for applying a schema to a model
  */
trait SchemaOptions extends LoggingOptions {
  /**
    * The character(s) that separates the schema name from the table name
    */
  var schemaDelimeter: js.UndefOr[java.lang.String] = js.undefined
}

object SchemaOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    logging: scala.Boolean | js.Function = null,
    schemaDelimeter: java.lang.String = null
  ): SchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (schemaDelimeter != null) __obj.updateDynamic("schemaDelimeter")(schemaDelimeter)
    __obj.asInstanceOf[SchemaOptions]
  }
}

