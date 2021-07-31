package typings.reactDraggableList

import org.scalablytyped.runtime.Instantiable2
import typings.react.mod.Component
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-draggable-list", JSImport.Default)
  @js.native
  class default[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, js.Any] */] () extends DraggableList[I, C, T]
  
  @js.native
  trait DraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, js.Any] */]
    extends Component[Props[I, C, T], js.Object, js.Any] {
    
    def getItemInstance(key: String): T = js.native
  }
  
  trait Props[I, C, T] extends StObject {
    
    var autoScrollMaxSpeed: js.UndefOr[Double] = js.undefined
    
    var autoScrollRegionSize: js.UndefOr[Double] = js.undefined
    
    var commonProps: js.UndefOr[C] = js.undefined
    
    var constrainDrag: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | Null]]] = js.undefined
    
    var itemKey: String | (js.Function1[/* item */ I, String])
    
    var list: js.Array[I]
    
    var onMoveEnd: js.UndefOr[
        js.Function4[
          /* newList */ js.Array[I], 
          /* movedItem */ I, 
          /* oldIndex */ Double, 
          /* newIndex */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var springConfig: js.UndefOr[js.Object] = js.undefined
    
    var template: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]
    
    var unsetZIndex: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    @scala.inline
    def apply[I, C, T](
      itemKey: String | (js.Function1[/* item */ I, String]),
      list: js.Array[I],
      template: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]
    ): Props[I, C, T] = {
      val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[I, C, T]]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props[?, ?, ?], I, C, T] (val x: Self & (Props[I, C, T])) extends AnyVal {
      
      @scala.inline
      def setAutoScrollMaxSpeed(value: Double): Self = StObject.set(x, "autoScrollMaxSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollMaxSpeedUndefined: Self = StObject.set(x, "autoScrollMaxSpeed", js.undefined)
      
      @scala.inline
      def setAutoScrollRegionSize(value: Double): Self = StObject.set(x, "autoScrollRegionSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollRegionSizeUndefined: Self = StObject.set(x, "autoScrollRegionSize", js.undefined)
      
      @scala.inline
      def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonPropsUndefined: Self = StObject.set(x, "commonProps", js.undefined)
      
      @scala.inline
      def setConstrainDrag(value: Boolean): Self = StObject.set(x, "constrainDrag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstrainDragUndefined: Self = StObject.set(x, "constrainDrag", js.undefined)
      
      @scala.inline
      def setContainer(value: () => js.UndefOr[HTMLElement | Null]): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setItemKey(value: String | (js.Function1[/* item */ I, String])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemKeyFunction1(value: /* item */ I => String): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setList(value: js.Array[I]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListVarargs(value: I*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setOnMoveEnd(
        value: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ Double, /* newIndex */ Double) => Unit
      ): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
      
      @scala.inline
      def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setSpringConfig(value: js.Object): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      @scala.inline
      def setTemplate(value: Instantiable2[/* props */ js.Any, /* context */ js.UndefOr[js.Any], T]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsetZIndex(value: Boolean): Self = StObject.set(x, "unsetZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsetZIndexUndefined: Self = StObject.set(x, "unsetZIndex", js.undefined)
    }
  }
  
  trait TemplateProps[I, C] extends StObject {
    
    var anySelected: Double
    
    var commonProps: C
    
    var dragHandleProps: js.Object
    
    var item: I
    
    var itemSelected: Double
  }
  object TemplateProps {
    
    @scala.inline
    def apply[I, C](anySelected: Double, commonProps: C, dragHandleProps: js.Object, item: I, itemSelected: Double): TemplateProps[I, C] = {
      val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateProps[I, C]]
    }
    
    @scala.inline
    implicit class TemplatePropsMutableBuilder[Self <: TemplateProps[?, ?], I, C] (val x: Self & (TemplateProps[I, C])) extends AnyVal {
      
      @scala.inline
      def setAnySelected(value: Double): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragHandleProps(value: js.Object): Self = StObject.set(x, "dragHandleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: I): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemSelected(value: Double): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
    }
  }
}
