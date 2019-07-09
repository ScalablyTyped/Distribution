package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val DndContext: reactLib.reactMod.Context[reactDashDndLib.libCommonDndContextMod.DndContext] = js.native
  val DndProvider: reactLib.reactMod.FC[reactDashDndLib.libCommonDndProviderMod.DndProviderProps[js.Any, js.Any]] = js.native
  val DragPreviewImage: reactLib.reactMod.FC[reactDashDndLib.libCommonDragPreviewImageMod.DragPreviewImageProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def createDndContext[BackendContext, BackendOptions](backend: dndDashCoreLib.libInterfacesMod.BackendFactory): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](backend: dndDashCoreLib.libInterfacesMod.BackendFactory, context: BackendContext): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory,
    context: BackendContext,
    options: BackendOptions
  ): reactDashDndLib.Anon_DragDropManager = js.native
  def createDndContext[BackendContext, BackendOptions](
    backend: dndDashCoreLib.libInterfacesMod.BackendFactory,
    context: BackendContext,
    options: BackendOptions,
    debugMode: scala.Boolean
  ): reactDashDndLib.Anon_DragDropManager = js.native
  def useDrag[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DragSourceHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple3[
    CollectedProps, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragSource, 
    reactDashDndLib.libInterfacesConnectorsMod.ConnectDragPreview
  ] = js.native
  def useDragLayer[CollectedProps](
    collect: js.Function1[
      /* monitor */ reactDashDndLib.libInterfacesMonitorsMod.DragLayerMonitor, 
      CollectedProps
    ]
  ): CollectedProps = js.native
  def useDrop[DragObject /* <: reactDashDndLib.libInterfacesHooksApiMod.DragObjectWithType */, DropResult, CollectedProps](
    spec: reactDashDndLib.libInterfacesHooksApiMod.DropTargetHookSpec[DragObject, DropResult, CollectedProps]
  ): js.Tuple2[CollectedProps, reactDashDndLib.libInterfacesConnectorsMod.ConnectDropTarget] = js.native
}

