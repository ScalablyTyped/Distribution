package typings.reactFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-fns.react-fns/dist/Scroll/Scroll.ScrollConfig> */
trait PartialScrollConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.undefined
}

object PartialScrollConfig {
  @scala.inline
  def apply(throttle: Int | Double = null): PartialScrollConfig = {
    val __obj = js.Dynamic.literal()
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollConfig]
  }
}

