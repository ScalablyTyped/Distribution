package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/DragLayer", JSImport.Namespace)
@js.native
object libDragLayerMod extends js.Object {
  def default[Props, CollectedProps](collect: reactDashDndLib.libInterfacesMod.DragLayerCollector[Props, CollectedProps]): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    collect: reactDashDndLib.libInterfacesMod.DragLayerCollector[Props, CollectedProps],
    options: reactDashDndLib.libInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

