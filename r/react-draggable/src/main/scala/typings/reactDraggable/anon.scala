package typings.reactDraggable

import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactDraggable.mod.ControlPosition
import typings.reactDraggable.mod.DraggableBounds
import typings.reactDraggable.mod.DraggableData
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.mod.DraggableEventHandler
import typings.reactDraggable.mod.PositionOffsetControlPosition
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.reactDraggable.reactDraggableStrings.both
import typings.reactDraggable.reactDraggableStrings.none
import typings.reactDraggable.reactDraggableStrings.x
import typings.reactDraggable.reactDraggableStrings.y
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-draggable.react-draggable.DraggableCoreProps> */
  trait PartialDraggableCoreProps extends StObject {
    
    var allowAnyClick: js.UndefOr[Boolean] = js.undefined
    
    var cancel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
    
    var offsetParent: js.UndefOr[HTMLElement] = js.undefined
    
    var onDrag: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
    
    var onStart: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var onStop: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object PartialDraggableCoreProps {
    
    inline def apply(): PartialDraggableCoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDraggableCoreProps]
    }
    
    extension [Self <: PartialDraggableCoreProps](x: Self) {
      
      inline def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      inline def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      inline def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setNodeRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      inline def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      inline def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-draggable.react-draggable.DraggableProps> */
  trait PartialDraggableProps extends StObject {
    
    var allowAnyClick: js.UndefOr[Boolean] = js.undefined
    
    var axis: js.UndefOr[both | x | y | none] = js.undefined
    
    var bounds: js.UndefOr[DraggableBounds | String | `false`] = js.undefined
    
    var cancel: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultClassName: js.UndefOr[String] = js.undefined
    
    var defaultClassNameDragged: js.UndefOr[String] = js.undefined
    
    var defaultClassNameDragging: js.UndefOr[String] = js.undefined
    
    var defaultPosition: js.UndefOr[ControlPosition] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.undefined
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var handle: js.UndefOr[String] = js.undefined
    
    var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.undefined
    
    var offsetParent: js.UndefOr[HTMLElement] = js.undefined
    
    var onDrag: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.undefined
    
    var onStart: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var onStop: js.UndefOr[DraggableEventHandler] = js.undefined
    
    var position: js.UndefOr[ControlPosition] = js.undefined
    
    var positionOffset: js.UndefOr[PositionOffsetControlPosition] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
  }
  object PartialDraggableProps {
    
    inline def apply(): PartialDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDraggableProps]
    }
    
    extension [Self <: PartialDraggableProps](x: Self) {
      
      inline def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      inline def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      inline def setAxis(value: both | typings.reactDraggable.reactDraggableStrings.x | y | none): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setBounds(value: DraggableBounds | String | `false`): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameDragged(value: String): Self = StObject.set(x, "defaultClassNameDragged", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameDraggedUndefined: Self = StObject.set(x, "defaultClassNameDragged", js.undefined)
      
      inline def setDefaultClassNameDragging(value: String): Self = StObject.set(x, "defaultClassNameDragging", value.asInstanceOf[js.Any])
      
      inline def setDefaultClassNameDraggingUndefined: Self = StObject.set(x, "defaultClassNameDragging", js.undefined)
      
      inline def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      inline def setDefaultPosition(value: ControlPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      inline def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      inline def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      inline def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setNodeRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      inline def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      inline def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      inline def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      inline def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionOffset(value: PositionOffsetControlPosition): Self = StObject.set(x, "positionOffset", value.asInstanceOf[js.Any])
      
      inline def setPositionOffsetUndefined: Self = StObject.set(x, "positionOffset", js.undefined)
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
