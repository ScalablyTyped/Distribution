package typings.scrollreveal

import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollReveal {
  
  @js.native
  trait ScrollRevealObject extends StObject {
    
    def apply(): ScrollRevealObject = js.native
    def apply(options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
    
    def clean(selector: String): Unit = js.native
    def clean(selector: HTMLElement): Unit = js.native
    def clean(selector: NodeListOf[Element]): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def reveal(selector: String): ScrollRevealObject = js.native
    def reveal(selector: String, interval: Double): ScrollRevealObject = js.native
    def reveal(selector: String, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
    def reveal(selector: String, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
    def reveal(selector: HTMLElement): ScrollRevealObject = js.native
    def reveal(selector: HTMLElement, interval: Double): ScrollRevealObject = js.native
    def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
    def reveal(selector: HTMLElement, options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
    def reveal(selector: NodeListOf[Element]): ScrollRevealObject = js.native
    def reveal(selector: NodeListOf[Element], interval: Double): ScrollRevealObject = js.native
    def reveal(selector: NodeListOf[Element], options: ScrollRevealObjectOptions): ScrollRevealObject = js.native
    def reveal(selector: NodeListOf[Element], options: ScrollRevealObjectOptions, interval: Double): ScrollRevealObject = js.native
    
    def sync(): Unit = js.native
  }
  
  trait ScrollRevealObjectOptions extends StObject {
    
    var afterReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
    
    var afterReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
    
    var beforeReset: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
    
    var beforeReveal: js.UndefOr[js.Function1[/* domEl */ HTMLElement | NodeListOf[Element], Unit]] = js.undefined
    
    var cleanup: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[Any] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var distance: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var mobile: js.UndefOr[Boolean] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var reset: js.UndefOr[Boolean] = js.undefined
    
    var rotate: js.UndefOr[ScrollRevealRotateObject] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var useDelay: js.UndefOr[String] = js.undefined
    
    var viewFactor: js.UndefOr[Double] = js.undefined
    
    var viewOffset: js.UndefOr[ScrollRevealPositionObject] = js.undefined
  }
  object ScrollRevealObjectOptions {
    
    inline def apply(): ScrollRevealObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealObjectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollRevealObjectOptions] (val x: Self) extends AnyVal {
      
      inline def setAfterReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "afterReset", js.Any.fromFunction1(value))
      
      inline def setAfterResetUndefined: Self = StObject.set(x, "afterReset", js.undefined)
      
      inline def setAfterReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "afterReveal", js.Any.fromFunction1(value))
      
      inline def setAfterRevealUndefined: Self = StObject.set(x, "afterReveal", js.undefined)
      
      inline def setBeforeReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction1(value))
      
      inline def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
      
      inline def setBeforeReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "beforeReveal", js.Any.fromFunction1(value))
      
      inline def setBeforeRevealUndefined: Self = StObject.set(x, "beforeReveal", js.undefined)
      
      inline def setCleanup(value: Boolean): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
      
      inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setRotate(value: ScrollRevealRotateObject): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setUseDelay(value: String): Self = StObject.set(x, "useDelay", value.asInstanceOf[js.Any])
      
      inline def setUseDelayUndefined: Self = StObject.set(x, "useDelay", js.undefined)
      
      inline def setViewFactor(value: Double): Self = StObject.set(x, "viewFactor", value.asInstanceOf[js.Any])
      
      inline def setViewFactorUndefined: Self = StObject.set(x, "viewFactor", js.undefined)
      
      inline def setViewOffset(value: ScrollRevealPositionObject): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
      
      inline def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    }
  }
  
  trait ScrollRevealPositionObject extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ScrollRevealPositionObject {
    
    inline def apply(): ScrollRevealPositionObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealPositionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollRevealPositionObject] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait ScrollRevealRotateObject extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object ScrollRevealRotateObject {
    
    inline def apply(): ScrollRevealRotateObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealRotateObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollRevealRotateObject] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
