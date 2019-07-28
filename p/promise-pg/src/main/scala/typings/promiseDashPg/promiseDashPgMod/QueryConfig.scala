package typings.promiseDashPg.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig
  extends typings.pg.pgMod.QueryConfig {
  var buffer: js.UndefOr[Boolean] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(
    text: String,
    buffer: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    values: js.Array[_] = null
  ): QueryConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryConfig]
  }
}

