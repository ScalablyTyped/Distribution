package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPointInit extends js.Object {
  var w: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
  var z: js.UndefOr[Double] = js.undefined
}

object DOMPointInit {
  @scala.inline
  def apply(w: Int | Double = null, x: Int | Double = null, y: Int | Double = null, z: Int | Double = null): DOMPointInit = {
    val __obj = js.Dynamic.literal()
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointInit]
  }
}

