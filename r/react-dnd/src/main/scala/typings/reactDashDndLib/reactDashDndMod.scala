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
  val __EXPERIMENTAL_DND_HOOKS_THAT_MAY_CHANGE_AND_BREAK_MY_BUILD__ : reactDashDndLib.Anon_CollectDragPreview = js.native
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
  def DragLayer[Props, CollectedProps](collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragLayerCollector[Props, CollectedProps]): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DragLayer[Props, CollectedProps](
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragLayerCollector[Props, CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesClassApiMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesOptionsMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesClassApiMod.DndComponentClass[Props]
  ] = js.native
}

