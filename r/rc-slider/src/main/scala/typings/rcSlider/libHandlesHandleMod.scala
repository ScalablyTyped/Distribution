package typings.rcSlider

import org.scalablytyped.runtime.Shortcut
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

object libHandlesHandleMod extends Shortcut {
  
  @JSImport("rc-slider/lib/Handles/Handle", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait HandleProps extends StObject {
    
    var dragging: Boolean = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ FocusEvent[HTMLDivElement, Element], Unit]] = js.native
    
    def onOffsetChange(value: min | max, valueIndex: Double): Unit = js.native
    def onOffsetChange(value: Double, valueIndex: Double): Unit = js.native
    
    var onStartMove: OnStartMove = js.native
    
    var prefixCls: String = js.native
    
    var render: js.UndefOr[js.Function2[/* origin */ ReactElement, /* props */ RenderProps, ReactElement]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var value: Double = js.native
    
    var valueIndex: Double = js.native
  }
  
  trait RenderProps extends StObject {
    
    var dragging: Boolean
    
    var index: Double
    
    var prefixCls: String
    
    var value: Double
  }
  object RenderProps {
    
    inline def apply(dragging: Boolean, index: Double, prefixCls: String, value: Double): RenderProps = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderProps] (val x: Self) extends AnyVal {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libHandlesHandleMod.foo` */
  override def _to: ForwardRefExoticComponent[HandleProps & RefAttributes[HTMLDivElement]] = default
}
