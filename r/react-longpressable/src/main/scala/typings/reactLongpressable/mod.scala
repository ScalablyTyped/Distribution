package typings.reactLongpressable

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-longpressable", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[LongPressProps, js.Object, Any]
  
  type LongPress = PureComponent[LongPressProps, js.Object, Any]
  
  trait LongPressProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      *
      * @default 100ms
      */
    var dragThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      *
      * @default 500ms
      */
    var longPressTime: js.UndefOr[Double] = js.undefined
    
    def onLongPress(e: SyntheticEvent[Element, Event]): Unit
    
    var onShortPress: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], Unit]] = js.undefined
    
    /**
      * @default true
      */
    var primaryMouseButtonOnly: js.UndefOr[Boolean] = js.undefined
  }
  object LongPressProps {
    
    inline def apply(onLongPress: SyntheticEvent[Element, Event] => Unit): LongPressProps = {
      val __obj = js.Dynamic.literal(onLongPress = js.Any.fromFunction1(onLongPress))
      __obj.asInstanceOf[LongPressProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LongPressProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDragThreshold(value: Double): Self = StObject.set(x, "dragThreshold", value.asInstanceOf[js.Any])
      
      inline def setDragThresholdUndefined: Self = StObject.set(x, "dragThreshold", js.undefined)
      
      inline def setLongPressTime(value: Double): Self = StObject.set(x, "longPressTime", value.asInstanceOf[js.Any])
      
      inline def setLongPressTimeUndefined: Self = StObject.set(x, "longPressTime", js.undefined)
      
      inline def setOnLongPress(value: SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnShortPress(value: /* e */ SyntheticEvent[Element, Event] => Unit): Self = StObject.set(x, "onShortPress", js.Any.fromFunction1(value))
      
      inline def setOnShortPressUndefined: Self = StObject.set(x, "onShortPress", js.undefined)
      
      inline def setPrimaryMouseButtonOnly(value: Boolean): Self = StObject.set(x, "primaryMouseButtonOnly", value.asInstanceOf[js.Any])
      
      inline def setPrimaryMouseButtonOnlyUndefined: Self = StObject.set(x, "primaryMouseButtonOnly", js.undefined)
    }
  }
}
