package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/DropTarget", JSImport.Namespace)
@js.native
object libDropTargetMod extends js.Object {
  def default[Props, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libInterfacesMod.DropTargetSpec[Props],
    collect: reactDashDndLib.libInterfacesMod.DropTargetCollector[CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

