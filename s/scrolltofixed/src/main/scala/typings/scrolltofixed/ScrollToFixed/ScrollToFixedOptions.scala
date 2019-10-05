package typings.scrolltofixed.ScrollToFixed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToFixedOptions extends js.Object {
  var baseClassName: js.UndefOr[String] = js.undefined
  var bottom: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined
  var dontSetWidth: js.UndefOr[Boolean] = js.undefined
  var fixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var limit: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var marginTop: js.UndefOr[Double | js.Function0[Double]] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var offsets: js.UndefOr[Boolean] = js.undefined
  var postAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
  var postFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var postUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preAbsolute: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preFixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var preUnfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var removeOffsets: js.UndefOr[Boolean] = js.undefined
  var spacerClass: js.UndefOr[String] = js.undefined
  var unfixed: js.UndefOr[js.Function0[Unit]] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ScrollToFixedOptions {
  @scala.inline
  def apply(
    baseClassName: String = null,
    bottom: Int | Double = null,
    className: String = null,
    dontCheckForPositionFixedSupport: js.UndefOr[Boolean] = js.undefined,
    dontSetWidth: js.UndefOr[Boolean] = js.undefined,
    fixed: () => Unit = null,
    limit: Double | js.Function0[Double] = null,
    marginTop: Double | js.Function0[Double] = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    offsets: js.UndefOr[Boolean] = js.undefined,
    postAbsolute: () => Unit = null,
    postFixed: () => Unit = null,
    postUnfixed: () => Unit = null,
    preAbsolute: () => Unit = null,
    preFixed: () => Unit = null,
    preUnfixed: () => Unit = null,
    removeOffsets: js.UndefOr[Boolean] = js.undefined,
    spacerClass: String = null,
    unfixed: () => Unit = null,
    zIndex: Int | Double = null
  ): ScrollToFixedOptions = {
    val __obj = js.Dynamic.literal()
    if (baseClassName != null) __obj.updateDynamic("baseClassName")(baseClassName)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(dontCheckForPositionFixedSupport)) __obj.updateDynamic("dontCheckForPositionFixedSupport")(dontCheckForPositionFixedSupport)
    if (!js.isUndefined(dontSetWidth)) __obj.updateDynamic("dontSetWidth")(dontSetWidth)
    if (fixed != null) __obj.updateDynamic("fixed")(js.Any.fromFunction0(fixed))
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets)
    if (postAbsolute != null) __obj.updateDynamic("postAbsolute")(js.Any.fromFunction0(postAbsolute))
    if (postFixed != null) __obj.updateDynamic("postFixed")(js.Any.fromFunction0(postFixed))
    if (postUnfixed != null) __obj.updateDynamic("postUnfixed")(js.Any.fromFunction0(postUnfixed))
    if (preAbsolute != null) __obj.updateDynamic("preAbsolute")(js.Any.fromFunction0(preAbsolute))
    if (preFixed != null) __obj.updateDynamic("preFixed")(js.Any.fromFunction0(preFixed))
    if (preUnfixed != null) __obj.updateDynamic("preUnfixed")(js.Any.fromFunction0(preUnfixed))
    if (!js.isUndefined(removeOffsets)) __obj.updateDynamic("removeOffsets")(removeOffsets)
    if (spacerClass != null) __obj.updateDynamic("spacerClass")(spacerClass)
    if (unfixed != null) __obj.updateDynamic("unfixed")(js.Any.fromFunction0(unfixed))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollToFixedOptions]
  }
}

