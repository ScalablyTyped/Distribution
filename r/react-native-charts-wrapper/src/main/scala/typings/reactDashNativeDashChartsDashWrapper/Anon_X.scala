package typings.reactDashNativeDashChartsDashWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_X extends js.Object {
  var x: js.UndefOr[Anon_Max] = js.undefined
  var y: js.UndefOr[Anon_Left] = js.undefined
}

object Anon_X {
  @scala.inline
  def apply(x: Anon_Max = null, y: Anon_Left = null): Anon_X = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_X]
  }
}

