package typings.rcComponentColorPicker

import typings.rcComponentColorPicker.esColorMod.Color
import typings.rcComponentColorPicker.esInterfaceMod.TransformOffset
import typings.rcComponentColorPicker.rcComponentColorPickerStrings.x
import typings.rcComponentColorPicker.rcComponentColorPickerStrings.y
import typings.react.mod.RefObject
import typings.react.mod.TouchEvent
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseColorDragMod {
  
  @JSImport("@rc-component/color-picker/es/hooks/useColorDrag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: useColorDragProps): js.Tuple2[TransformOffset, EventHandle] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[TransformOffset, EventHandle]]
  
  type EventHandle = js.Function1[/* e */ EventType, Unit]
  
  type EventType = MouseEvent | (typings.react.mod.MouseEvent[Element, MouseEvent]) | TouchEvent[Element] | typings.std.TouchEvent
  
  trait useColorDragProps extends StObject {
    
    var calculate: js.UndefOr[js.Function1[/* containerRef */ RefObject[HTMLDivElement], TransformOffset]] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var containerRef: RefObject[HTMLDivElement]
    
    var direction: js.UndefOr[x | y] = js.undefined
    
    var offset: js.UndefOr[TransformOffset] = js.undefined
    
    var onDragChange: js.UndefOr[js.Function1[/* offset */ TransformOffset, Unit]] = js.undefined
    
    var targetRef: RefObject[HTMLDivElement]
  }
  object useColorDragProps {
    
    inline def apply(containerRef: RefObject[HTMLDivElement], targetRef: RefObject[HTMLDivElement]): useColorDragProps = {
      val __obj = js.Dynamic.literal(containerRef = containerRef.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[useColorDragProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: useColorDragProps] (val x: Self) extends AnyVal {
      
      inline def setCalculate(value: /* containerRef */ RefObject[HTMLDivElement] => TransformOffset): Self = StObject.set(x, "calculate", js.Any.fromFunction1(value))
      
      inline def setCalculateUndefined: Self = StObject.set(x, "calculate", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "containerRef", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: typings.rcComponentColorPicker.rcComponentColorPickerStrings.x | y): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOffset(value: TransformOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnDragChange(value: /* offset */ TransformOffset => Unit): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
      
      inline def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
      
      inline def setTargetRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
