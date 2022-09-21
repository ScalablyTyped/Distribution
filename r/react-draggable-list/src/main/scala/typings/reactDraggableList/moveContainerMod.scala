package typings.reactDraggableList

import org.scalablytyped.runtime.Instantiable2
import typings.csstype.mod.Property.ZIndex
import typings.react.mod.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moveContainerMod {
  
  @JSImport("react-draggable-list/dist/src/MoveContainer", JSImport.Default)
  @js.native
  open class default[I, C, T /* <: Component[Any, Any, Any] */] () extends MoveContainer[I, C, T]
  
  trait HeightData extends StObject {
    
    var drag: Double
    
    var natural: Double
  }
  object HeightData {
    
    inline def apply(drag: Double, natural: Double): HeightData = {
      val __obj = js.Dynamic.literal(drag = drag.asInstanceOf[js.Any], natural = natural.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightData]
    }
    
    extension [Self <: HeightData](x: Self) {
      
      inline def setDrag(value: Double): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setNatural(value: Double): Self = StObject.set(x, "natural", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MoveContainer[I, C, T /* <: Component[Any, Any, Any] */]
    extends Component[Props[I, C, T], js.Object, Any] {
    
    /* private */ var _dragHandleProps: Any = js.native
    
    /* private */ val _el: Any = js.native
    
    /* private */ val _templateContainer: Any = js.native
    
    def getDOMNode(): HTMLElement = js.native
    
    def getTemplate(): T = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MMoveContainer(nextProps: Props[I, C, T]): Boolean = js.native
  }
  
  trait Props[I, C, T] extends StObject {
    
    var anySelected: Double
    
    var commonProps: C
    
    var height: HeightData
    
    var item: I
    
    var itemSelected: Double
    
    def makeDragHandleProps(getY: js.Function0[js.UndefOr[Double]]): js.Object
    
    var padding: Double
    
    var template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
    
    var y: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[ZIndex] = js.undefined
  }
  object Props {
    
    inline def apply[I, C, T](
      anySelected: Double,
      commonProps: C,
      height: HeightData,
      item: I,
      itemSelected: Double,
      makeDragHandleProps: js.Function0[js.UndefOr[Double]] => js.Object,
      padding: Double,
      template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
    ): Props[I, C, T] = {
      val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any], makeDragHandleProps = js.Any.fromFunction1(makeDragHandleProps), padding = padding.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[I, C, T]]
    }
    
    extension [Self <: Props[?, ?, ?], I, C, T](x: Self & (Props[I, C, T])) {
      
      inline def setAnySelected(value: Double): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: HeightData): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setItem(value: I): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemSelected(value: Double): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
      
      inline def setMakeDragHandleProps(value: js.Function0[js.UndefOr[Double]] => js.Object): Self = StObject.set(x, "makeDragHandleProps", js.Any.fromFunction1(value))
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZIndex(value: ZIndex): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
