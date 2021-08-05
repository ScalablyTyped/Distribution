package typings.reactDnd

import typings.dndCore.interfacesMod.SourceType
import typings.reactDnd.interfacesMod.DndComponentEnhancer
import typings.reactDnd.interfacesMod.DragSourceCollector
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceMod {
  
  @JSImport("react-dnd/lib/decorators/DragSource", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
  inline def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("DragSource")(`type`.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], collect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DndComponentEnhancer[CollectedProps]]
}
