package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDnd.monitorsMod.DragLayerMonitor
import typings.reactDnd.typesConnectorsMod.ConnectDragPreview
import typings.reactDnd.typesConnectorsMod.ConnectDragSource
import typings.reactDnd.typesConnectorsMod.ConnectDropTarget
import typings.reactDnd.typesMod.DragSourceHookSpec
import typings.reactDnd.typesMod.DropTargetHookSpec
import typings.reactDnd.typesMod.FactoryOrInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-dnd/dist/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useDrag[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  inline def useDrag[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DragSourceHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  
  inline def useDragDropManager(): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragDropManager")().asInstanceOf[DragDropManager]
  
  inline def useDragLayer[CollectedProps, DragObject](collect: js.Function1[/* monitor */ DragLayerMonitor[DragObject], CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
  
  inline def useDrop[DragObject, DropResult, CollectedProps](specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
  inline def useDrop[DragObject, DropResult, CollectedProps](
    specArg: FactoryOrInstance[DropTargetHookSpec[DragObject, DropResult, CollectedProps]],
    deps: js.Array[Any]
  ): js.Tuple2[CollectedProps, ConnectDropTarget] = (^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(specArg.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
