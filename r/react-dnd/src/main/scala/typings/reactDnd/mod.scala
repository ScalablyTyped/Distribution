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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val DndContext: Context[DndContextType] = js.native
  val DndProvider: FC[DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: FC[DragPreviewImageProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: BackendContext, options: BackendOptions, debugMode: Boolean): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: BackendContext,
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](backend: BackendFactory, context: js.UndefOr[scala.Nothing], options: BackendOptions): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: BackendOptions,
    debugMode: Boolean
  ): DndContextType = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: BackendFactory,
    context: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    debugMode: Boolean
  ): DndContextType = js.native
  def useDrag[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DragSourceHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple3[CollectedProps, ConnectDragSource, ConnectDragPreview] = js.native
  def useDragDropManager(): DragDropManager = js.native
  def useDragLayer[CollectedProps](collect: js.Function1[/* monitor */ DragLayerMonitor, CollectedProps]): CollectedProps = js.native
  def useDrop[DragObject /* <: DragObjectWithType */, DropResult, CollectedProps](spec: DropTargetHookSpec[DragObject, DropResult, CollectedProps]): js.Tuple2[CollectedProps, ConnectDropTarget] = js.native
}

