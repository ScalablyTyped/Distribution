package typings
package promiseDashPgLib.promiseDashPgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig
  extends pgLib.pgMod.QueryConfig {
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(
    text: java.lang.String,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    values: js.Array[_] = null
  ): QueryConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryConfig]
  }
}

