package typings.reCarousel

import org.scalablytyped.runtime.Shortcut
import typings.reCarousel.reCarouselStrings.x
import typings.reCarousel.reCarouselStrings.y
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("re-carousel", JSImport.Namespace)
  @js.native
  val ^ : ComponentType[CarouselProps] = js.native
  
  trait CarouselProps extends StObject {
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var frames: js.UndefOr[js.Array[Element]] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var minMove: js.UndefOr[Double] = js.undefined
    
    var onTransitionEnd: js.UndefOr[js.Function2[/* siblingFrames */ SiblingFrames, /* duration */ Double, Unit]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var widgets: js.UndefOr[js.Array[ComponentType[WidgetProps]]] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setAxis(value: typings.reCarousel.reCarouselStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setFrames(value: js.Array[Element]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      inline def setFramesVarargs(value: Element*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setMinMove(value: Double): Self = StObject.set(x, "minMove", value.asInstanceOf[js.Any])
      
      inline def setMinMoveUndefined: Self = StObject.set(x, "minMove", js.undefined)
      
      inline def setOnTransitionEnd(value: (/* siblingFrames */ SiblingFrames, /* duration */ Double) => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction2(value))
      
      inline def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidgets(value: js.Array[ComponentType[WidgetProps]]): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
      
      inline def setWidgetsUndefined: Self = StObject.set(x, "widgets", js.undefined)
      
      inline def setWidgetsVarargs(value: ComponentType[WidgetProps]*): Self = StObject.set(x, "widgets", js.Array(value*))
    }
  }
  
  trait SiblingFrames extends StObject {
    
    var current: HTMLDivElement
    
    var next: HTMLDivElement
    
    var prev: HTMLDivElement
  }
  object SiblingFrames {
    
    inline def apply(current: HTMLDivElement, next: HTMLDivElement, prev: HTMLDivElement): SiblingFrames = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiblingFrames]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SiblingFrames] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: HTMLDivElement): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setNext(value: HTMLDivElement): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setPrev(value: HTMLDivElement): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
    }
  }
  
  trait WidgetProps extends StObject {
    
    var auto: js.UndefOr[Boolean] = js.undefined
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var index: Double
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    def nextHandler(): Unit
    
    def prevHandler(): Unit
    
    var total: Double
  }
  object WidgetProps {
    
    inline def apply(index: Double, nextHandler: () => Unit, prevHandler: () => Unit, total: Double): WidgetProps = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], nextHandler = js.Any.fromFunction0(nextHandler), prevHandler = js.Any.fromFunction0(prevHandler), total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[WidgetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WidgetProps] (val x: Self) extends AnyVal {
      
      inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
      
      inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
      
      inline def setAxis(value: typings.reCarousel.reCarouselStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setNextHandler(value: () => Unit): Self = StObject.set(x, "nextHandler", js.Any.fromFunction0(value))
      
      inline def setPrevHandler(value: () => Unit): Self = StObject.set(x, "prevHandler", js.Any.fromFunction0(value))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ComponentType[CarouselProps]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ComponentType[CarouselProps] = ^
}
