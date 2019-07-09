package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/DropTarget", JSImport.Namespace)
@js.native
object libDecoratorsDropTargetMod extends js.Object {
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: dndDashCoreLib.libInterfacesMod.TargetType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.TargetType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetSpec[RequiredProps],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DropTargetCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
}

