package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DragLayer", JSImport.Namespace)
@js.native
object libCjsDragLayerMod extends js.Object {
  def default[Props, CollectedProps](collect: reactDashDndLib.libCjsInterfacesMod.DragLayerCollector[Props, CollectedProps]): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
  def default[Props, CollectedProps](
    collect: reactDashDndLib.libCjsInterfacesMod.DragLayerCollector[Props, CollectedProps],
    options: reactDashDndLib.libCjsInterfacesMod.DndOptions[Props]
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactDashDndLib.libCjsInterfacesMod.DndComponentClass[Props]
  ] = js.native
}

