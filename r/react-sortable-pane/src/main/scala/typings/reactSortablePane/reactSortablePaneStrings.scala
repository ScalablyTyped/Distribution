package typings.reactSortablePane

import typings.reactSortablePane.mod.PaneDirection
import typings.reactSortablePane.mod.PaneMode
import typings.reactSortablePane.mod.PaneResizeDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSortablePaneStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with PaneMode
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with PaneDirection
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait remove
    extends StObject
       with PaneMode
  inline def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait vertical
    extends StObject
       with PaneDirection
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @js.native
  sealed trait x
    extends StObject
       with PaneResizeDirection
  inline def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait xy
    extends StObject
       with PaneResizeDirection
  inline def xy: xy = "xy".asInstanceOf[xy]
  
  @js.native
  sealed trait y
    extends StObject
       with PaneResizeDirection
  inline def y: y = "y".asInstanceOf[y]
}
