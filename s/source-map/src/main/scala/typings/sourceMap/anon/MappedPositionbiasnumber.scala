package typings.sourceMap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined source-map.source-map.MappedPosition & {  bias ? :number} */
trait MappedPositionbiasnumber extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var column: Double
  var line: Double
  var name: js.UndefOr[String] = js.undefined
  var source: String
}

object MappedPositionbiasnumber {
  @scala.inline
  def apply(
    column: Double,
    line: Double,
    source: String,
    bias: js.UndefOr[Double] = js.undefined,
    name: String = null
  ): MappedPositionbiasnumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (!js.isUndefined(bias)) __obj.updateDynamic("bias")(bias.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedPositionbiasnumber]
  }
}

