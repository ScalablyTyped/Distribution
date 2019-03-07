package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DragSource", JSImport.Namespace)
@js.native
object libCjsDragSourceMod extends js.Object {
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libCjsInterfacesMod.SourceType,
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ Props, dndDashCoreLib.libCjsInterfacesMod.SourceType],
    spec: reactDashDndLib.libCjsInterfacesMod.DragSourceSpec[Props, DragObject],
    collect: reactDashDndLib.libCjsInterfacesMod.DragSourceCollector[CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

