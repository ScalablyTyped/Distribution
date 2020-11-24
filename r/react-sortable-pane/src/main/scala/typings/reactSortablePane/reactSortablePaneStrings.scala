package typings.reactSortablePane

import typings.reactSortablePane.mod.PaneDirection
import typings.reactSortablePane.mod.PaneMode
import typings.reactSortablePane.mod.PaneResizeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactSortablePaneStrings {
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
  
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @scala.inline
  def xy: xy = "xy".asInstanceOf[xy]
  
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait add extends PaneMode
  
  @js.native
  sealed trait horizontal extends PaneDirection
  
  @js.native
  sealed trait remove extends PaneMode
  
  @js.native
  sealed trait vertical extends PaneDirection
  
  @js.native
  sealed trait x extends PaneResizeDirection
  
  @js.native
  sealed trait xy extends PaneResizeDirection
  
  @js.native
  sealed trait y extends PaneResizeDirection
}
