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
    
    var container: js.UndefOr[js.Any] = js.undefined
    
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
    
    @scala.inline
    def apply(): ScrollRevealObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealObjectOptions]
    }
    
    @scala.inline
    implicit class ScrollRevealObjectOptionsMutableBuilder[Self <: ScrollRevealObjectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "afterReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterResetUndefined: Self = StObject.set(x, "afterReset", js.undefined)
      
      @scala.inline
      def setAfterReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "afterReveal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterRevealUndefined: Self = StObject.set(x, "afterReveal", js.undefined)
      
      @scala.inline
      def setBeforeReset(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "beforeReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeResetUndefined: Self = StObject.set(x, "beforeReset", js.undefined)
      
      @scala.inline
      def setBeforeReveal(value: /* domEl */ HTMLElement | NodeListOf[Element] => Unit): Self = StObject.set(x, "beforeReveal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeRevealUndefined: Self = StObject.set(x, "beforeReveal", js.undefined)
      
      @scala.inline
      def setContainer(value: js.Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setMobile(value: Boolean): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setRotate(value: ScrollRevealRotateObject): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setUseDelay(value: String): Self = StObject.set(x, "useDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDelayUndefined: Self = StObject.set(x, "useDelay", js.undefined)
      
      @scala.inline
      def setViewFactor(value: Double): Self = StObject.set(x, "viewFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewFactorUndefined: Self = StObject.set(x, "viewFactor", js.undefined)
      
      @scala.inline
      def setViewOffset(value: ScrollRevealPositionObject): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    }
  }
  
  trait ScrollRevealPositionObject extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object ScrollRevealPositionObject {
    
    @scala.inline
    def apply(): ScrollRevealPositionObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealPositionObject]
    }
    
    @scala.inline
    implicit class ScrollRevealPositionObjectMutableBuilder[Self <: ScrollRevealPositionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait ScrollRevealRotateObject extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
  }
  object ScrollRevealRotateObject {
    
    @scala.inline
    def apply(): ScrollRevealRotateObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollRevealRotateObject]
    }
    
    @scala.inline
    implicit class ScrollRevealRotateObjectMutableBuilder[Self <: ScrollRevealRotateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZUndefined: Self = StObject.set(x, "z", js.undefined)
    }
  }
}
