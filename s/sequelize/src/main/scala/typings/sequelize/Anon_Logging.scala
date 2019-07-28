package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Logging extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  var schema: js.UndefOr[String] = js.undefined
  var schemaDelimeter: js.UndefOr[String] = js.undefined
}

object Anon_Logging {
  @scala.inline
  def apply(logging: Boolean | js.Function = null, schema: String = null, schemaDelimeter: String = null): Anon_Logging = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (schemaDelimeter != null) __obj.updateDynamic("schemaDelimeter")(schemaDelimeter)
    __obj.asInstanceOf[Anon_Logging]
  }
}

