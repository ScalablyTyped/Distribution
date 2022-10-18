package typings.reactJsonTree

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.reactBase16Styling.libTypesTypesMod.StylingFunction
import typings.reactJsonTree.reactJsonTreeStrings.double
import typings.reactJsonTree.reactJsonTreeStrings.single
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesJsonarrowMod extends Shortcut {
  
  @JSImport("react-json-tree/lib/types/JSONArrow", JSImport.Default)
  @js.native
  val default: FunctionComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var arrowStyle: js.UndefOr[single | double] = js.undefined
    
    var expanded: Boolean
    
    var nodeType: String
    
    var onClick: MouseEventHandler[HTMLDivElement]
    
    var styling: StylingFunction
  }
  object Props {
    
    inline def apply(
      expanded: Boolean,
      nodeType: String,
      onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
      styling: StylingFunction
    ): Props = {
      val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], nodeType = nodeType.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), styling = styling.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setArrowStyle(value: single | double): Self = StObject.set(x, "arrowStyle", value.asInstanceOf[js.Any])
      
      inline def setArrowStyleUndefined: Self = StObject.set(x, "arrowStyle", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setNodeType(value: String): Self = StObject.set(x, "nodeType", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setStyling(value: StylingFunction): Self = StObject.set(x, "styling", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[Props]
  
  /* This means you don't have to write `default`, but can instead just say `libTypesJsonarrowMod.foo` */
  override def _to: FunctionComponent[Props] = default
}
