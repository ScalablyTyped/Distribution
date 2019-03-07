package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object reactDashDndMod extends js.Object {
  val DragDropContextProvider: reactLib.reactMod.ReactNs.SFC[reactDashDndLib.libCjsDragDropContextMod.DragDropContextProviderProps[js.Any]] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, backendContext: js.Any): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(
    backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory,
    backendContext: js.Any,
    debugMode: scala.Boolean
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragLayer[Props, CollectedProps](collect: reactDashDndLib.libCjsInterfacesMod.DragLayerCollector[Props, CollectedProps]): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragLayer[Props, CollectedProps](
    collect: reactDashDndLib.libCjsInterfacesMod.DragLayerCollector[Props, CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libCjsInterfacesMod.TargetType,
    spec: reactDashDndLib.libCjsInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.TargetType],
    spec: reactDashDndLib.libCjsInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libCjsInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

