package typings.reactUseMeasure

import org.scalablytyped.runtime.StringDictionary
import typings.reactUseMeasure.anon.Instantiable
import typings.reactUseMeasure.anon.Resize
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-use-measure", JSImport.Default)
  @js.native
  def default(): Result = js.native
  @JSImport("react-use-measure", JSImport.Default)
  @js.native
  def default(hasDebounceScrollPolyfill: Options): Result = js.native
  
  type HTMLOrSVGElement = HTMLElement | SVGElement
  
  @js.native
  trait Options extends StObject {
    
    var debounce: js.UndefOr[Double | Resize] = js.native
    
    var polyfill: js.UndefOr[Instantiable] = js.native
    
    var scroll: js.UndefOr[Boolean] = js.native
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
      def setDebounce(value: Double | Resize): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setPolyfill(value: Instantiable): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  @js.native
  trait RectReadOnly extends /* key */ StringDictionary[Double] {
    
    val bottom: Double = js.native
    
    val height: Double = js.native
    
    val left: Double = js.native
    
    val right: Double = js.native
    
    val top: Double = js.native
    
    val width: Double = js.native
    
    val x: Double = js.native
    
    val y: Double = js.native
  }
  object RectReadOnly {
    
    @scala.inline
    def apply(
      bottom: Double,
      height: Double,
      left: Double,
      right: Double,
      top: Double,
      width: Double,
      x: Double,
      y: Double
    ): RectReadOnly = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RectReadOnly]
    }
    
    @scala.inline
    implicit class RectReadOnlyMutableBuilder[Self <: RectReadOnly] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeObserver extends StObject {
    
    def disconnect(): Unit = js.native
    
    def observe(target: Element): Unit = js.native
    def observe(target: Element, options: js.Any): Unit = js.native
    
    def unobserve(target: Element): Unit = js.native
  }
  
  type ResizeObserverCallback = js.Function2[/* entries */ js.Array[js.Any], /* observer */ ResizeObserver, Unit]
  
  type Result = js.Tuple3[
    js.Function1[/* element */ HTMLOrSVGElement | Null, Unit], 
    RectReadOnly, 
    js.Function0[Unit]
  ]
}
