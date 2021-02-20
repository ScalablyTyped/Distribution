package typings.reactDraggable

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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-draggable.react-draggable.DraggableCoreProps> */
  @js.native
  trait PartialDraggableCoreProps extends StObject {
    
    var allowAnyClick: js.UndefOr[Boolean] = js.native
    
    var cancel: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.native
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var handle: js.UndefOr[String] = js.native
    
    var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.native
    
    var offsetParent: js.UndefOr[HTMLElement] = js.native
    
    var onDrag: js.UndefOr[DraggableEventHandler] = js.native
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    
    var onStart: js.UndefOr[DraggableEventHandler] = js.native
    
    var onStop: js.UndefOr[DraggableEventHandler] = js.native
    
    var scale: js.UndefOr[Double] = js.native
  }
  object PartialDraggableCoreProps {
    
    @scala.inline
    def apply(): PartialDraggableCoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDraggableCoreProps]
    }
    
    @scala.inline
    implicit class PartialDraggableCorePropsMutableBuilder[Self <: PartialDraggableCoreProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setNodeRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      @scala.inline
      def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      @scala.inline
      def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-draggable.react-draggable.DraggableProps> */
  @js.native
  trait PartialDraggableProps extends StObject {
    
    var allowAnyClick: js.UndefOr[Boolean] = js.native
    
    var axis: js.UndefOr[both | x | y | none] = js.native
    
    var bounds: js.UndefOr[DraggableBounds | String | `false`] = js.native
    
    var cancel: js.UndefOr[String] = js.native
    
    var defaultClassName: js.UndefOr[String] = js.native
    
    var defaultClassNameDragged: js.UndefOr[String] = js.native
    
    var defaultClassNameDragging: js.UndefOr[String] = js.native
    
    var defaultPosition: js.UndefOr[ControlPosition] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var enableUserSelectHack: js.UndefOr[Boolean] = js.native
    
    var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.native
    
    var handle: js.UndefOr[String] = js.native
    
    var nodeRef: js.UndefOr[RefObject[HTMLElement]] = js.native
    
    var offsetParent: js.UndefOr[HTMLElement] = js.native
    
    var onDrag: js.UndefOr[DraggableEventHandler] = js.native
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent, Unit]] = js.native
    
    var onStart: js.UndefOr[DraggableEventHandler] = js.native
    
    var onStop: js.UndefOr[DraggableEventHandler] = js.native
    
    var position: js.UndefOr[ControlPosition] = js.native
    
    var positionOffset: js.UndefOr[PositionOffsetControlPosition] = js.native
    
    var scale: js.UndefOr[Double] = js.native
  }
  object PartialDraggableProps {
    
    @scala.inline
    def apply(): PartialDraggableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialDraggableProps]
    }
    
    @scala.inline
    implicit class PartialDraggablePropsMutableBuilder[Self <: PartialDraggableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowAnyClick(value: Boolean): Self = StObject.set(x, "allowAnyClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowAnyClickUndefined: Self = StObject.set(x, "allowAnyClick", js.undefined)
      
      @scala.inline
      def setAxis(value: both | typings.reactDraggable.reactDraggableStrings.x | y | none): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setBounds(value: DraggableBounds | String | `false`): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDefaultClassName(value: String): Self = StObject.set(x, "defaultClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameDragged(value: String): Self = StObject.set(x, "defaultClassNameDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameDraggedUndefined: Self = StObject.set(x, "defaultClassNameDragged", js.undefined)
      
      @scala.inline
      def setDefaultClassNameDragging(value: String): Self = StObject.set(x, "defaultClassNameDragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultClassNameDraggingUndefined: Self = StObject.set(x, "defaultClassNameDragging", js.undefined)
      
      @scala.inline
      def setDefaultClassNameUndefined: Self = StObject.set(x, "defaultClassName", js.undefined)
      
      @scala.inline
      def setDefaultPosition(value: ControlPosition): Self = StObject.set(x, "defaultPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPositionUndefined: Self = StObject.set(x, "defaultPosition", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEnableUserSelectHack(value: Boolean): Self = StObject.set(x, "enableUserSelectHack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUserSelectHackUndefined: Self = StObject.set(x, "enableUserSelectHack", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setNodeRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "nodeRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeRefUndefined: Self = StObject.set(x, "nodeRef", js.undefined)
      
      @scala.inline
      def setOffsetParent(value: HTMLElement): Self = StObject.set(x, "offsetParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetParentUndefined: Self = StObject.set(x, "offsetParent", js.undefined)
      
      @scala.inline
      def setOnDrag(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onDrag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: /* e */ MouseEvent => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnStart(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      @scala.inline
      def setOnStop(value: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`): Self = StObject.set(x, "onStop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      @scala.inline
      def setPosition(value: ControlPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOffset(value: PositionOffsetControlPosition): Self = StObject.set(x, "positionOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionOffsetUndefined: Self = StObject.set(x, "positionOffset", js.undefined)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    }
  }
}
