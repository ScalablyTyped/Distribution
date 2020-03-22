package typings.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollIntoViewOptions> */
trait PartialScrollIntoViewOpti extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.undefined
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  var onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
}

object PartialScrollIntoViewOpti {
  @scala.inline
  def apply(
    alignToTop: js.UndefOr[Boolean] = js.undefined,
    offsetBottom: Int | Double = null,
    offsetLeft: Int | Double = null,
    offsetTop: Int | Double = null,
    onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
  ): PartialScrollIntoViewOpti = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyScrollIfNeeded)) __obj.updateDynamic("onlyScrollIfNeeded")(onlyScrollIfNeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollIntoViewOpti]
  }
}

