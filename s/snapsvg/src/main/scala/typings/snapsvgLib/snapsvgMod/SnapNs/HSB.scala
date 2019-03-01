package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HSB extends js.Object {
  var b: scala.Double
  var h: scala.Double
  var s: scala.Double
}

object HSB {
  @scala.inline
  def apply(b: scala.Double, h: scala.Double, s: scala.Double): HSB = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("b")(b)
    __obj.updateDynamic("h")(h)
    __obj.updateDynamic("s")(s)
    __obj.asInstanceOf[HSB]
  }
}

