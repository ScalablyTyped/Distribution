package typings.reactLazylog.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactLazylog.lazyLogMod.WebsocketOptions
import typings.std.Range
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-lazylog.react-lazylog/build/LazyLog.LazyLogProps> */
trait PartialLazyLogProps extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.undefined
  var containerStyle: js.UndefOr[CSSProperties] = js.undefined
  var enableSearch: js.UndefOr[Boolean] = js.undefined
  var extraLines: js.UndefOr[Double] = js.undefined
  var fetchOptions: js.UndefOr[RequestInit] = js.undefined
  var follow: js.UndefOr[Boolean] = js.undefined
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var highlight: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var highlightLineClassName: js.UndefOr[String] = js.undefined
  var lineClassName: js.UndefOr[String] = js.undefined
  var loadingComponent: js.UndefOr[js.Any] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onHighlight: js.UndefOr[js.Function1[/* range */ Range, _]] = js.undefined
  var onLoad: js.UndefOr[js.Function0[_]] = js.undefined
  var overscanRowCount: js.UndefOr[Double] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var scrollToLine: js.UndefOr[Double] = js.undefined
  var selectableLines: js.UndefOr[Boolean] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var websocket: js.UndefOr[Boolean] = js.undefined
  var websocketOptions: js.UndefOr[WebsocketOptions] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object PartialLazyLogProps {
  @scala.inline
  def apply(
    caseInsensitive: js.UndefOr[Boolean] = js.undefined,
    containerStyle: CSSProperties = null,
    enableSearch: js.UndefOr[Boolean] = js.undefined,
    extraLines: js.UndefOr[Double] = js.undefined,
    fetchOptions: RequestInit = null,
    follow: js.UndefOr[Boolean] = js.undefined,
    formatPart: /* text */ String => ReactNode = null,
    height: String | Double = null,
    highlight: Double | js.Array[Double] = null,
    highlightLineClassName: String = null,
    lineClassName: String = null,
    loadingComponent: js.Any = null,
    onError: /* error */ js.Any => _ = null,
    onHighlight: /* range */ Range => _ = null,
    onLoad: () => _ = null,
    overscanRowCount: js.UndefOr[Double] = js.undefined,
    rowHeight: js.UndefOr[Double] = js.undefined,
    scrollToLine: js.UndefOr[Double] = js.undefined,
    selectableLines: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    text: String = null,
    url: String = null,
    websocket: js.UndefOr[Boolean] = js.undefined,
    websocketOptions: WebsocketOptions = null,
    width: String | Double = null
  ): PartialLazyLogProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseInsensitive)) __obj.updateDynamic("caseInsensitive")(caseInsensitive.get.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSearch)) __obj.updateDynamic("enableSearch")(enableSearch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(extraLines)) __obj.updateDynamic("extraLines")(extraLines.get.asInstanceOf[js.Any])
    if (fetchOptions != null) __obj.updateDynamic("fetchOptions")(fetchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (formatPart != null) __obj.updateDynamic("formatPart")(js.Any.fromFunction1(formatPart))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (highlight != null) __obj.updateDynamic("highlight")(highlight.asInstanceOf[js.Any])
    if (highlightLineClassName != null) __obj.updateDynamic("highlightLineClassName")(highlightLineClassName.asInstanceOf[js.Any])
    if (lineClassName != null) __obj.updateDynamic("lineClassName")(lineClassName.asInstanceOf[js.Any])
    if (loadingComponent != null) __obj.updateDynamic("loadingComponent")(loadingComponent.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onHighlight != null) __obj.updateDynamic("onHighlight")(js.Any.fromFunction1(onHighlight))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (!js.isUndefined(overscanRowCount)) __obj.updateDynamic("overscanRowCount")(overscanRowCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowHeight)) __obj.updateDynamic("rowHeight")(rowHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToLine)) __obj.updateDynamic("scrollToLine")(scrollToLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableLines)) __obj.updateDynamic("selectableLines")(selectableLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(websocket)) __obj.updateDynamic("websocket")(websocket.get.asInstanceOf[js.Any])
    if (websocketOptions != null) __obj.updateDynamic("websocketOptions")(websocketOptions.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialLazyLogProps]
  }
}

