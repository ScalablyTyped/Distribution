package typings.smoothScroll

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smooth-scroll", JSImport.Namespace)
  @js.native
  class ^ () extends SmoothScroll {
    def this(selector: String) = this()
    def this(selector: js.UndefOr[scala.Nothing], options: Options) = this()
    def this(selector: String, options: Options) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smoothScroll.smoothScrollStrings.Linear
    - typings.smoothScroll.smoothScrollStrings.easeInQuad
    - typings.smoothScroll.smoothScrollStrings.easeInCubic
    - typings.smoothScroll.smoothScrollStrings.easeInQuart
    - typings.smoothScroll.smoothScrollStrings.easeInQuint
    - typings.smoothScroll.smoothScrollStrings.easeInOutQuad
    - typings.smoothScroll.smoothScrollStrings.easeInOutCubic
    - typings.smoothScroll.smoothScrollStrings.easeInOutQuart
    - typings.smoothScroll.smoothScrollStrings.easeInOutQuint
    - typings.smoothScroll.smoothScrollStrings.easeOutQuad
    - typings.smoothScroll.smoothScrollStrings.easeOutCubic
    - typings.smoothScroll.smoothScrollStrings.easeOutQuart
    - typings.smoothScroll.smoothScrollStrings.easeOutQuint
  */
  trait Easing extends StObject
  object Easing {
    
    @scala.inline
    def Linear: typings.smoothScroll.smoothScrollStrings.Linear = "Linear".asInstanceOf[typings.smoothScroll.smoothScrollStrings.Linear]
    
    @scala.inline
    def easeInCubic: typings.smoothScroll.smoothScrollStrings.easeInCubic = "easeInCubic".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInCubic]
    
    @scala.inline
    def easeInOutCubic: typings.smoothScroll.smoothScrollStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutQuad: typings.smoothScroll.smoothScrollStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typings.smoothScroll.smoothScrollStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typings.smoothScroll.smoothScrollStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInOutQuint]
    
    @scala.inline
    def easeInQuad: typings.smoothScroll.smoothScrollStrings.easeInQuad = "easeInQuad".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typings.smoothScroll.smoothScrollStrings.easeInQuart = "easeInQuart".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typings.smoothScroll.smoothScrollStrings.easeInQuint = "easeInQuint".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeInQuint]
    
    @scala.inline
    def easeOutCubic: typings.smoothScroll.smoothScrollStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeOutCubic]
    
    @scala.inline
    def easeOutQuad: typings.smoothScroll.smoothScrollStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typings.smoothScroll.smoothScrollStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typings.smoothScroll.smoothScrollStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typings.smoothScroll.smoothScrollStrings.easeOutQuint]
  }
  
  @js.native
  trait Options extends StObject {
    
    var clip: js.UndefOr[Boolean] = js.native
    
    var customEasing: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.native
    
    var durationMax: js.UndefOr[Double | Null] = js.native
    
    var durationMin: js.UndefOr[Double | Null] = js.native
    
    var easing: js.UndefOr[Easing] = js.native
    
    // Custom Events
    var emitEvents: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    // Selectors
    var ignore: js.UndefOr[String] = js.native
    
    var offset: js.UndefOr[
        Double | (js.Function2[
          /* anchor */ js.UndefOr[Element | Double | Null], 
          /* toggle */ js.UndefOr[Element | Null], 
          Double
        ])
      ] = js.native
    
    var popstate: js.UndefOr[Boolean] = js.native
    
    // Speed & Easing
    var speed: js.UndefOr[Double] = js.native
    
    var speedAsDuration: js.UndefOr[Boolean] = js.native
    
    var topOnEmptyHash: js.UndefOr[Boolean] = js.native
    
    // History
    var updateURL: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setCustomEasing(value: /* time */ Double => Double): Self = StObject.set(x, "customEasing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomEasingUndefined: Self = StObject.set(x, "customEasing", js.undefined)
      
      @scala.inline
      def setDurationMax(value: Double): Self = StObject.set(x, "durationMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationMaxNull: Self = StObject.set(x, "durationMax", null)
      
      @scala.inline
      def setDurationMaxUndefined: Self = StObject.set(x, "durationMax", js.undefined)
      
      @scala.inline
      def setDurationMin(value: Double): Self = StObject.set(x, "durationMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationMinNull: Self = StObject.set(x, "durationMin", null)
      
      @scala.inline
      def setDurationMinUndefined: Self = StObject.set(x, "durationMin", js.undefined)
      
      @scala.inline
      def setEasing(value: Easing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEmitEvents(value: Boolean): Self = StObject.set(x, "emitEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitEventsUndefined: Self = StObject.set(x, "emitEvents", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setOffset(
        value: Double | (js.Function2[
              /* anchor */ js.UndefOr[Element | Double | Null], 
              /* toggle */ js.UndefOr[Element | Null], 
              Double
            ])
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetFunction2(
        value: (/* anchor */ js.UndefOr[Element | Double | Null], /* toggle */ js.UndefOr[Element | Null]) => Double
      ): Self = StObject.set(x, "offset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPopstate(value: Boolean): Self = StObject.set(x, "popstate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopstateUndefined: Self = StObject.set(x, "popstate", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedAsDuration(value: Boolean): Self = StObject.set(x, "speedAsDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedAsDurationUndefined: Self = StObject.set(x, "speedAsDuration", js.undefined)
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setTopOnEmptyHash(value: Boolean): Self = StObject.set(x, "topOnEmptyHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopOnEmptyHashUndefined: Self = StObject.set(x, "topOnEmptyHash", js.undefined)
      
      @scala.inline
      def setUpdateURL(value: Boolean): Self = StObject.set(x, "updateURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateURLUndefined: Self = StObject.set(x, "updateURL", js.undefined)
    }
  }
  
  @js.native
  trait SmoothScroll extends StObject {
    
    def animateScroll(): Unit = js.native
    def animateScroll(anchor: Double): Unit = js.native
    def animateScroll(anchor: Double, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element): Unit = js.native
    def animateScroll(anchor: Double, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element): Unit = js.native
    def animateScroll(anchor: Null, toggle: Element, options: Options): Unit = js.native
    def animateScroll(anchor: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Null, options: Options): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element): Unit = js.native
    def animateScroll(anchor: Element, toggle: Element, options: Options): Unit = js.native
    
    def cancelScroll(): Unit = js.native
    def cancelScroll(noEvent: Boolean): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def init(): Unit = js.native
    def init(options: Options): Unit = js.native
  }
}
