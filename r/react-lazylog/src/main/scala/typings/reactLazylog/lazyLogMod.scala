package typings.reactLazylog

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactLazylog.anon.PartialLazyLogProps
import typings.std.CloseEvent
import typings.std.Event
import typings.std.Range
import typings.std.RequestInit
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyLogMod {
  
  @JSImport("react-lazylog/build/LazyLog", JSImport.Default)
  @js.native
  open class default protected () extends LazyLog {
    def this(props: LazyLogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LazyLogProps, context: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-lazylog/build/LazyLog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LazyLog", "default.defaultProps")
    @js.native
    def defaultProps: PartialLazyLogProps = js.native
    inline def defaultProps_=(x: PartialLazyLogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-lazylog/build/LazyLog", "LazyLog")
  @js.native
  open class LazyLog protected ()
    extends Component[LazyLogProps, js.Object, Any] {
    def this(props: LazyLogProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LazyLogProps, context: Any) = this()
  }
  /* static members */
  object LazyLog {
    
    @JSImport("react-lazylog/build/LazyLog", "LazyLog")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-lazylog/build/LazyLog", "LazyLog.defaultProps")
    @js.native
    def defaultProps: PartialLazyLogProps = js.native
    inline def defaultProps_=(x: PartialLazyLogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait LazyLogProps extends StObject {
    
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
    
    var url: String
    
    var websocket: js.UndefOr[Boolean] = js.undefined
    
    var websocketOptions: js.UndefOr[WebsocketOptions] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object LazyLogProps {
    
    inline def apply(url: String): LazyLogProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[LazyLogProps]
    }
    
    extension [Self <: LazyLogProps](x: Self) {
      
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
      
      inline def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketOptions(value: WebsocketOptions): Self = StObject.set(x, "websocketOptions", value.asInstanceOf[js.Any])
      
      inline def setWebsocketOptionsUndefined: Self = StObject.set(x, "websocketOptions", js.undefined)
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait WebsocketOptions extends StObject {
    
    var formatMessage: js.UndefOr[js.Function1[/* message */ Any, String]] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ CloseEvent, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function2[/* e */ Event, /* socket */ WebSocket, Unit]] = js.undefined
  }
  object WebsocketOptions {
    
    inline def apply(): WebsocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsocketOptions]
    }
    
    extension [Self <: WebsocketOptions](x: Self) {
      
      inline def setFormatMessage(value: /* message */ Any => String): Self = StObject.set(x, "formatMessage", js.Any.fromFunction1(value))
      
      inline def setFormatMessageUndefined: Self = StObject.set(x, "formatMessage", js.undefined)
      
      inline def setOnClose(value: /* e */ CloseEvent => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: /* e */ Event => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnOpen(value: (/* e */ Event, /* socket */ WebSocket) => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction2(value))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    }
  }
}
