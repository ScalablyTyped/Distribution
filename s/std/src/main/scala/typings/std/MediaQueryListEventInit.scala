package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaQueryListEventInit extends EventInit {
  var matches: js.UndefOr[scala.Boolean] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
}

object MediaQueryListEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    matches: js.UndefOr[scala.Boolean] = js.undefined,
    media: java.lang.String = null
  ): MediaQueryListEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(matches)) __obj.updateDynamic("matches")(matches)
    if (media != null) __obj.updateDynamic("media")(media)
    __obj.asInstanceOf[MediaQueryListEventInit]
  }
}

