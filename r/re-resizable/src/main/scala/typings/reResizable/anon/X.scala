package typings.reResizable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: js.UndefOr[js.Array[Double]] = js.undefined
  var y: js.UndefOr[js.Array[Double]] = js.undefined
}

object X {
  @scala.inline
  def apply(x: js.Array[Double] = null, y: js.Array[Double] = null): X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

