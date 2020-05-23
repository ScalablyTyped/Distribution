package typings.scroller.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var animating: js.UndefOr[Boolean] = js.undefined
  var animationDuration: js.UndefOr[Double] = js.undefined
  var bouncing: js.UndefOr[Boolean] = js.undefined
  var locking: js.UndefOr[Boolean] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var paging: js.UndefOr[Boolean] = js.undefined
  var scrollingX: js.UndefOr[Boolean] = js.undefined
  var scrollingY: js.UndefOr[Boolean] = js.undefined
  var snapping: js.UndefOr[Boolean] = js.undefined
  var zooming: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    bouncing: js.UndefOr[Boolean] = js.undefined,
    locking: js.UndefOr[Boolean] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    paging: js.UndefOr[Boolean] = js.undefined,
    scrollingX: js.UndefOr[Boolean] = js.undefined,
    scrollingY: js.UndefOr[Boolean] = js.undefined,
    snapping: js.UndefOr[Boolean] = js.undefined,
    zooming: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bouncing)) __obj.updateDynamic("bouncing")(bouncing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locking)) __obj.updateDynamic("locking")(locking.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paging)) __obj.updateDynamic("paging")(paging.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingX)) __obj.updateDynamic("scrollingX")(scrollingX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollingY)) __obj.updateDynamic("scrollingY")(scrollingY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapping)) __obj.updateDynamic("snapping")(snapping.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zooming)) __obj.updateDynamic("zooming")(zooming.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

