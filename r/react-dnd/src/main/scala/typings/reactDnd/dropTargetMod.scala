package typings.reactDnd

import typings.dndCore.interfacesMod.TargetType
import typings.reactDnd.interfacesMod.DndComponentEnhancer
import typings.reactDnd.interfacesMod.DropTargetCollector
import typings.reactDnd.interfacesMod.DropTargetSpec
import typings.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropTargetMod {
  
  @JSImport("react-dnd/lib/decorators/DropTarget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DropTarget[RequiredProps, CollectedProps](
    `type`: js.Function1[/* props */ RequiredProps, TargetType],
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DropTarget[RequiredProps, CollectedProps](
    `type`: TargetType,
    spec: DropTargetSpec[RequiredProps],
    collect: DropTargetCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DropTarget")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
}
