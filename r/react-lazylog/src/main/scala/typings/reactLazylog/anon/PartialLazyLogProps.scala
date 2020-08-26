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
@js.native
trait PartialLazyLogProps extends js.Object {
  var caseInsensitive: js.UndefOr[Boolean] = js.native
  var containerStyle: js.UndefOr[CSSProperties] = js.native
  var enableSearch: js.UndefOr[Boolean] = js.native
  var extraLines: js.UndefOr[Double] = js.native
  var fetchOptions: js.UndefOr[RequestInit] = js.native
  var follow: js.UndefOr[Boolean] = js.native
  var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.native
  var height: js.UndefOr[String | Double] = js.native
  var highlight: js.UndefOr[Double | js.Array[Double]] = js.native
  var highlightLineClassName: js.UndefOr[String] = js.native
  var lineClassName: js.UndefOr[String] = js.native
  var loadingComponent: js.UndefOr[js.Any] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.native
  var onHighlight: js.UndefOr[js.Function1[/* range */ Range, _]] = js.native
  var onLoad: js.UndefOr[js.Function0[_]] = js.native
  var overscanRowCount: js.UndefOr[Double] = js.native
  var rowHeight: js.UndefOr[Double] = js.native
  var scrollToLine: js.UndefOr[Double] = js.native
  var selectableLines: js.UndefOr[Boolean] = js.native
  var stream: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var text: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var websocket: js.UndefOr[Boolean] = js.native
  var websocketOptions: js.UndefOr[WebsocketOptions] = js.native
  var width: js.UndefOr[String | Double] = js.native
}

object PartialLazyLogProps {
  @scala.inline
  def apply(): PartialLazyLogProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLazyLogProps]
  }
  @scala.inline
  implicit class PartialLazyLogPropsOps[Self <: PartialLazyLogProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaseInsensitive(value: Boolean): Self = this.set("caseInsensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseInsensitive: Self = this.set("caseInsensitive", js.undefined)
    @scala.inline
    def setContainerStyle(value: CSSProperties): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    @scala.inline
    def setEnableSearch(value: Boolean): Self = this.set("enableSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSearch: Self = this.set("enableSearch", js.undefined)
    @scala.inline
    def setExtraLines(value: Double): Self = this.set("extraLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraLines: Self = this.set("extraLines", js.undefined)
    @scala.inline
    def setFetchOptions(value: RequestInit): Self = this.set("fetchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchOptions: Self = this.set("fetchOptions", js.undefined)
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setFormatPart(value: /* text */ String => ReactNode): Self = this.set("formatPart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatPart: Self = this.set("formatPart", js.undefined)
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHighlightVarargs(value: Double*): Self = this.set("highlight", js.Array(value :_*))
    @scala.inline
    def setHighlight(value: Double | js.Array[Double]): Self = this.set("highlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    @scala.inline
    def setHighlightLineClassName(value: String): Self = this.set("highlightLineClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightLineClassName: Self = this.set("highlightLineClassName", js.undefined)
    @scala.inline
    def setLineClassName(value: String): Self = this.set("lineClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineClassName: Self = this.set("lineClassName", js.undefined)
    @scala.inline
    def setLoadingComponent(value: js.Any): Self = this.set("loadingComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadingComponent: Self = this.set("loadingComponent", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ js.Any => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnHighlight(value: /* range */ Range => _): Self = this.set("onHighlight", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHighlight: Self = this.set("onHighlight", js.undefined)
    @scala.inline
    def setOnLoad(value: () => _): Self = this.set("onLoad", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnLoad: Self = this.set("onLoad", js.undefined)
    @scala.inline
    def setOverscanRowCount(value: Double): Self = this.set("overscanRowCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverscanRowCount: Self = this.set("overscanRowCount", js.undefined)
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    @scala.inline
    def setScrollToLine(value: Double): Self = this.set("scrollToLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToLine: Self = this.set("scrollToLine", js.undefined)
    @scala.inline
    def setSelectableLines(value: Boolean): Self = this.set("selectableLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectableLines: Self = this.set("selectableLines", js.undefined)
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWebsocket(value: Boolean): Self = this.set("websocket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocket: Self = this.set("websocket", js.undefined)
    @scala.inline
    def setWebsocketOptions(value: WebsocketOptions): Self = this.set("websocketOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsocketOptions: Self = this.set("websocketOptions", js.undefined)
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

