package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/DragSource", JSImport.Namespace)
@js.native
object libDecoratorsDragSourceMod extends js.Object {
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: dndDashCoreLib.libInterfacesMod.SourceType,
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, dndDashCoreLib.libInterfacesMod.SourceType],
    spec: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceSpec[RequiredProps, DragObject],
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragSourceCollector[CollectedProps, RequiredProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
}

