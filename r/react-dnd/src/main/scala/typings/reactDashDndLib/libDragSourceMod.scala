package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/DragSource", JSImport.Namespace)
@js.native
object libDragSourceMod extends js.Object {
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

