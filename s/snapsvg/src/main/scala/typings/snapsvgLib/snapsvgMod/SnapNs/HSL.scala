package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSL extends js.Object {
  var h: scala.Double
  var l: scala.Double
  var s: scala.Double
}

object HSL {
  @scala.inline
  def apply(h: scala.Double, l: scala.Double, s: scala.Double): HSL = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("l")(l)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[HSL]
  }
}

