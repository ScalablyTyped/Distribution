package typings.smoothScrollbar.anon

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
    offsetBottom: js.UndefOr[Double] = js.undefined,
    offsetLeft: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined,
    onlyScrollIfNeeded: js.UndefOr[Boolean] = js.undefined
  ): PartialScrollIntoViewOpti = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottom)) __obj.updateDynamic("offsetBottom")(offsetBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeft)) __obj.updateDynamic("offsetLeft")(offsetLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyScrollIfNeeded)) __obj.updateDynamic("onlyScrollIfNeeded")(onlyScrollIfNeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollIntoViewOpti]
  }
}

