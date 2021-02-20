package typings.reactCustomScrollbars

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.NativeUIEvent
import typings.react.mod.StatelessComponent
import typings.react.mod.UIEvent
import typings.react.mod.UIEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-custom-scrollbars", JSImport.Default)
  @js.native
  class default protected () extends Scrollbars {
    def this(props: ScrollbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollbarProps, context: js.Any) = this()
  }
  
  @JSImport("react-custom-scrollbars", "Scrollbars")
  @js.native
  class Scrollbars protected ()
    extends Component[ScrollbarProps, js.Object, js.Any] {
    def this(props: ScrollbarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ScrollbarProps, context: js.Any) = this()
    
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
  
  @js.native
  trait ScrollbarProps extends HTMLProps[Scrollbars] {
    
    var autoHeight: js.UndefOr[Boolean] = js.native
    
    var autoHeightMax: js.UndefOr[Double | String] = js.native
    
    var autoHeightMin: js.UndefOr[Double | String] = js.native
    
    var autoHide: js.UndefOr[Boolean] = js.native
    
    var autoHideDuration: js.UndefOr[Double] = js.native
    
    var autoHideTimeout: js.UndefOr[Double] = js.native
    
    var hideTracksWhenNotNeeded: js.UndefOr[Boolean] = js.native
    
    var onScrollFrame: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
    
    var onScrollStart: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onScrollStop: js.UndefOr[js.Function0[Unit]] = js.native
    
    @JSName("onScroll")
    var onScroll_ScrollbarProps: js.UndefOr[UIEventHandler[_]] = js.native
    
    var onUpdate: js.UndefOr[js.Function1[/* values */ positionValues, Unit]] = js.native
    
    var renderThumbHorizontal: js.UndefOr[StatelessComponent[_]] = js.native
    
    var renderThumbVertical: js.UndefOr[StatelessComponent[_]] = js.native
    
    var renderTrackHorizontal: js.UndefOr[StatelessComponent[_]] = js.native
    
    var renderTrackVertical: js.UndefOr[StatelessComponent[_]] = js.native
    
    var renderView: js.UndefOr[StatelessComponent[_]] = js.native
    
    var tagName: js.UndefOr[String] = js.native
    
    var thumbMinSize: js.UndefOr[Double] = js.native
    
    var thumbSize: js.UndefOr[Double] = js.native
    
    var universal: js.UndefOr[Boolean] = js.native
  }
  object ScrollbarProps {
    
    @scala.inline
    def apply(): ScrollbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollbarProps]
    }
    
    @scala.inline
    implicit class ScrollbarPropsMutableBuilder[Self <: ScrollbarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoHeight(value: Boolean): Self = StObject.set(x, "autoHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightMax(value: Double | String): Self = StObject.set(x, "autoHeightMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightMaxUndefined: Self = StObject.set(x, "autoHeightMax", js.undefined)
      
      @scala.inline
      def setAutoHeightMin(value: Double | String): Self = StObject.set(x, "autoHeightMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHeightMinUndefined: Self = StObject.set(x, "autoHeightMin", js.undefined)
      
      @scala.inline
      def setAutoHeightUndefined: Self = StObject.set(x, "autoHeight", js.undefined)
      
      @scala.inline
      def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDuration(value: Double): Self = StObject.set(x, "autoHideDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideDurationUndefined: Self = StObject.set(x, "autoHideDuration", js.undefined)
      
      @scala.inline
      def setAutoHideTimeout(value: Double): Self = StObject.set(x, "autoHideTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoHideTimeoutUndefined: Self = StObject.set(x, "autoHideTimeout", js.undefined)
      
      @scala.inline
      def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
      
      @scala.inline
      def setHideTracksWhenNotNeeded(value: Boolean): Self = StObject.set(x, "hideTracksWhenNotNeeded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideTracksWhenNotNeededUndefined: Self = StObject.set(x, "hideTracksWhenNotNeeded", js.undefined)
      
      @scala.inline
      def setOnScroll(value: UIEvent[_, NativeUIEvent] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollFrame(value: /* values */ positionValues => Unit): Self = StObject.set(x, "onScrollFrame", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollFrameUndefined: Self = StObject.set(x, "onScrollFrame", js.undefined)
      
      @scala.inline
      def setOnScrollStart(value: () => Unit): Self = StObject.set(x, "onScrollStart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollStartUndefined: Self = StObject.set(x, "onScrollStart", js.undefined)
      
      @scala.inline
      def setOnScrollStop(value: () => Unit): Self = StObject.set(x, "onScrollStop", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollStopUndefined: Self = StObject.set(x, "onScrollStop", js.undefined)
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: /* values */ positionValues => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      @scala.inline
      def setRenderThumbHorizontal(value: StatelessComponent[_]): Self = StObject.set(x, "renderThumbHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderThumbHorizontalUndefined: Self = StObject.set(x, "renderThumbHorizontal", js.undefined)
      
      @scala.inline
      def setRenderThumbVertical(value: StatelessComponent[_]): Self = StObject.set(x, "renderThumbVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderThumbVerticalUndefined: Self = StObject.set(x, "renderThumbVertical", js.undefined)
      
      @scala.inline
      def setRenderTrackHorizontal(value: StatelessComponent[_]): Self = StObject.set(x, "renderTrackHorizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTrackHorizontalUndefined: Self = StObject.set(x, "renderTrackHorizontal", js.undefined)
      
      @scala.inline
      def setRenderTrackVertical(value: StatelessComponent[_]): Self = StObject.set(x, "renderTrackVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderTrackVerticalUndefined: Self = StObject.set(x, "renderTrackVertical", js.undefined)
      
      @scala.inline
      def setRenderView(value: StatelessComponent[_]): Self = StObject.set(x, "renderView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderViewUndefined: Self = StObject.set(x, "renderView", js.undefined)
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      @scala.inline
      def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbMinSizeUndefined: Self = StObject.set(x, "thumbMinSize", js.undefined)
      
      @scala.inline
      def setThumbSize(value: Double): Self = StObject.set(x, "thumbSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbSizeUndefined: Self = StObject.set(x, "thumbSize", js.undefined)
      
      @scala.inline
      def setUniversal(value: Boolean): Self = StObject.set(x, "universal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniversalUndefined: Self = StObject.set(x, "universal", js.undefined)
    }
  }
  
  @js.native
  trait positionValues extends StObject {
    
    var clientHeight: Double = js.native
    
    var clientWidth: Double = js.native
    
    var left: Double = js.native
    
    var scrollHeight: Double = js.native
    
    var scrollLeft: Double = js.native
    
    var scrollTop: Double = js.native
    
    var scrollWidth: Double = js.native
    
    var top: Double = js.native
  }
  object positionValues {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class positionValuesMutableBuilder[Self <: positionValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
