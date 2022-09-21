package typings.reactCustomScrollbars

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.HTMLProps
import typings.react.mod.NativeUIEvent
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-custom-scrollbars", JSImport.Default)
  @js.native
  open class default protected () extends Scrollbars {
    def this(props: ScrollbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollbarProps, context: Any) = this()
  }
  
  @JSImport("react-custom-scrollbars", "Scrollbars")
  @js.native
  open class Scrollbars protected ()
    extends Component[ScrollbarProps, js.Object, Any] {
    def this(props: ScrollbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollbarProps, context: Any) = this()
    
    def getClientHeight(): Double = js.native
    
    def getClientWidth(): Double = js.native
    
    def getScrollHeight(): Double = js.native
    
    def getScrollLeft(): Double = js.native
    
    def getScrollTop(): Double = js.native
    
    def getScrollWidth(): Double = js.native
    
    def getValues(): positionValues = js.native
    
    def scrollLeft(left: Double): Unit = js.native
    
    def scrollToBottom(): Unit = js.native
    
    def scrollToLeft(): Unit = js.native
    
    def scrollToRight(): Unit = js.native
    
    def scrollToTop(): Unit = js.native
    
    def scrollTop(top: Double): Unit = js.native
  }
  
  trait ScrollbarProps
    extends StObject
       with HTMLProps[Scrollbars] {
    
    var autoHeight: js.UndefOr[Boolean] = js.undefined
    
    var autoHeightMax: js.UndefOr[Double | String] = js.undefined
    
    var autoHeightMin: js.UndefOr[Double | String] = js.undefined
    
    var autoHide: js.UndefOr[Boolean] = js.undefined
    
    var autoHideDuration: js.UndefOr[Double] = js.undefined
    
    var autoHideTimeout: js.UndefOr[Double] = js.undefined
    
    var hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.undefined
    
    var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.undefined
    
    var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onScrollStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    @JSName("onScroll")
    var onScroll_ScrollbarProps: js.UndefOr[UIEventHandler[Any]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.undefined
    
    var renderThumbHorizontal: js.UndefOr[FunctionComponent[Any]] = js.undefined
    
    var renderThumbVertical: js.UndefOr[FunctionComponent[Any]] = js.undefined
    
    var renderTrackHorizontal: js.UndefOr[FunctionComponent[Any]] = js.undefined
    
    var renderTrackVertical: js.UndefOr[FunctionComponent[Any]] = js.undefined
    
    var renderView: js.UndefOr[FunctionComponent[Any]] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var thumbMinSize: js.UndefOr[Double] = js.undefined
    
    var thumbSize: js.UndefOr[Double] = js.undefined
    
    var universal: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollbarProps {
    
    inline def apply(): ScrollbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarProps]
    }
    
    extension [Self <: ScrollbarProps](x: Self) {
      
      inline def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightMax(value: Double | String): Self = StObject.set(x, "autoHeightMax", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightMaxUndefined: Self = StObject.set(x, "autoHeightMax", js.undefined)
      
      inline def setAutoHeightMin(value: Double | String): Self = StObject.set(x, "autoHeightMin", value.asInstanceOf[js.Any])
      
      inline def setAutoHeightMinUndefined: Self = StObject.set(x, "autoHeightMin", js.undefined)
      
      inline def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      inline def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      inline def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      inline def setAutoHideTimeout(value: Double): Self = StObject.set(x, "autoHideTimeout", value.asInstanceOf[js.Any])
      
      inline def setAutoHideTimeoutUndefined: Self = StObject.set(x, "autoHideTimeout", js.undefined)
      
      inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      inline def setHideTracksWhenNotNeeded(value: Boolean): Self = StObject.set(x, "hideTracksWhenNotNeeded", value.asInstanceOf[js.Any])
      
      inline def setHideTracksWhenNotNeededUndefined: Self = StObject.set(x, "hideTracksWhenNotNeeded", js.undefined)
      
      inline def setOnScroll(value: UIEvent[Any, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      inline def setOnScrollFrame(value: /* values */ positionValues => Unit): Self = StObject.set(x, "onScrollFrame", js.Any.fromFunction1(value))
      
      inline def setOnScrollFrameUndefined: Self = StObject.set(x, "onScrollFrame", js.undefined)
      
      inline def setOnScrollStart(value: () => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction0(value))
      
      inline def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      inline def setOnScrollStop(value: () => Unit): Self = StObject.set(x, "onScrollStop", js.Any.fromFunction0(value))
      
      inline def setOnScrollStopUndefined: Self = StObject.set(x, "onScrollStop", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnUpdate(value: /* values */ positionValues => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setRenderThumbHorizontal(value: FunctionComponent[Any]): Self = StObject.set(x, "renderThumbHorizontal", value.asInstanceOf[js.Any])
      
      inline def setRenderThumbHorizontalUndefined: Self = StObject.set(x, "renderThumbHorizontal", js.undefined)
      
      inline def setRenderThumbVertical(value: FunctionComponent[Any]): Self = StObject.set(x, "renderThumbVertical", value.asInstanceOf[js.Any])
      
      inline def setRenderThumbVerticalUndefined: Self = StObject.set(x, "renderThumbVertical", js.undefined)
      
      inline def setRenderTrackHorizontal(value: FunctionComponent[Any]): Self = StObject.set(x, "renderTrackHorizontal", value.asInstanceOf[js.Any])
      
      inline def setRenderTrackHorizontalUndefined: Self = StObject.set(x, "renderTrackHorizontal", js.undefined)
      
      inline def setRenderTrackVertical(value: FunctionComponent[Any]): Self = StObject.set(x, "renderTrackVertical", value.asInstanceOf[js.Any])
      
      inline def setRenderTrackVerticalUndefined: Self = StObject.set(x, "renderTrackVertical", js.undefined)
      
      inline def setRenderView(value: FunctionComponent[Any]): Self = StObject.set(x, "renderView", value.asInstanceOf[js.Any])
      
      inline def setRenderViewUndefined: Self = StObject.set(x, "renderView", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      inline def setThumbMinSizeUndefined: Self = StObject.set(x, "thumbMinSize", js.undefined)
      
      inline def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
      
      inline def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
      
      inline def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
      
      inline def setUniversalUndefined: Self = StObject.set(x, "universal", js.undefined)
    }
  }
  
  trait positionValues extends StObject {
    
    var clientHeight: Double
    
    var clientWidth: Double
    
    var left: Double
    
    var scrollHeight: Double
    
    var scrollLeft: Double
    
    var scrollTop: Double
    
    var scrollWidth: Double
    
    var top: Double
  }
  object positionValues {
    
    inline def apply(
      clientHeight: Double,
      clientWidth: Double,
      left: Double,
      scrollHeight: Double,
      scrollLeft: Double,
      scrollTop: Double,
      scrollWidth: Double,
      top: Double
    ): positionValues = {
      val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[positionValues]
    }
    
    extension [Self <: positionValues](x: Self) {
      
      inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
