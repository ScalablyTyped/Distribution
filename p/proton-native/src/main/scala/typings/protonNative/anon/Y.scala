package typings.protonNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Y extends js.Object {
  var h: Double
  var y: Double
}

object Y {
  @scala.inline
  def apply(h: Double, y: Double): Y = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
}

