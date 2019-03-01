package typings
package reactDashMapDashGlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Scale extends js.Object {
  var scale: scala.Double
  var startPos: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
}

object Anon_Scale {
  @scala.inline
  def apply(scale: scala.Double, startPos: js.Tuple2[scala.Double, scala.Double] = null): Anon_Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scale")(scale)
    if (startPos != null) __obj.updateDynamic("startPos")(startPos)
    __obj.asInstanceOf[Anon_Scale]
  }
}

