package typings.reactFloater

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.reactFloater.libTypesMod.HandlerFunction
import typings.reactFloater.libTypesMod.Statuses
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsWrapperMod extends Shortcut {
  
  @JSImport("react-floater/lib/components/Wrapper", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = js.native
  
  trait Props extends StObject {
    
    var childRef: RefObject[HTMLElement]
    
    var children: ReactNode
    
    var id: String
    
    var isControlled: Boolean
    
    var onClick: HandlerFunction[HTMLSpanElement]
    
    var onMouseEnter: HandlerFunction[HTMLSpanElement]
    
    var onMouseLeave: HandlerFunction[HTMLSpanElement]
    
    var status: Statuses
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styles: CSSProperties
    
    var wrapperRef: RefObject[HTMLElement]
  }
  object Props {
    
    inline def apply(
      childRef: RefObject[HTMLElement],
      id: String,
      isControlled: Boolean,
      onClick: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit,
      onMouseEnter: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit,
      onMouseLeave: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit,
      status: Statuses,
      styles: CSSProperties,
      wrapperRef: RefObject[HTMLElement]
    ): Props = {
      val __obj = js.Dynamic.literal(childRef = childRef.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isControlled = isControlled.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter), onMouseLeave = js.Any.fromFunction1(onMouseLeave), status = status.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], wrapperRef = wrapperRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setChildRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "childRef", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsControlled(value: Boolean): Self = StObject.set(x, "isControlled", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnter(value: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeave(value: /* event */ SyntheticEvent[HTMLSpanElement, Event] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setStatus(value: Statuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setWrapperRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "wrapperRef", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsWrapperMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Props, Element | Null]] = default
}
