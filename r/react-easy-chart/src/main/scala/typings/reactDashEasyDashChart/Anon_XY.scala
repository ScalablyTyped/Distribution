package typings.reactDashEasyDashChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
}

object Anon_XY {
  @scala.inline
  def apply(x: String = null, y: String = null): Anon_XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Anon_XY]
  }
}

