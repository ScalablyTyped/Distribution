package typings.reactDraggableList

import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTemplateContainerMod {
  
  @JSImport("react-draggable-list/dist/src/TemplateContainer", JSImport.Default)
  @js.native
  open class default[I, C, T /* <: Component[Any, Any, Any] */] () extends TemplateContainer[I, C, T]
  
  trait Props[I, C, T] extends StObject {
    
    var anySelected: Double
    
    var commonProps: C
    
    var dragHandleProps: js.Object
    
    var item: I
    
    var itemSelected: Double
    
    var template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
  }
  object Props {
    
    inline def apply[I, C, T](
      anySelected: Double,
      commonProps: C,
      dragHandleProps: js.Object,
      item: I,
      itemSelected: Double,
      template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
    ): Props[I, C, T] = {
      val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[I, C, T]]
    }
    
    extension [Self <: Props[?, ?, ?], I, C, T](x: Self & (Props[I, C, T])) {
      
      inline def setAnySelected(value: Double): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setDragHandleProps(value: js.Object): Self = StObject.set(x, "dragHandleProps", value.asInstanceOf[js.Any])
      
      inline def setItem(value: I): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemSelected(value: Double): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TemplateContainer[I, C, T /* <: Component[Any, Any, Any] */]
    extends Component[Props[I, C, T], js.Object, Any] {
    
    /* private */ var _template: Any = js.native
    
    /* private */ val _templateSetter: Any = js.native
    
    def getTemplate(): T = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTemplateContainer(nextProps: Props[I, C, T]): Boolean = js.native
  }
}
