package typings.reactDnd

import typings.dndCore.interfacesMod.BackendFactory
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.SourceType
import typings.dndCore.interfacesMod.TargetType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.reactDnd.connectorsMod.ConnectDragPreview
import typings.reactDnd.connectorsMod.ConnectDragSource
import typings.reactDnd.connectorsMod.ConnectDropTarget
import typings.reactDnd.dndContextMod.DndContextType
import typings.reactDnd.dndProviderMod.DndProviderProps
import typings.reactDnd.dragPreviewImageMod.DragPreviewImageProps
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import typings.reactDnd.hooksApiMod.DropTargetHookSpec
import typings.reactDnd.interfacesMod.DndComponentEnhancer
import typings.reactDnd.interfacesMod.DragLayerCollector
import typings.reactDnd.interfacesMod.DragSourceCollector
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.interfacesMod.DropTargetCollector
import typings.reactDnd.interfacesMod.DropTargetSpec
import typings.reactDnd.monitorsMod.DragLayerMonitor
import typings.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-dnd", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  @JSImport("react-dnd", "DndProvider")
  @js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  
  @scala.inline
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("DragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragLayer")(collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  
  @JSImport("react-dnd", "DragPreviewImage")
  @js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  
  @scala.inline
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  
  @scala.inline
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  @scala.inline
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = ^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any]).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: BackendOptions, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  @scala.inline
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: Unit, options: Unit, debugMode: Boolean): DndContextType = (^.asInstanceOf[js.Dynamic].applyDynamic("createDndContext")(backend.asInstanceOf[js.Any], context.asInstanceOf[js.Any], options.asInstanceOf[js.Any], debugMode.asInstanceOf[js.Any])).asInstanceOf[DndContextType]
  
  @scala.inline
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrag")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview]]
  
  @scala.inline
  def useDragDropManager(): DragDropManager = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragDropManager")().asInstanceOf[DragDropManager]
  
  @scala.inline
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useDragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[CollectedProps]
  
  @scala.inline
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = ^.asInstanceOf[js.Dynamic].applyDynamic("useDrop")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CollectedProps, ConnectDropTarget]]
}
