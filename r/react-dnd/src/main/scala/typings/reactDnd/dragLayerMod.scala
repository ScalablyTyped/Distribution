package typings.reactDnd

import typings.reactDnd.interfacesMod.DndComponentEnhancer
import typings.reactDnd.interfacesMod.DragLayerCollector
import typings.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragLayerMod {
  
  @JSImport("react-dnd/lib/decorators/DragLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps]): DndComponentEnhancer[CollectedProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("DragLayer")(collect.asInstanceOf[js.Any]).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DragLayer[RequiredProps, CollectedProps](collect: DragLayerCollector[RequiredProps, CollectedProps], options: DndOptions[RequiredProps]): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragLayer")(collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
}
