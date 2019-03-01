package typings
package smoothieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LineWidth extends js.Object {
  var lineWidth: scala.Double
  var strokeStyle: java.lang.String
}

object Anon_LineWidth {
  @scala.inline
  def apply(lineWidth: scala.Double, strokeStyle: java.lang.String): Anon_LineWidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lineWidth")(lineWidth)
    __obj.updateDynamic("strokeStyle")(strokeStyle)
    __obj.asInstanceOf[Anon_LineWidth]
  }
}

