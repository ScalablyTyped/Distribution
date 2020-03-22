package typings.sourceMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined source-map.source-map.Position & {  bias ? :number} */
trait Positionbiasnumber extends js.Object {
  var bias: js.UndefOr[Double] = js.undefined
  var column: Double
  var line: Double
}

object Positionbiasnumber {
  @scala.inline
  def apply(column: Double, line: Double, bias: Int | Double = null): Positionbiasnumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (bias != null) __obj.updateDynamic("bias")(bias.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positionbiasnumber]
  }
}

