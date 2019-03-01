package typings
package prettierLib.prettierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportOptionRange extends js.Object {
  var end: scala.Double
  var start: scala.Double
  var step: scala.Double
}

object SupportOptionRange {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double, step: scala.Double): SupportOptionRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[SupportOptionRange]
  }
}

