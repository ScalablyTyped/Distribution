package typings
package reactDashLazylogLib.buildLazyLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LazyLogProps extends js.Object {
  var containerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var fetchOptions: js.UndefOr[stdLib.RequestInit] = js.undefined
  var follow: js.UndefOr[scala.Boolean] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var highlight: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onHighlight: js.UndefOr[js.Function1[/* range */ stdLib.Range, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var overscanRowCount: js.UndefOr[scala.Double] = js.undefined
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  var scrollToLine: js.UndefOr[scala.Double] = js.undefined
  var selectableLines: js.UndefOr[scala.Boolean] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var url: java.lang.String
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object LazyLogProps {
  @scala.inline
  def apply(
    url: java.lang.String,
    containerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    fetchOptions: stdLib.RequestInit = null,
    follow: js.UndefOr[scala.Boolean] = js.undefined,
    formatPart: js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode] = null,
    height: java.lang.String | scala.Double = null,
    highlight: scala.Double | js.Array[scala.Double] = null,
    onError: js.Function1[/* error */ js.Any, _] = null,
    onHighlight: js.Function1[/* range */ stdLib.Range, _] = null,
    onLoad: js.Function0[_] = null,
    overscanRowCount: scala.Int | scala.Double = null,
    rowHeight: scala.Int | scala.Double = null,
    scrollToLine: scala.Int | scala.Double = null,
    selectableLines: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    width: java.lang.String | scala.Double = null
  ): LazyLogProps = {
    val __obj = js.Dynamic.literal(url = url)
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle)
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions)
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow)
    if (formatPart != null) __obj.updateDynamic("formatPart")(formatPart)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onHighlight != null) __obj.updateDynamic("onHighlight")(onHighlight)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scrollToLine != null) __obj.updateDynamic("scrollToLine")(scrollToLine.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableLines)) __obj.updateDynamic("selectableLines")(selectableLines)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (style != null) __obj.updateDynamic("style")(style)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LazyLogProps]
  }
}

