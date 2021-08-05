package typings.rellax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typings.rellax.anon.X
import typings.std.Element
import typings.std.HTMLElement
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rellax", JSImport.Namespace)
  @js.native
  /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  class ^ ()
    extends StObject
       with RellaxInstance {
    def this(el: String) = this()
    def this(el: Element) = this()
    def this(el: String, options: RellaxOptions) = this()
    def this(el: Unit, options: RellaxOptions) = this()
    def this(el: Element, options: RellaxOptions) = this()
    
    /**
      * End Rellax and reset parallax elements to their original positions
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Rellax elements
      */
    /* CompleteClass */
    var elms: NodeListOf[Element] | js.Array[Element] = js.native
    
    /**
      * Options
      */
    /* CompleteClass */
    var options: RellaxOptions = js.native
    
    /**
      * Destroy and create again parallax with previous settings
      */
    /* CompleteClass */
    override def refresh(): Unit = js.native
  }
  @JSImport("rellax", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Rellax = js.native
  
  @js.native
  trait Rellax
    extends StObject
       with /**
    * Inits and starts the Parallax animations
    * @param el Single element or string with selector of elements
    * @param options Options
    */
  Instantiable0[RellaxInstance]
       with Instantiable1[(/* el */ Element) | (/* el */ String), RellaxInstance]
       with Instantiable2[
          (/* el */ Element) | (/* el */ String) | (/* el */ Unit), 
          /* options */ RellaxOptions, 
          RellaxInstance
        ] {
    
    /**
      * Inits and starts the Parallax animations
      * @param el Single element or string with selector of elements
      * @param options Options
      */
    def apply(): RellaxInstance = js.native
    def apply(el: String): RellaxInstance = js.native
    def apply(el: String, options: RellaxOptions): RellaxInstance = js.native
    def apply(el: Unit, options: RellaxOptions): RellaxInstance = js.native
    def apply(el: Element): RellaxInstance = js.native
    def apply(el: Element, options: RellaxOptions): RellaxInstance = js.native
  }
  
  trait RellaxInstance extends StObject {
    
    /**
      * End Rellax and reset parallax elements to their original positions
      */
    def destroy(): Unit
    
    /**
      * Rellax elements
      */
    var elms: NodeListOf[Element] | js.Array[Element]
    
    /**
      * Options
      */
    var options: RellaxOptions
    
    /**
      * Destroy and create again parallax with previous settings
      */
    def refresh(): Unit
  }
  object RellaxInstance {
    
    inline def apply(
      destroy: () => Unit,
      elms: NodeListOf[Element] | js.Array[Element],
      options: RellaxOptions,
      refresh: () => Unit
    ): RellaxInstance = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elms = elms.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh))
      __obj.asInstanceOf[RellaxInstance]
    }
    
    extension [Self <: RellaxInstance](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setElms(value: NodeListOf[Element] | js.Array[Element]): Self = StObject.set(x, "elms", value.asInstanceOf[js.Any])
      
      inline def setElmsVarargs(value: Element*): Self = StObject.set(x, "elms", js.Array(value :_*))
      
      inline def setOptions(value: RellaxOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    }
  }
  
  trait RellaxOptions extends StObject {
    
    /**
      * Each breakpoint value represents the resolution for mobile, tablet, desktop respectively.
      */
    var breakpoints: js.UndefOr[js.Tuple3[Double, Double, Double]] = js.undefined
    
    /**
      * Will run on every animation event
      * @param positions Object with x and y positions of the rellax element
      */
    var callback: js.UndefOr[js.Function1[/* positions */ X, Unit]] = js.undefined
    
    /**
      * Enable the ability to center parallax elements in your viewport
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable horizontal parallax. This feature is intended for panoramic style websites, where users scroll horizontally instead of vertically
      */
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do we want rellax element to be relative to the mentioned wrapper.
      */
    var relativeToWrapper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow decimal pixel values
      */
    var round: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A negative value will make it move slower than regular scrolling, and a positive value will make it move faster
      */
    var speed: js.UndefOr[Double] = js.undefined
    
    /**
      * Enable vertical parallax
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the position of parallax elements is determined via the scroll position of the body. Passing in the wrapper property will tell Rellax to watch that element instead
      */
    var wrapper: js.UndefOr[String | HTMLElement] = js.undefined
  }
  object RellaxOptions {
    
    inline def apply(): RellaxOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RellaxOptions]
    }
    
    extension [Self <: RellaxOptions](x: Self) {
      
      inline def setBreakpoints(value: js.Tuple3[Double, Double, Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      inline def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
      
      inline def setCallback(value: /* positions */ X => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setRelativeToWrapper(value: Boolean): Self = StObject.set(x, "relativeToWrapper", value.asInstanceOf[js.Any])
      
      inline def setRelativeToWrapperUndefined: Self = StObject.set(x, "relativeToWrapper", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      inline def setWrapper(value: String | HTMLElement): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type _To = js.Object & Rellax
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Rellax = ^
}
