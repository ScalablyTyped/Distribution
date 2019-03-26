package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object reactDashDndMod extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(Provider) */ val DragDropContextConsumer: reactLib.reactMod.ReactNs.ExoticComponent[
    reactLib.reactMod.ReactNs.ConsumerProps[reactDashDndLib.libCjsDragDropContextMod.DragDropContext[js.Any]]
  ] = js.native
  val DragDropContextProvider: reactLib.reactMod.ReactNs.FC[reactDashDndLib.libCjsDragDropContextMod.DragDropContextProviderProps[js.Any]] = js.native
  val DragPreviewImage: reactLib.reactMod.ReactNs.FC[reactDashDndLib.libCjsDragPreviewImageMod.DragPreviewImageProps] = js.native
  val __EXPERIMENTAL_DND_HOOKS_THAT_MAY_CHANGE_AND_BREAK_MY_BUILD__ : reactDashDndLib.Anon_UseDrag = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, backendContext: js.Any): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(
    backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory,
    backendContext: js.Any,
    debugMode: scala.Boolean
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragLayerCollector[RequiredProps, CollectedProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragLayerCollector[RequiredProps, CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentEnhancer[CollectedProps] = js.native
}

