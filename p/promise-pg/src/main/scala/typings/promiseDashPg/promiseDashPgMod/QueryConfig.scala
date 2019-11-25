package typings.promiseDashPg.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig
  extends typings.pg.pgMod.QueryConfig[js.Array[js.Any]] {
  var buffer: js.UndefOr[Boolean] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(
    text: String,
    buffer: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    values: js.Array[js.Any] = null
  ): QueryConfig = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig]
  }
}

