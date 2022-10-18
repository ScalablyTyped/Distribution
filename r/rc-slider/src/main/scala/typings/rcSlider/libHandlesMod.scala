package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
import typings.rcSlider.libHandlesHandleMod.RenderProps
import typings.rcSlider.libInterfaceMod.OnStartMove
import typings.rcSlider.rcSliderStrings.max
import typings.rcSlider.rcSliderStrings.min
import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.std.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandlesMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]] = js.native
  
  @js.native
  trait HandlesProps extends StObject {
    
    var draggingIndex: Double = js.native
    
    var handleRender: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ RenderProps, ReactElement]] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var style: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var values: js.Array[Double] = js.native
  }
  
  trait HandlesRef extends StObject {
    
    def focus(index: Double): Unit
  }
  object HandlesRef {
    
    inline def apply(focus: Double => Unit): HandlesRef = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction1(focus))
      __obj.asInstanceOf[HandlesRef]
    }
    
    extension [Self <: HandlesRef](x: Self) {
      
      inline def setFocus(value: Double => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesMod.foo` */
  override def _to: ForwardRefExoticComponent[HandlesProps & RefAttributes[HandlesRef]] = default
}
