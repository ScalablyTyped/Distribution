package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactLazylog.buildLazyLogMod.WebsocketOptions
import typings.std.HTMLAnchorElement
import typings.std.Range
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientHeight extends StObject {
    
    var clientHeight: Double
    
    var scrollHeight: Double
    
    var scrollTop: Double
  }
  object ClientHeight {
    
    inline def apply(clientHeight: Double, scrollHeight: Double, scrollTop: Double): ClientHeight = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientHeight] (val x: Self) extends AnyVal {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/LazyLog.LazyLogProps> */
  trait PartialLazyLogProps extends StObject {
    
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
    
    var loadingComponent: js.UndefOr[Any] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Any]] = js.undefined
    
    var onHighlight: js.UndefOr[js.Function1[/* range */ Range, Any]] = js.undefined
    
    var onLoad: js.UndefOr[js.Function0[Any]] = js.undefined
    
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
    
    inline def apply(): PartialLazyLogProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLazyLogProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLazyLogProps] (val x: Self) extends AnyVal {
      
      inline def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      inline def setContainerStyle(value: CSSProperties): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setEnableSearch(value: Boolean): Self = StObject.set(x, "enableSearch", value.asInstanceOf[js.Any])
      
      inline def setEnableSearchUndefined: Self = StObject.set(x, "enableSearch", js.undefined)
      
      inline def setExtraLines(value: Double): Self = StObject.set(x, "extraLines", value.asInstanceOf[js.Any])
      
      inline def setExtraLinesUndefined: Self = StObject.set(x, "extraLines", js.undefined)
      
      inline def setFetchOptions(value: RequestInit): Self = StObject.set(x, "fetchOptions", value.asInstanceOf[js.Any])
      
      inline def setFetchOptionsUndefined: Self = StObject.set(x, "fetchOptions", js.undefined)
      
      inline def setFollow(value: Boolean): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setFormatPart(value: /* text */ String => ReactNode): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      inline def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlight(value: Double | js.Array[Double]): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightLineClassName(value: String): Self = StObject.set(x, "highlightLineClassName", value.asInstanceOf[js.Any])
      
      inline def setHighlightLineClassNameUndefined: Self = StObject.set(x, "highlightLineClassName", js.undefined)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setHighlightVarargs(value: Double*): Self = StObject.set(x, "highlight", js.Array(value*))
      
      inline def setLineClassName(value: String): Self = StObject.set(x, "lineClassName", value.asInstanceOf[js.Any])
      
      inline def setLineClassNameUndefined: Self = StObject.set(x, "lineClassName", js.undefined)
      
      inline def setLoadingComponent(value: Any): Self = StObject.set(x, "loadingComponent", value.asInstanceOf[js.Any])
      
      inline def setLoadingComponentUndefined: Self = StObject.set(x, "loadingComponent", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnHighlight(value: /* range */ Range => Any): Self = StObject.set(x, "onHighlight", js.Any.fromFunction1(value))
      
      inline def setOnHighlightUndefined: Self = StObject.set(x, "onHighlight", js.undefined)
      
      inline def setOnLoad(value: () => Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setOverscanRowCount(value: Double): Self = StObject.set(x, "overscanRowCount", value.asInstanceOf[js.Any])
      
      inline def setOverscanRowCountUndefined: Self = StObject.set(x, "overscanRowCount", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setScrollToLine(value: Double): Self = StObject.set(x, "scrollToLine", value.asInstanceOf[js.Any])
      
      inline def setScrollToLineUndefined: Self = StObject.set(x, "scrollToLine", js.undefined)
      
      inline def setSelectableLines(value: Boolean): Self = StObject.set(x, "selectableLines", value.asInstanceOf[js.Any])
      
      inline def setSelectableLinesUndefined: Self = StObject.set(x, "selectableLines", js.undefined)
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketOptions(value: WebsocketOptions): Self = StObject.set(x, "websocketOptions", value.asInstanceOf[js.Any])
      
      inline def setWebsocketOptionsUndefined: Self = StObject.set(x, "websocketOptions", js.undefined)
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/LineContent.LineContentProps> */
  trait PartialLineContentProps extends StObject {
    
    var data: js.UndefOr[js.Array[Text]] = js.undefined
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialLineContentProps {
    
    inline def apply(): PartialLineContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLineContentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLineContentProps] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormatPart(value: /* text */ String => ReactNode): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      inline def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/LineNumber.LineNumberProps> */
  trait PartialLineNumberProps extends StObject {
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialLineNumberProps {
    
    inline def apply(): PartialLineNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLineNumberProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLineNumberProps] (val x: Self) extends AnyVal {
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/LinePart.LinePartProps> */
  trait PartialLinePartProps extends StObject {
    
    var format: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
    
    var part: js.UndefOr[Text] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialLinePartProps {
    
    inline def apply(): PartialLinePartProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLinePartProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLinePartProps] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: /* text */ String => ReactNode): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setPart(value: Text): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/Line.LineProps> */
  trait PartialLineProps extends StObject {
    
    var data: js.UndefOr[js.Array[Text]] = js.undefined
    
    var formatPart: js.UndefOr[js.Function1[/* text */ String, ReactNode]] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var number: js.UndefOr[Double] = js.undefined
    
    var onLineNumberClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PartialLineProps {
    
    inline def apply(): PartialLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialLineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialLineProps] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Array[Text]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Text*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setFormatPart(value: /* text */ String => ReactNode): Self = StObject.set(x, "formatPart", js.Any.fromFunction1(value))
      
      inline def setFormatPartUndefined: Self = StObject.set(x, "formatPart", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setOnLineNumberClick(value: MouseEvent[HTMLAnchorElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onLineNumberClick", js.Any.fromFunction1(value))
      
      inline def setOnLineNumberClickUndefined: Self = StObject.set(x, "onLineNumberClick", js.undefined)
      
      inline def setOnRowClick(value: () => Any): Self = StObject.set(x, "onRowClick", js.Any.fromFunction0(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-lazylog.react-lazylog/build/SearchBar.SearchBarProps> */
  trait PartialSearchBarProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var filterActive: js.UndefOr[Boolean] = js.undefined
    
    var onClearSearch: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFilterLinesWithMatches: js.UndefOr[js.Function1[/* isFiltered */ Boolean, Unit]] = js.undefined
    
    var onSearch: js.UndefOr[js.Function1[/* keyword */ String, Unit]] = js.undefined
    
    var resultsCount: js.UndefOr[Double] = js.undefined
  }
  object PartialSearchBarProps {
    
    inline def apply(): PartialSearchBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSearchBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSearchBarProps] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFilterActive(value: Boolean): Self = StObject.set(x, "filterActive", value.asInstanceOf[js.Any])
      
      inline def setFilterActiveUndefined: Self = StObject.set(x, "filterActive", js.undefined)
      
      inline def setOnClearSearch(value: () => Unit): Self = StObject.set(x, "onClearSearch", js.Any.fromFunction0(value))
      
      inline def setOnClearSearchUndefined: Self = StObject.set(x, "onClearSearch", js.undefined)
      
      inline def setOnFilterLinesWithMatches(value: /* isFiltered */ Boolean => Unit): Self = StObject.set(x, "onFilterLinesWithMatches", js.Any.fromFunction1(value))
      
      inline def setOnFilterLinesWithMatchesUndefined: Self = StObject.set(x, "onFilterLinesWithMatches", js.undefined)
      
      inline def setOnSearch(value: /* keyword */ String => Unit): Self = StObject.set(x, "onSearch", js.Any.fromFunction1(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
      
      inline def setResultsCount(value: Double): Self = StObject.set(x, "resultsCount", value.asInstanceOf[js.Any])
      
      inline def setResultsCountUndefined: Self = StObject.set(x, "resultsCount", js.undefined)
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
