package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/DragLayer", JSImport.Namespace)
@js.native
object libDecoratorsDragLayerMod extends js.Object {
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
}

