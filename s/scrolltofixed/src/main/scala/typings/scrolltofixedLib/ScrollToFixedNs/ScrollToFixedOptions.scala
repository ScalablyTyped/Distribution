package typings
package scrolltofixedLib.ScrollToFixedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollToFixedOptions extends js.Object {
  var baseClassName: js.UndefOr[java.lang.String] = js.undefined
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dontCheckForPositionFixedSupport: js.UndefOr[scala.Boolean] = js.undefined
  var dontSetWidth: js.UndefOr[scala.Boolean] = js.undefined
  var fixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var limit: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var marginTop: js.UndefOr[scala.Double | js.Function0[scala.Double]] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var offsets: js.UndefOr[scala.Boolean] = js.undefined
  var postAbsolute: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var postFixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var postUnfixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preAbsolute: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preFixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preUnfixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var removeOffsets: js.UndefOr[scala.Boolean] = js.undefined
  var spacerClass: js.UndefOr[java.lang.String] = js.undefined
  var unfixed: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ScrollToFixedOptions {
  @scala.inline
  def apply(
    baseClassName: java.lang.String = null,
    bottom: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    dontCheckForPositionFixedSupport: js.UndefOr[scala.Boolean] = js.undefined,
    dontSetWidth: js.UndefOr[scala.Boolean] = js.undefined,
    fixed: () => scala.Unit = null,
    limit: scala.Double | js.Function0[scala.Double] = null,
    marginTop: scala.Double | js.Function0[scala.Double] = null,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    offsets: js.UndefOr[scala.Boolean] = js.undefined,
    postAbsolute: () => scala.Unit = null,
    postFixed: () => scala.Unit = null,
    postUnfixed: () => scala.Unit = null,
    preAbsolute: () => scala.Unit = null,
    preFixed: () => scala.Unit = null,
    preUnfixed: () => scala.Unit = null,
    removeOffsets: js.UndefOr[scala.Boolean] = js.undefined,
    spacerClass: java.lang.String = null,
    unfixed: () => scala.Unit = null,
    zIndex: scala.Int | scala.Double = null
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

