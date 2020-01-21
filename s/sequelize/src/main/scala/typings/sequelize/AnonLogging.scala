package typings.sequelize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLogging extends js.Object {
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  var schema: js.UndefOr[String] = js.undefined
  var schemaDelimeter: js.UndefOr[String] = js.undefined
}

object AnonLogging {
  @scala.inline
  def apply(logging: Boolean | js.Function = null, schema: String = null, schemaDelimeter: String = null): AnonLogging = {
    val __obj = js.Dynamic.literal()
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaDelimeter != null) __obj.updateDynamic("schemaDelimeter")(schemaDelimeter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLogging]
  }
}

