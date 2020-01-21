package typings.smoothScrollbar.overscrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscrollOptions extends js.Object {
  var damping: Double
  var effect: js.UndefOr[OverscrollEffect] = js.undefined
  var glowColor: String
  var maxOverscroll: Double
  var onScroll: js.UndefOr[OnScrollCallback] = js.undefined
}

object OverscrollOptions {
  @scala.inline
  def apply(
    damping: Double,
    glowColor: String,
    maxOverscroll: Double,
    effect: OverscrollEffect = null,
    onScroll: OnScrollCallback = null
  ): OverscrollOptions = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], glowColor = glowColor.asInstanceOf[js.Any], maxOverscroll = maxOverscroll.asInstanceOf[js.Any])
    if (effect != null) __obj.updateDynamic("effect")(effect.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverscrollOptions]
  }
}

