package typings.sourceMap

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
  def apply(column: Double, line: Double, source: String, bias: Int | Double = null, name: String = null): MappedPositionbiasnumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappedPositionbiasnumber]
  }
}

