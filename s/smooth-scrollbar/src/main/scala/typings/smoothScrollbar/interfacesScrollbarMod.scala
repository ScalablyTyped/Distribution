package typings.smoothScrollbar

import typings.smoothScrollbar.anon.PartialScrollIntoViewOpti
import typings.smoothScrollbar.anon.PartialScrollToOptions
import typings.smoothScrollbar.anon.PartialSetPositionOptions
import typings.smoothScrollbar.interfacesData2dMod.Data2d
import typings.smoothScrollbar.interfacesTrackMod.TrackController
import typings.std.Event
import typings.std.EventTarget
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesScrollbarMod {
  
  type AddTransformableMomentumCallback = js.ThisFunction1[/* this */ Scrollbar, /* willScroll */ Boolean, Unit]
  
  trait Metrics extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Metrics {
    
    inline def apply(height: Double, width: Double): Metrics = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Metrics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollIntoViewOptions extends StObject {
    
    var alignToTop: Boolean
    
    var offsetBottom: Double
    
    var offsetLeft: Double
    
    var offsetTop: Double
    
    var onlyScrollIfNeeded: Boolean
  }
  object ScrollIntoViewOptions {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ScrollIntoViewOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignToTop(value: Boolean): Self = StObject.set(x, "alignToTop", value.asInstanceOf[js.Any])
      
      inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
      
      inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
      
      inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
      
      inline def setOnlyScrollIfNeeded(value: Boolean): Self = StObject.set(x, "onlyScrollIfNeeded", value.asInstanceOf[js.Any])
    }
  }
  
  type ScrollListener = js.ThisFunction1[/* this */ Scrollbar, /* status */ ScrollStatus, Unit]
  
  trait ScrollStatus extends StObject {
    
    var limit: Data2d
    
    var offset: Data2d
  }
  object ScrollStatus {
    
    inline def apply(limit: Data2d, offset: Data2d): ScrollStatus = {
      val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollStatus] (val x: Self) extends AnyVal {
      
      inline def setLimit(value: Data2d): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Data2d): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollToOptions extends StObject {
    
    def callback(): Unit
    
    def easing(percent: Double): Double
  }
  object ScrollToOptions {
    
    inline def apply(callback: () => Unit, easing: Double => Double): ScrollToOptions = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), easing = js.Any.fromFunction1(easing))
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollToOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setEasing(value: Double => Double): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
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
    def scrollTo(x: Double): Unit = js.native
    def scrollTo(x: Double, y: Double): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: Double): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Double, duration: Unit, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Unit, duration: Double): Unit = js.native
    def scrollTo(x: Double, y: Unit, duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Double, y: Unit, duration: Unit, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Unit, y: Double): Unit = js.native
    def scrollTo(x: Unit, y: Double, duration: Double): Unit = js.native
    def scrollTo(x: Unit, y: Double, duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Unit, y: Double, duration: Unit, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Unit, y: Unit, duration: Double): Unit = js.native
    def scrollTo(x: Unit, y: Unit, duration: Double, options: PartialScrollToOptions): Unit = js.native
    def scrollTo(x: Unit, y: Unit, duration: Unit, options: PartialScrollToOptions): Unit = js.native
    
    var scrollTop: Double = js.native
    
    def setMomentum(x: Double, y: Double): Unit = js.native
    
    def setPosition(): Unit = js.native
    def setPosition(x: Double): Unit = js.native
    def setPosition(x: Double, y: Double): Unit = js.native
    def setPosition(x: Double, y: Double, options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: Double, y: Unit, options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: Unit, y: Double): Unit = js.native
    def setPosition(x: Unit, y: Double, options: PartialSetPositionOptions): Unit = js.native
    def setPosition(x: Unit, y: Unit, options: PartialSetPositionOptions): Unit = js.native
    
    var size: ScrollbarSize = js.native
    
    val track: TrackController = js.native
    
    def update(): Unit = js.native
    
    def updatePluginOptions(pluginName: String): Unit = js.native
    def updatePluginOptions(pluginName: String, options: Any): Unit = js.native
  }
  
  trait ScrollbarBounding extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object ScrollbarBounding {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): ScrollbarBounding = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarBounding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarBounding] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScrollbarOptions extends StObject {
    
    var alwaysShowTracks: Boolean
    
    var continuousScrolling: Boolean
    
    var damping: Double
    
    var delegateTo: EventTarget | Null
    
    var plugins: Any
    
    var renderByPixels: Boolean
    
    var thumbMinSize: Double
    
    var wheelEventTarget: EventTarget | Null
  }
  object ScrollbarOptions {
    
    inline def apply(
      alwaysShowTracks: Boolean,
      continuousScrolling: Boolean,
      damping: Double,
      plugins: Any,
      renderByPixels: Boolean,
      thumbMinSize: Double
    ): ScrollbarOptions = {
      val __obj = js.Dynamic.literal(alwaysShowTracks = alwaysShowTracks.asInstanceOf[js.Any], continuousScrolling = continuousScrolling.asInstanceOf[js.Any], damping = damping.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], renderByPixels = renderByPixels.asInstanceOf[js.Any], thumbMinSize = thumbMinSize.asInstanceOf[js.Any], delegateTo = null, wheelEventTarget = null)
      __obj.asInstanceOf[ScrollbarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarOptions] (val x: Self) extends AnyVal {
      
      inline def setAlwaysShowTracks(value: Boolean): Self = StObject.set(x, "alwaysShowTracks", value.asInstanceOf[js.Any])
      
      inline def setContinuousScrolling(value: Boolean): Self = StObject.set(x, "continuousScrolling", value.asInstanceOf[js.Any])
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setDelegateTo(value: EventTarget): Self = StObject.set(x, "delegateTo", value.asInstanceOf[js.Any])
      
      inline def setDelegateToNull: Self = StObject.set(x, "delegateTo", null)
      
      inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setRenderByPixels(value: Boolean): Self = StObject.set(x, "renderByPixels", value.asInstanceOf[js.Any])
      
      inline def setThumbMinSize(value: Double): Self = StObject.set(x, "thumbMinSize", value.asInstanceOf[js.Any])
      
      inline def setWheelEventTarget(value: EventTarget): Self = StObject.set(x, "wheelEventTarget", value.asInstanceOf[js.Any])
      
      inline def setWheelEventTargetNull: Self = StObject.set(x, "wheelEventTarget", null)
    }
  }
  
  trait ScrollbarSize extends StObject {
    
    var container: Metrics
    
    var content: Metrics
  }
  object ScrollbarSize {
    
    inline def apply(container: Metrics, content: Metrics): ScrollbarSize = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollbarSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollbarSize] (val x: Self) extends AnyVal {
      
      inline def setContainer(value: Metrics): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Metrics): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetPositionOptions extends StObject {
    
    var withoutCallbacks: Boolean
  }
  object SetPositionOptions {
    
    inline def apply(withoutCallbacks: Boolean): SetPositionOptions = {
      val __obj = js.Dynamic.literal(withoutCallbacks = withoutCallbacks.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPositionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetPositionOptions] (val x: Self) extends AnyVal {
      
      inline def setWithoutCallbacks(value: Boolean): Self = StObject.set(x, "withoutCallbacks", value.asInstanceOf[js.Any])
    }
  }
}
