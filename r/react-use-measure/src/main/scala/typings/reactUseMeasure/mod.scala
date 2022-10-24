package typings.reactUseMeasure

import org.scalablytyped.runtime.StringDictionary
import typings.reactUseMeasure.anon.Instantiable
import typings.reactUseMeasure.anon.Resize
import typings.std.Element
import typings.std.HTMLElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-use-measure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Result]
  inline def default(param0: Options): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  type HTMLOrSVGElement = HTMLElement | SVGElement
  
  trait Options extends StObject {
    
    var debounce: js.UndefOr[Double | Resize] = js.undefined
    
    var offsetSize: js.UndefOr[Boolean] = js.undefined
    
    var polyfill: js.UndefOr[Instantiable] = js.undefined
    
    var scroll: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDebounce(value: Double | Resize): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setOffsetSize(value: Boolean): Self = StObject.set(x, "offsetSize", value.asInstanceOf[js.Any])
      
      inline def setOffsetSizeUndefined: Self = StObject.set(x, "offsetSize", js.undefined)
      
      inline def setPolyfill(value: Instantiable): Self = StObject.set(x, "polyfill", value.asInstanceOf[js.Any])
      
      inline def setPolyfillUndefined: Self = StObject.set(x, "polyfill", js.undefined)
      
      inline def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
      
      inline def setScrollUndefined: Self = StObject.set(x, "scroll", js.undefined)
    }
  }
  
  trait RectReadOnly
    extends StObject
       with /* key */ StringDictionary[Double] {
    
    val bottom: Double
    
    val height: Double
    
    val left: Double
    
    val right: Double
    
    val top: Double
    
    val width: Double
    
    val x: Double
    
    val y: Double
  }
  object RectReadOnly {
    
    inline def apply(
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
    
    extension [Self <: RectReadOnly](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResizeObserver extends StObject {
    
    def disconnect(): Unit = js.native
    
    def observe(target: Element): Unit = js.native
    def observe(target: Element, options: Any): Unit = js.native
    
    def unobserve(target: Element): Unit = js.native
  }
  
  type ResizeObserverCallback = js.Function2[/* entries */ js.Array[Any], /* observer */ ResizeObserver, Unit]
  
  type Result = js.Tuple3[
    js.Function1[/* element */ HTMLOrSVGElement | Null, Unit], 
    RectReadOnly, 
    js.Function0[Unit]
  ]
}
