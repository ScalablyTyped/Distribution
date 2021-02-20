package typings.reactDnd

import typings.dndCore.interfacesMod.SourceType
import typings.reactDnd.interfacesMod.DndComponentEnhancer
import typings.reactDnd.interfacesMod.DragSourceCollector
import typings.reactDnd.interfacesMod.DragSourceSpec
import typings.reactDnd.optionsMod.DndOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragSourceMod {
  
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: js.Function1[/* props */ RequiredProps, SourceType],
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
  @JSImport("react-dnd/lib/decorators/DragSource", "DragSource")
  @js.native
  def DragSource[RequiredProps, CollectedProps, DragObject](
    `type`: SourceType,
    spec: DragSourceSpec[RequiredProps, DragObject],
    collect: DragSourceCollector[CollectedProps, RequiredProps],
    options: DndOptions[RequiredProps]
  ): DndComponentEnhancer[CollectedProps] = js.native
}
