package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptions
import typings.smoothScrollbar.anon.PartialSetPositionOptions
import typings.smoothScrollbar.data2dMod.Data2d
import typings.smoothScrollbar.trackMod.TrackController
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollbarMod {
  
  type AddTransformableMomentumCallback = js.ThisFunction1[/* this */ Scrollbar, /* willScroll */ Boolean, Unit]
  
  @js.native
  trait Metrics extends StObject {
    
    var height: Double = js.native
    
    var width: Double = js.native
  }
  object Metrics {
    
    @scala.inline
    def apply(height: Double, width: Double): Metrics = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit class MetricsMutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollIntoViewOptions extends StObject {
    
    var alignToTop: Boolean = js.native
    
    var offsetBottom: Double = js.native
    
    var offsetLeft: Double = js.native
    
    var offsetTop: Double = js.native
    
    var onlyScrollIfNeeded: Boolean = js.native
  }
  object ScrollIntoViewOptions {
    
    @scala.inline
    def apply(
      alignToTop: Boolean,
      offsetBottom: Double,
      offsetLeft: Double,
      offsetTop: Double,
      onlyScrollIfNeeded: Boolean
    ): ScrollIntoViewOptions = {
      val __obj = js.Dynamic.literal(alignToTop = alignToTop.asInstanceOf[js.Any], offsetBottom = offsetBottom.asInstanceOf[js.Any], offsetLeft = offsetLeft.asInstanceOf[js.Any], offsetTop = offsetTop.asInstanceOf[js.Any], onlyScrollIfNeeded = onlyScrollIfNeeded.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollIntoViewOptions]
    }
    
    @scala.inline
    implicit class ScrollIntoViewOptionsMutableBuilder[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyScrollIfNeeded(value: Boolean): Self = StObject.set(x, "onlyScrollIfNeeded", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollListener = js.ThisFunction1[/* this */ Scrollbar, /* status */ ScrollStatus, Unit]
  
  @js.native
  trait ScrollStatus extends StObject {
    
    var limit: Data2d = js.native
    
    var offset: Data2d = js.native
  }
  object ScrollStatus {
    
    @scala.inline
    def apply(limit: Data2d, offset: Data2d): ScrollStatus = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollStatus]
    }
    
    @scala.inline
    implicit class ScrollStatusMutableBuilder[Self <: ScrollStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLimit(value: Data2d): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Data2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollToOptions extends StObject {
    
    def callback(): Unit = js.native
    
    def easing(percent: Double): Double = js.native
  }
  object ScrollToOptions {
    
    @scala.inline
    def apply(callback: () => Unit, easing: Double => Double): ScrollToOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), easing = js.Any.fromFunction1(easing))
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    @scala.inline
    implicit class ScrollToOptionsMutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEasing(value: Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Scrollbar extends StObject {
    
    def addListener(fn: ScrollListener): Unit = js.native
    
    def addMomentum(x: Double, y: Double): Unit = js.native
    
    def addTransformableMomentum(x: Double, y: Double, fromEvent: Event): Unit = js.native
    def addTransformableMomentum(x: Double, y: Double, fromEvent: Event, callback: AddTransformableMomentumCallback): Unit = js.native
    
    var bounding: ScrollbarBounding = js.native
    
    val containerEl: HTMLElement = js.native
    
    val contentEl: HTMLElement = js.native
    
    def destroy(): Unit = js.native
    
    def getSize(): ScrollbarSize = js.native
    
    def isVisible(elem: HTMLElement): Boolean = js.native
    
    var limit: Data2d = js.native
    
    var offset: Data2d = js.native
    
    val options: ScrollbarOptions = js.native
    
    val parent: Scrollbar | Null = js.native
    
    def removeListener(fn: ScrollListener): Unit = js.native
    
    def scrollIntoView(elem: HTMLElement): Unit = js.native
    def scrollIntoView(elem: HTMLElement, options: PartialScrollIntoViewOpti): Unit = js.native
    
    var scrollLeft: Double = js.native
    
    def scrollTo(): Unit = js.native
    def scrollTo(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      options: PartialScrollToOptions
    ): Unit = js.native
    def scrollTo(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
    def scrollTo(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      duration: Double,
      options: PartialScrollToOptions
    ): Unit = js.native
    def scrollTo(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    def scrollTo(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      duration: js.UndefOr[scala.Nothing],
      options: PartialScrollToOptions
    ): Unit = js.native
    def scrollTo(x: js.UndefOr[scala.Nothing], y: Double, duration: Double): Unit = js.native
    def scrollTo(x: js.UndefOr[scala.Nothing], y: Double, duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double): Unit = js.native
    def scrollTo(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      duration: js.UndefOr[scala.Nothing],
      options: PartialScrollToOptions
    ): Unit = js.native
    def scrollTo(x: Double, y: js.UndefOr[scala.Nothing], duration: Double): Unit = js.native
    def scrollTo(x: Double, y: js.UndefOr[scala.Nothing], duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: js.UndefOr[scala.Nothing], options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: Double): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: Double, options: PartialScrollToOptions): Unit = js.native
    
    var scrollTop: Double = js.native
    
    def setMomentum(x: Double, y: Double): Unit = js.native
    
    def setPosition(): Unit = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: Double): Unit = js.native
    def setPosition(x: js.UndefOr[scala.Nothing], y: Double, options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: Double): Unit = js.native
    def setPosition(x: Double, y: js.UndefOr[scala.Nothing], options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: Double, y: Double): Unit = js.native
    def setPosition(x: Double, y: Double, options: PartialSetPositionOptions): Unit = js.native
    
    var size: ScrollbarSize = js.native
    
    val track: TrackController = js.native
    
    def update(): Unit = js.native
    
    def updatePluginOptions(pluginName: String): Unit = js.native
    def updatePluginOptions(pluginName: String, options: js.Any): Unit = js.native
  }
  
  @js.native
  trait ScrollbarBounding extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object ScrollbarBounding {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): ScrollbarBounding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarBounding]
    }
    
    @scala.inline
    implicit class ScrollbarBoundingMutableBuilder[Self <: ScrollbarBounding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollbarOptions extends StObject {
    
    var alwaysShowTracks: Boolean = js.native
    
    var continuousScrolling: Boolean = js.native
    
    var damping: Double = js.native
    
    var delegateTo: EventTarget | Null = js.native
    
    var plugins: js.Any = js.native
    
    var renderByPixels: Boolean = js.native
    
    var thumbMinSize: Double = js.native
    
    var wheelEventTarget: EventTarget | Null = js.native
  }
  object ScrollbarOptions {
    
    @scala.inline
    def apply(
      alwaysShowTracks: Boolean,
      continuousScrolling: Boolean,
      damping: Double,
      plugins: js.Any,
      renderByPixels: Boolean,
      thumbMinSize: Double
    ): ScrollbarOptions = {
      val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks.asInstanceOf[js.Any], continuousScrolling = continuousScrolling.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderByPixels = renderByPixels.asInstanceOf[js.Any], thumbMinSize = thumbMinSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarOptions]
    }
    
    @scala.inline
    implicit class ScrollbarOptionsMutableBuilder[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousScrolling(value: Boolean): Self = StObject.set(x, "continuousScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateTo(value: EventTarget): Self = StObject.set(x, "delegateTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelegateToNull: Self = StObject.set(x, "delegateTo", null)
      
      @scala.inline
      def setPlugins(value: js.Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelEventTarget(value: EventTarget): Self = StObject.set(x, "wheelEventTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelEventTargetNull: Self = StObject.set(x, "wheelEventTarget", null)
    }
  }
  
  @js.native
  trait ScrollbarSize extends StObject {
    
    var container: Metrics = js.native
    
    var content: Metrics = js.native
  }
  object ScrollbarSize {
    
    @scala.inline
    def apply(container: Metrics, content: Metrics): ScrollbarSize = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarSize]
    }
    
    @scala.inline
    implicit class ScrollbarSizeMutableBuilder[Self <: ScrollbarSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: Metrics): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: Metrics): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SetPositionOptions extends StObject {
    
    var withoutCallbacks: Boolean = js.native
  }
  object SetPositionOptions {
    
    @scala.inline
    def apply(withoutCallbacks: Boolean): SetPositionOptions = {
      val __obj = js.Dynamic.literal(withoutCallbacks = withoutCallbacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPositionOptions]
    }
    
    @scala.inline
    implicit class SetPositionOptionsMutableBuilder[Self <: SetPositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithoutCallbacks(value: Boolean): Self = StObject.set(x, "withoutCallbacks", value.asInstanceOf[js.Any])
    }
  }
}
