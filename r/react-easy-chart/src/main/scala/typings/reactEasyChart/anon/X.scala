package typings.reactEasyChart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
  var y2: js.UndefOr[String] = js.undefined
}

object X {
  @scala.inline
  def apply(x: String = null, y: String = null, y2: String = null): X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

