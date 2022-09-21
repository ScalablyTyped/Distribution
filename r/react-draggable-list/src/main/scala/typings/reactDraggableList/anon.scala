package typings.reactDraggableList

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.reactDraggableList.moveContainerMod.HeightData
import typings.reactDraggableList.srcMod.Drag
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoScrollMaxSpeed extends StObject {
    
    var autoScrollMaxSpeed: Validator[Double]
    
    var autoScrollRegionSize: Validator[Double]
    
    var commonProps: Requireable[js.Object]
    
    var constrainDrag: Requireable[Boolean]
    
    var container: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var itemKey: Validator[String | (js.Function1[/* repeated */ Any, Any])]
    
    var list: Validator[js.Array[Any]]
    
    var onMoveEnd: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var padding: Requireable[Double]
    
    var springConfig: Requireable[js.Object]
    
    var template: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    var unsetZIndex: Requireable[Boolean]
  }
  object AutoScrollMaxSpeed {
    
    inline def apply(
      autoScrollMaxSpeed: Validator[Double],
      autoScrollRegionSize: Validator[Double],
      commonProps: Requireable[js.Object],
      constrainDrag: Requireable[Boolean],
      container: Requireable[js.Function1[/* repeated */ Any, Any]],
      itemKey: Validator[String | (js.Function1[/* repeated */ Any, Any])],
      list: Validator[js.Array[Any]],
      onMoveEnd: Requireable[js.Function1[/* repeated */ Any, Any]],
      padding: Requireable[Double],
      springConfig: Requireable[js.Object],
      template: Requireable[js.Function1[/* repeated */ Any, Any]],
      unsetZIndex: Requireable[Boolean]
    ): AutoScrollMaxSpeed = {
      val __obj = js.Dynamic.literal(autoScrollMaxSpeed = autoScrollMaxSpeed.asInstanceOf[js.Any], autoScrollRegionSize = autoScrollRegionSize.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], constrainDrag = constrainDrag.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], onMoveEnd = onMoveEnd.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], springConfig = springConfig.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], unsetZIndex = unsetZIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoScrollMaxSpeed]
    }
    
    extension [Self <: AutoScrollMaxSpeed](x: Self) {
      
      inline def setAutoScrollMaxSpeed(value: Validator[Double]): Self = StObject.set(x, "autoScrollMaxSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollRegionSize(value: Validator[Double]): Self = StObject.set(x, "autoScrollRegionSize", value.asInstanceOf[js.Any])
      
      inline def setCommonProps(value: Requireable[js.Object]): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setConstrainDrag(value: Requireable[Boolean]): Self = StObject.set(x, "constrainDrag", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setItemKey(value: Validator[String | (js.Function1[/* repeated */ Any, Any])]): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setList(value: Validator[js.Array[Any]]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setOnMoveEnd(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMoveEnd", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: Requireable[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setSpringConfig(value: Requireable[js.Object]): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setUnsetZIndex(value: Requireable[Boolean]): Self = StObject.set(x, "unsetZIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait List extends StObject {
    
    var list: js.Array[Name | Subtitle]
    
    var useContainer: Boolean
  }
  object List {
    
    inline def apply(list: js.Array[Name | Subtitle], useContainer: Boolean): List = {
      val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], useContainer = useContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[List]
    }
    
    extension [Self <: List](x: Self) {
      
      inline def setList(value: js.Array[Name | Subtitle]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: (Name | Subtitle)*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setUseContainer(value: Boolean): Self = StObject.set(x, "useContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var subtitle: Unit
  }
  object Name {
    
    inline def apply(name: String, subtitle: Unit): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: Unit): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<react-draggable-list.react-draggable-list/dist/src.Props<any, any, any>> */
  trait PartialPropsanyanyany extends StObject {
    
    var autoScrollMaxSpeed: js.UndefOr[Double] = js.undefined
    
    var autoScrollRegionSize: js.UndefOr[Double] = js.undefined
    
    var commonProps: js.UndefOr[Any] = js.undefined
    
    var constrainDrag: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | Null]]] = js.undefined
    
    var itemKey: js.UndefOr[String | (js.Function1[/* item */ Any, String])] = js.undefined
    
    var list: js.UndefOr[js.Array[Any]] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMoveEnd: js.UndefOr[
        js.Function4[
          /* newList */ js.Array[Any], 
          /* movedItem */ Any, 
          /* oldIndex */ Double, 
          /* newIndex */ Double, 
          Unit
        ]
      ] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var springConfig: js.UndefOr[js.Object] = js.undefined
    
    var template: js.UndefOr[Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any]] = js.undefined
    
    var unsetZIndex: js.UndefOr[Boolean] = js.undefined
  }
  object PartialPropsanyanyany {
    
    inline def apply(): PartialPropsanyanyany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPropsanyanyany]
    }
    
    extension [Self <: PartialPropsanyanyany](x: Self) {
      
      inline def setAutoScrollMaxSpeed(value: Double): Self = StObject.set(x, "autoScrollMaxSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollMaxSpeedUndefined: Self = StObject.set(x, "autoScrollMaxSpeed", js.undefined)
      
      inline def setAutoScrollRegionSize(value: Double): Self = StObject.set(x, "autoScrollRegionSize", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollRegionSizeUndefined: Self = StObject.set(x, "autoScrollRegionSize", js.undefined)
      
      inline def setCommonProps(value: Any): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setCommonPropsUndefined: Self = StObject.set(x, "commonProps", js.undefined)
      
      inline def setConstrainDrag(value: Boolean): Self = StObject.set(x, "constrainDrag", value.asInstanceOf[js.Any])
      
      inline def setConstrainDragUndefined: Self = StObject.set(x, "constrainDrag", js.undefined)
      
      inline def setContainer(value: () => js.UndefOr[HTMLElement | Null]): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setItemKey(value: String | (js.Function1[/* item */ Any, String])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setItemKeyFunction1(value: /* item */ Any => String): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      inline def setItemKeyUndefined: Self = StObject.set(x, "itemKey", js.undefined)
      
      inline def setList(value: js.Array[Any]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: Any*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnMoveEnd(
        value: (/* newList */ js.Array[Any], /* movedItem */ Any, /* oldIndex */ Double, /* newIndex */ Double) => Unit
      ): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction4(value))
      
      inline def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSpringConfig(value: js.Object): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setTemplate(value: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], Any]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setUnsetZIndex(value: Boolean): Self = StObject.set(x, "unsetZIndex", value.asInstanceOf[js.Any])
      
      inline def setUnsetZIndexUndefined: Self = StObject.set(x, "unsetZIndex", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-draggable-list.react-draggable-list/dist/src.State> */
  trait PartialState extends StObject {
    
    var dragging: js.UndefOr[Boolean] = js.undefined
    
    var heights: js.UndefOr[StringDictionary[HeightData] | Null] = js.undefined
    
    var lastDrag: js.UndefOr[Drag | Null] = js.undefined
    
    var useAbsolutePositioning: js.UndefOr[Boolean] = js.undefined
  }
  object PartialState {
    
    inline def apply(): PartialState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialState]
    }
    
    extension [Self <: PartialState](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setDraggingUndefined: Self = StObject.set(x, "dragging", js.undefined)
      
      inline def setHeights(value: StringDictionary[HeightData]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      inline def setHeightsNull: Self = StObject.set(x, "heights", null)
      
      inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
      
      inline def setLastDrag(value: Drag): Self = StObject.set(x, "lastDrag", value.asInstanceOf[js.Any])
      
      inline def setLastDragNull: Self = StObject.set(x, "lastDrag", null)
      
      inline def setLastDragUndefined: Self = StObject.set(x, "lastDrag", js.undefined)
      
      inline def setUseAbsolutePositioning(value: Boolean): Self = StObject.set(x, "useAbsolutePositioning", value.asInstanceOf[js.Any])
      
      inline def setUseAbsolutePositioningUndefined: Self = StObject.set(x, "useAbsolutePositioning", js.undefined)
    }
  }
  
  trait Subtitle extends StObject {
    
    var name: String
    
    var subtitle: Boolean
  }
  object Subtitle {
    
    inline def apply(name: String, subtitle: Boolean): Subtitle = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subtitle]
    }
    
    extension [Self <: Subtitle](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSubtitle(value: Boolean): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    }
  }
}
