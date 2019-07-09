package typings
package reactDashDndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators", JSImport.Namespace)
@js.native
object libDecoratorsMod extends js.Object {
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](
    collect: reactDashDndLib.libDecoratorsInterfacesMod.DragLayerCollector[RequiredProps, CollectedProps],
    options: reactDashDndLib.libInterfacesOptionsMod.DndOptions[RequiredProps]
  ): reactDashDndLib.libDecoratorsInterfacesMod.DndComponentEnhancer[CollectedProps] = js.native
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

