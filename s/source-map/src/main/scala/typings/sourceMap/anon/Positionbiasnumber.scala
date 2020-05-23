package typings.sourceMap.anon

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
  def apply(column: Double, line: Double, bias: js.UndefOr[Double] = js.undefined): Positionbiasnumber = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(bias)) __obj.updateDynamic("bias")(bias.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positionbiasnumber]
  }
}

