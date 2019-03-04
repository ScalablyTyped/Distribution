package typings
package rtlcssLib.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMap extends js.Object {
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var options: MapOptions
  var priority: scala.Double
  var replace: java.lang.String | js.Array[java.lang.String]
  var search: java.lang.String | js.Array[java.lang.String]
}

object StringMap {
  @scala.inline
  def apply(
    name: java.lang.String,
    options: MapOptions,
    priority: scala.Double,
    replace: java.lang.String | js.Array[java.lang.String],
    search: java.lang.String | js.Array[java.lang.String],
    exclusive: js.UndefOr[scala.Boolean] = js.undefined
  ): StringMap = {
    val __obj = js.Dynamic.literal(name = name, options = options, priority = priority, replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[StringMap]
  }
}

