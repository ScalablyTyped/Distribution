package typings.rtlcss.rtlcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringMap extends js.Object {
  var exclusive: js.UndefOr[Boolean] = js.undefined
  var name: String
  var options: MapOptions
  var priority: Double
  var replace: String | js.Array[String]
  var search: String | js.Array[String]
}

object StringMap {
  @scala.inline
  def apply(
    name: String,
    options: MapOptions,
    priority: Double,
    replace: String | js.Array[String],
    search: String | js.Array[String],
    exclusive: js.UndefOr[Boolean] = js.undefined
  ): StringMap = {
    val __obj = js.Dynamic.literal(name = name, options = options, priority = priority, replace = replace.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    __obj.asInstanceOf[StringMap]
  }
}

