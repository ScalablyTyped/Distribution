package typings.reactDraggableList

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.reactDraggableList.anon.AutoScrollMaxSpeed
import typings.reactDraggableList.anon.PartialPropsanyanyany
import typings.reactDraggableList.anon.PartialState
import typings.reactDraggableList.distSrcMoveContainerMod.HeightData
import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("react-draggable-list/dist/src", JSImport.Default)
  @js.native
  open class default[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, Any] */] () extends DraggableList[I, C, T]
  /* static members */
  object default {
    
    @JSImport("react-draggable-list/dist/src", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def _getIndexOfItemWithKey[I](keyFn: js.Function1[/* item */ I, String], list: js.Array[I], itemKey: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_getIndexOfItemWithKey")(keyFn.asInstanceOf[js.Any], list.asInstanceOf[js.Any], itemKey.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @JSImport("react-draggable-list/dist/src", "default._getKeyFn")
    @js.native
    def _getKeyFn: Any = js.native
    inline def _getKeyFn_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_getKeyFn")(x.asInstanceOf[js.Any])
    
    @JSImport("react-draggable-list/dist/src", "default.defaultProps")
    @js.native
    def defaultProps: PartialPropsanyanyany = js.native
    inline def defaultProps_=(x: PartialPropsanyanyany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps[I, C, T](newProps: Props[I, C, T], state: State): PartialState | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialState | Null]
    
    @JSImport("react-draggable-list/dist/src", "default.propTypes")
    @js.native
    def propTypes: AutoScrollMaxSpeed = js.native
    inline def propTypes_=(x: AutoScrollMaxSpeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait Drag extends StObject {
    
    var itemKey: String
    
    var mouseOffset: Double
    
    var mouseY: Double
    
    var startY: Double
  }
  object Drag {
    
    inline def apply(itemKey: String, mouseOffset: Double, mouseY: Double, startY: Double): Drag = {
      val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], mouseOffset = mouseOffset.asInstanceOf[js.Any], mouseY = mouseY.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Drag]
    }
    
    extension [Self <: Drag](x: Self) {
      
      inline def setItemKey(value: String): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setMouseOffset(value: Double): Self = StObject.set(x, "mouseOffset", value.asInstanceOf[js.Any])
      
      inline def setMouseY(value: Double): Self = StObject.set(x, "mouseY", value.asInstanceOf[js.Any])
      
      inline def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DraggableList[I, C, T /* <: Component[Partial[TemplateProps[I, C]], js.Object, Any] */] extends Component[Props[I, C, T], State, Any] {
    
    def _adjustScrollAtEnd(delta: Double): Unit = js.native
    
    /* private */ var _autoScrollerTimer: Any = js.native
    
    /* private */ var _getContainer: Any = js.native
    
    def _getDistance(start: Double, end: Double, dragging: Boolean): Double = js.native
    def _getDistance(start: Double, end: Double, dragging: Boolean, list: js.Array[I]): Double = js.native
    
    def _getDistanceFromTopDuringDrag(lastDrag: Drag, itemKey: String, visualList: js.Array[I]): Double = js.native
    
    def _getDragListIndex(): Double = js.native
    
    def _getDragVisualIndex(): Double = js.native
    
    def _getItemHeight(key: String): HeightData = js.native
    
    /* private */ var _getKeyFn: Any = js.native
    
    def _getVisualListDuringDrag(): js.Array[I] = js.native
    
    /* private */ var _handleMouseDown: Any = js.native
    
    /* private */ var _handleMouseMove: Any = js.native
    
    def _handleMouseUp(): Unit = js.native
    
    /* private */ var _handleStartDrag: Any = js.native
    
    /* private */ var _handleTouchMove: Any = js.native
    
    /* private */ var _handleTouchStart: Any = js.native
    
    /* private */ val _itemRefs: Any = js.native
    
    /* private */ var _lastScrollDelta: Any = js.native
    
    /* private */ var _listRef: Any = js.native
    
    def _scrollContainer(delta: Double): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDraggableList(): Unit = js.native
    
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
    
    var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
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
    
    var template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
    
    var unsetZIndex: js.UndefOr[Boolean] = js.undefined
  }
  object Props {
    
    inline def apply[I, C, T](
      itemKey: String | (js.Function1[/* item */ I, String]),
      list: js.Array[I],
      template: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]
    ): Props[I, C, T] = {
      val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[I, C, T]]
    }
    
    extension [Self <: Props[?, ?, ?], I, C, T](x: Self & (Props[I, C, T])) {
      
      inline def setAutoScrollMaxSpeed(value: Double): Self = StObject.set(x, "autoScrollMaxSpeed", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollMaxSpeedUndefined: Self = StObject.set(x, "autoScrollMaxSpeed", js.undefined)
      
      inline def setAutoScrollRegionSize(value: Double): Self = StObject.set(x, "autoScrollRegionSize", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollRegionSizeUndefined: Self = StObject.set(x, "autoScrollRegionSize", js.undefined)
      
      inline def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setCommonPropsUndefined: Self = StObject.set(x, "commonProps", js.undefined)
      
      inline def setConstrainDrag(value: Boolean): Self = StObject.set(x, "constrainDrag", value.asInstanceOf[js.Any])
      
      inline def setConstrainDragUndefined: Self = StObject.set(x, "constrainDrag", js.undefined)
      
      inline def setContainer(value: () => js.UndefOr[HTMLElement | Null]): Self = StObject.set(x, "container", js.Any.fromFunction0(value))
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setItemKey(value: String | (js.Function1[/* item */ I, String])): Self = StObject.set(x, "itemKey", value.asInstanceOf[js.Any])
      
      inline def setItemKeyFunction1(value: /* item */ I => String): Self = StObject.set(x, "itemKey", js.Any.fromFunction1(value))
      
      inline def setList(value: js.Array[I]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListVarargs(value: I*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnMoveEnd(
        value: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ Double, /* newIndex */ Double) => Unit
      ): Self = StObject.set(x, "onMoveEnd", js.Any.fromFunction4(value))
      
      inline def setOnMoveEndUndefined: Self = StObject.set(x, "onMoveEnd", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSpringConfig(value: js.Object): Self = StObject.set(x, "springConfig", value.asInstanceOf[js.Any])
      
      inline def setSpringConfigUndefined: Self = StObject.set(x, "springConfig", js.undefined)
      
      inline def setTemplate(value: Instantiable2[/* props */ Any, /* context */ js.UndefOr[Any], T]): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setUnsetZIndex(value: Boolean): Self = StObject.set(x, "unsetZIndex", value.asInstanceOf[js.Any])
      
      inline def setUnsetZIndexUndefined: Self = StObject.set(x, "unsetZIndex", js.undefined)
    }
  }
  
  trait State extends StObject {
    
    var dragging: Boolean
    
    var heights: StringDictionary[HeightData] | Null
    
    var lastDrag: Drag | Null
    
    var useAbsolutePositioning: Boolean
  }
  object State {
    
    inline def apply(dragging: Boolean, useAbsolutePositioning: Boolean): State = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], useAbsolutePositioning = useAbsolutePositioning.asInstanceOf[js.Any], heights = null, lastDrag = null)
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      inline def setHeights(value: StringDictionary[HeightData]): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      inline def setHeightsNull: Self = StObject.set(x, "heights", null)
      
      inline def setLastDrag(value: Drag): Self = StObject.set(x, "lastDrag", value.asInstanceOf[js.Any])
      
      inline def setLastDragNull: Self = StObject.set(x, "lastDrag", null)
      
      inline def setUseAbsolutePositioning(value: Boolean): Self = StObject.set(x, "useAbsolutePositioning", value.asInstanceOf[js.Any])
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
    
    inline def apply[I, C](anySelected: Double, commonProps: C, dragHandleProps: js.Object, item: I, itemSelected: Double): TemplateProps[I, C] = {
      val __obj = js.Dynamic.literal(anySelected = anySelected.asInstanceOf[js.Any], commonProps = commonProps.asInstanceOf[js.Any], dragHandleProps = dragHandleProps.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemSelected = itemSelected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateProps[I, C]]
    }
    
    extension [Self <: TemplateProps[?, ?], I, C](x: Self & (TemplateProps[I, C])) {
      
      inline def setAnySelected(value: Double): Self = StObject.set(x, "anySelected", value.asInstanceOf[js.Any])
      
      inline def setCommonProps(value: C): Self = StObject.set(x, "commonProps", value.asInstanceOf[js.Any])
      
      inline def setDragHandleProps(value: js.Object): Self = StObject.set(x, "dragHandleProps", value.asInstanceOf[js.Any])
      
      inline def setItem(value: I): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemSelected(value: Double): Self = StObject.set(x, "itemSelected", value.asInstanceOf[js.Any])
    }
  }
}
