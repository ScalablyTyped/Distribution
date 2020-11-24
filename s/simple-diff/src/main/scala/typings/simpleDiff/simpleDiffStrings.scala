package typings.simpleDiff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleDiffStrings {
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @scala.inline
  def `add-item`: `add-item` = "add-item".asInstanceOf[`add-item`]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def `move-item`: `move-item` = "move-item".asInstanceOf[`move-item`]
  
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @scala.inline
  def `remove-item`: `remove-item` = "remove-item".asInstanceOf[`remove-item`]
  
  @js.native
  sealed trait add extends js.Object
  
  @js.native
  sealed trait `add-item` extends js.Object
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait `move-item` extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait `remove-item` extends js.Object
}
