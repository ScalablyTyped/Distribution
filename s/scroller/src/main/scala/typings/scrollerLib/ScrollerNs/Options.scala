package typings
package scrollerLib.ScrollerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var animating: js.UndefOr[scala.Boolean] = js.undefined
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var bouncing: js.UndefOr[scala.Boolean] = js.undefined
  var locking: js.UndefOr[scala.Boolean] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  var paging: js.UndefOr[scala.Boolean] = js.undefined
  var scrollingX: js.UndefOr[scala.Boolean] = js.undefined
  var scrollingY: js.UndefOr[scala.Boolean] = js.undefined
  var snapping: js.UndefOr[scala.Boolean] = js.undefined
  var zooming: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    animationDuration: scala.Int | scala.Double = null,
    bouncing: js.UndefOr[scala.Boolean] = js.undefined,
    locking: js.UndefOr[scala.Boolean] = js.undefined,
    maxZoom: scala.Int | scala.Double = null,
    minZoom: scala.Int | scala.Double = null,
    paging: js.UndefOr[scala.Boolean] = js.undefined,
    scrollingX: js.UndefOr[scala.Boolean] = js.undefined,
    scrollingY: js.UndefOr[scala.Boolean] = js.undefined,
    snapping: js.UndefOr[scala.Boolean] = js.undefined,
    zooming: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncing)) __obj.updateDynamic("bouncing")(bouncing)
    if (!js.isUndefined(locking)) __obj.updateDynamic("locking")(locking)
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minZoom != null) __obj.updateDynamic("minZoom")(minZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging)
    if (!js.isUndefined(scrollingX)) __obj.updateDynamic("scrollingX")(scrollingX)
    if (!js.isUndefined(scrollingY)) __obj.updateDynamic("scrollingY")(scrollingY)
    if (!js.isUndefined(snapping)) __obj.updateDynamic("snapping")(snapping)
    if (zooming != null) __obj.updateDynamic("zooming")(zooming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

