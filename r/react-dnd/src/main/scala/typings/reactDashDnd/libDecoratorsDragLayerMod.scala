package typings.reactDashDnd

import typings.reactDashDnd.libDecoratorsInterfacesMod.DndComponentEnhancer
import typings.reactDashDnd.libDecoratorsInterfacesMod.DragLayerCollector
import typings.reactDashDnd.libInterfacesOptionsMod.DndOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/decorators/DragLayer", JSImport.Namespace)
@js.native
object libDecoratorsDragLayerMod extends js.Object {
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = js.native
  def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = js.native
}

