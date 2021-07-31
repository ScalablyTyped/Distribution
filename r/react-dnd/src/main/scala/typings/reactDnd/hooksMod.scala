package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import typings.reactDnd.hooksApiMod.DropTargetHookSpec
import typings.reactDnd.monitorsMod.DragLayerMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-dnd/lib/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  
  @scala.inline
  def useDragDropManager(): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragDropManager")().asInstanceOf[DragDropManager]
  
  @scala.inline
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
  
  @scala.inline
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
