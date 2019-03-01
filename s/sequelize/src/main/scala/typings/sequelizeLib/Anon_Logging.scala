package typings
package sequelizeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logging extends js.Object {
  var logging: js.UndefOr[scala.Boolean | js.Function] = js.undefined
  var schema: js.UndefOr[java.lang.String] = js.undefined
  var schemaDelimeter: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Logging {
  @scala.inline
  def apply(
    logging: scala.Boolean | js.Function = null,
    schema: java.lang.String = null,
    schemaDelimeter: java.lang.String = null
  ): Anon_Logging = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaDelimeter != null) __obj.updateDynamic("schemaDelimeter")(schemaDelimeter)
    __obj.asInstanceOf[Anon_Logging]
  }
}

