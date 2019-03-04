package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd", JSImport.Namespace)
@js.native
object reactDashDndMod extends js.Object {
  val DragDropContextProvider: reactLib.reactMod.ReactNs.SFC[reactDashDndLib.libDragDropContextMod.DragDropContextProviderProps[js.Any]] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory, backendContext: js.Any): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(
    backendFactory: dndDashCoreLib.libInterfacesMod.BackendFactory,
    backendContext: js.Any,
    debugMode: scala.Boolean
  ): js.Function1[
    /* DecoratedComponent */ (reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_], 
    ((reactLib.reactMod.ReactNs.ComponentClass[_, _]) | reactLib.reactMod.ReactNs.StatelessComponent[_]) with reactDashDndLib.libInterfacesMod.ContextComponent[_]
  ] = js.native
  def DragLayer[Props, CollectedProps](collect: reactDashDndLib.libInterfacesMod.DragLayerCollector[Props, CollectedProps]): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragLayer[Props, CollectedProps](
    collect: reactDashDndLib.libInterfacesMod.DragLayerCollector[Props, CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DragSource[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def DropTarget[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

