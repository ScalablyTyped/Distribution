package typings.reactDnd

import org.scalablytyped.runtime.TopLevel
import typings.dndCore.interfacesMod.Identifier
import typings.hoistNonReactStatics.mod.NonReactStatics
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactDnd.anon.DecoratedComponent
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.monitorsMod.DragLayerMonitor
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.monitorsMod.DropTargetMonitor
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait DndComponent[Props]
    extends Component[Props, js.Object, js.Any] {
    
    def getDecoratedComponentInstance(): (Component[Props, js.Object, js.Any]) | Null = js.native
    
    def getHandlerId(): Identifier = js.native
  }
  
  type DndComponentClass[C /* <: ComponentType[js.Any] */, P] = (ComponentClass[LibraryManagedAttributes[C, P], ComponentState]) & (NonReactStatics[C, js.Object]) & DecoratedComponent[C]
  
  type DndComponentEnhancer[CollectedProps] = js.Function1[
    /* component */ js.Any, 
    DndComponentClass[
      js.Any, 
      Omit[
        GetProps[js.Any], 
        /* keyof react-dnd.react-dnd/lib/decorators/interfaces.Shared<CollectedProps, react-dnd.react-dnd/lib/decorators/interfaces.GetProps<any>> */ String
      ]
    ]
  ]
  
  type DragLayerCollector[TargetProps, CollectedProps] = js.Function2[/* monitor */ DragLayerMonitor, /* props */ TargetProps, CollectedProps]
  
  type DragSourceCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DragSourceConnector, 
    /* monitor */ DragSourceMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  
  trait DragSourceConnector extends StObject {
    
    /**
      * Optional. Returns a function that may be used inside the component to assign the drag preview role to a node. By
      * returning { connectDragPreview: connect.dragPreview() } from your collecting function, you can mark any React element
      * as the drag preview node. To do that, replace any element with this.props.connectDragPreview(element) inside the render
      * function. The drag preview is the node that will be screenshotted by the HTML5 backend when the drag begins. For example,
      * if you want to make something draggable by a small custom handle, you can mark this handle as the dragSource(), but also
      * mark an outer, larger component node as the dragPreview(). Thus the larger drag preview appears on the screenshot, but
      * only the smaller drag source is actually draggable. Another possible customization is passing an Image instance to dragPreview
      * from a lifecycle method like componentDidMount. This lets you use the actual images for drag previews. (Note that IE does not
      * support this customization). See the example code below for the different usage examples.
      */
    def dragPreview(): ConnectDragPreview
    
    /**
      * Returns a function that must be used inside the component to assign the drag source role to a node. By
      * returning { connectDragSource: connect.dragSource() } from your collecting function, you can mark any React
      * element as the draggable node. To do that, replace any element with this.props.connectDragSource(element) inside
      * the render function.
      */
    def dragSource(): ConnectDragSource
  }
  object DragSourceConnector {
    
    inline def apply(dragPreview: () => ConnectDragPreview, dragSource: () => ConnectDragSource): DragSourceConnector = {
      val __obj = js.Dynamic.literal(dragPreview = js.Any.fromFunction0(dragPreview), dragSource = js.Any.fromFunction0(dragSource))
      __obj.asInstanceOf[DragSourceConnector]
    }
    
    extension [Self <: DragSourceConnector](x: Self) {
      
      inline def setDragPreview(value: () => ConnectDragPreview): Self = StObject.set(x, "dragPreview", js.Any.fromFunction0(value))
      
      inline def setDragSource(value: () => ConnectDragSource): Self = StObject.set(x, "dragSource", js.Any.fromFunction0(value))
    }
  }
  
  trait DragSourceSpec[Props, DragObject] extends StObject {
    
    /**
      * Required.
      * When the dragging starts, beginDrag is called. You must return a plain JavaScript object describing the
      * data being dragged. What you return is the only information available to the drop targets about the drag
      * source so it's important to pick the minimal data they need to know. You may be tempted to put a reference
      * to the component into it, but you should try very hard to avoid doing this because it couples the drag
      * sources and drop targets. It's a good idea to return something like { id: props.id } from this method.
      */
    def beginDrag(props: Props, monitor: DragSourceMonitor, component: js.Any): DragObject
    
    /**
      * Optional.
      * Use it to specify whether the dragging is currently allowed. If you want to always allow it, just omit this method.
      * Specifying it is handy if you'd like to disable dragging based on some predicate over props. Note: You may not call
      * monitor.canDrag() inside this method.
      */
    var canDrag: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DragSourceMonitor, Boolean]] = js.undefined
    
    /**
      * Optional.
      * When the dragging stops, endDrag is called. For every beginDrag call, a corresponding endDrag call is guaranteed.
      * You may call monitor.didDrop() to check whether or not the drop was handled by a compatible drop target. If it was handled,
      * and the drop target specified a drop result by returning a plain object from its drop() method, it will be available as
      * monitor.getDropResult(). This method is a good place to fire a Flux action. Note: If the component is unmounted while dragging,
      * component parameter is set to be null.
      */
    var endDrag: js.UndefOr[
        js.Function3[/* props */ Props, /* monitor */ DragSourceMonitor, /* component */ js.Any, Unit]
      ] = js.undefined
    
    /**
      * Optional.
      * By default, only the drag source that initiated the drag operation is considered to be dragging. You can
      * override this behavior by defining a custom isDragging method. It might return something like props.id === monitor.getItem().id.
      * Do this if the original component may be unmounted during the dragging and later “resurrected” with a different parent.
      * For example, when moving a card across the lists in a Kanban board, you want it to retain the dragged appearance—even though
      * technically, the component gets unmounted and a different one gets mounted every time you move it to another list.
      *
      * Note: You may not call monitor.isDragging() inside this method.
      */
    var isDragging: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DragSourceMonitor, Boolean]] = js.undefined
  }
  object DragSourceSpec {
    
    inline def apply[Props, DragObject](beginDrag: (Props, DragSourceMonitor, js.Any) => DragObject): DragSourceSpec[Props, DragObject] = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction3(beginDrag))
      __obj.asInstanceOf[DragSourceSpec[Props, DragObject]]
    }
    
    extension [Self <: DragSourceSpec[?, ?], Props, DragObject](x: Self & (DragSourceSpec[Props, DragObject])) {
      
      inline def setBeginDrag(value: (Props, DragSourceMonitor, js.Any) => DragObject): Self = StObject.set(x, "beginDrag", js.Any.fromFunction3(value))
      
      inline def setCanDrag(value: (/* props */ Props, /* monitor */ DragSourceMonitor) => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction2(value))
      
      inline def setCanDragUndefined: Self = StObject.set(x, "canDrag", js.undefined)
      
      inline def setEndDrag(value: (/* props */ Props, /* monitor */ DragSourceMonitor, /* component */ js.Any) => Unit): Self = StObject.set(x, "endDrag", js.Any.fromFunction3(value))
      
      inline def setEndDragUndefined: Self = StObject.set(x, "endDrag", js.undefined)
      
      inline def setIsDragging(value: (/* props */ Props, /* monitor */ DragSourceMonitor) => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction2(value))
      
      inline def setIsDraggingUndefined: Self = StObject.set(x, "isDragging", js.undefined)
    }
  }
  
  type DropTargetCollector[CollectedProps, TargetProps] = js.Function3[
    /* connect */ DropTargetConnector, 
    /* monitor */ DropTargetMonitor, 
    /* props */ TargetProps, 
    CollectedProps
  ]
  
  trait DropTargetConnector extends StObject {
    
    /**
      * Returns a function that must be used inside the component to assign the drop target role to a node.
      * By returning { connectDropTarget: connect.dropTarget() } from your collecting function, you can mark any React element
      * as the droppable node. To do that, replace any element with this.props.connectDropTarget(element) inside the render function.
      */
    def dropTarget(): ConnectDropTarget
  }
  object DropTargetConnector {
    
    inline def apply(dropTarget: () => ConnectDropTarget): DropTargetConnector = {
      val __obj = js.Dynamic.literal(dropTarget = js.Any.fromFunction0(dropTarget))
      __obj.asInstanceOf[DropTargetConnector]
    }
    
    extension [Self <: DropTargetConnector](x: Self) {
      
      inline def setDropTarget(value: () => ConnectDropTarget): Self = StObject.set(x, "dropTarget", js.Any.fromFunction0(value))
    }
  }
  
  trait DropTargetSpec[Props] extends StObject {
    
    /**
      * Optional. Use it to specify whether the drop target is able to accept the item. If you want to always allow it, just
      * omit this method. Specifying it is handy if you'd like to disable dropping based on some predicate over props or
      * monitor.getItem(). Note: You may not call monitor.canDrop() inside this method.
      */
    var canDrop: js.UndefOr[js.Function2[/* props */ Props, /* monitor */ DropTargetMonitor, Boolean]] = js.undefined
    
    /**
      * Optional.
      * Called when a compatible item is dropped on the target. You may either return undefined, or a plain object.
      * If you return an object, it is going to become the drop result and will be available to the drag source in its
      * endDrag method as monitor.getDropResult(). This is useful in case you want to perform different actions
      * depending on which target received the drop. If you have nested drop targets, you can test whether a nested
      * target has already handled drop by checking monitor.didDrop() and monitor.getDropResult(). Both this method and
      * the source's endDrag method are good places to fire Flux actions. This method will not be called if canDrop()
      * is defined and returns false.
      */
    var drop: js.UndefOr[
        js.Function3[/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any, js.Any]
      ] = js.undefined
    
    /**
      * Optional.
      * Called when an item is hovered over the component. You can check monitor.isOver({ shallow: true }) to test whether
      * the hover happens over just the current target, or over a nested one. Unlike drop(), this method will be called even
      * if canDrop() is defined and returns false. You can check monitor.canDrop() to test whether this is the case.
      */
    var hover: js.UndefOr[
        js.Function3[/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any, Unit]
      ] = js.undefined
  }
  object DropTargetSpec {
    
    inline def apply[Props](): DropTargetSpec[Props] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropTargetSpec[Props]]
    }
    
    extension [Self <: DropTargetSpec[?], Props](x: Self & DropTargetSpec[Props]) {
      
      inline def setCanDrop(value: (/* props */ Props, /* monitor */ DropTargetMonitor) => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
      
      inline def setCanDropUndefined: Self = StObject.set(x, "canDrop", js.undefined)
      
      inline def setDrop(value: (/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any) => js.Any): Self = StObject.set(x, "drop", js.Any.fromFunction3(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setHover(value: (/* props */ Props, /* monitor */ DropTargetMonitor, /* component */ js.Any) => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction3(value))
      
      inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    }
  }
  
  type GetProps[C] = js.Any
  
  type Matching[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typings.reactDnd.reactDndStrings.Matching & TopLevel[js.Any]
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  type Shared[InjectedProps, DecorationTargetProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Extract<keyof InjectedProps, keyof DecorationTargetProps> ]:? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : never}
    */ typings.reactDnd.reactDndStrings.Shared & TopLevel[js.Any]
}
