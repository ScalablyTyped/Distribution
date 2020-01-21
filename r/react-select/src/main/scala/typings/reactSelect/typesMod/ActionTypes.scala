package typings.reactSelect.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSelect.reactSelectStrings.`select-option`
  - typings.reactSelect.reactSelectStrings.`deselect-option`
  - typings.reactSelect.reactSelectStrings.`remove-value`
  - typings.reactSelect.reactSelectStrings.`pop-value`
  - typings.reactSelect.reactSelectStrings.`set-value`
  - typings.reactSelect.reactSelectStrings.clear
  - typings.reactSelect.reactSelectStrings.`create-option`
*/
trait ActionTypes extends js.Object

object ActionTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typings.reactSelect.reactSelectStrings.clear = this.cast("clear")
  @scala.inline
  def `create-option`: typings.reactSelect.reactSelectStrings.`create-option` = this.cast("create-option")
  @scala.inline
  def `deselect-option`: typings.reactSelect.reactSelectStrings.`deselect-option` = this.cast("deselect-option")
  @scala.inline
  def `pop-value`: typings.reactSelect.reactSelectStrings.`pop-value` = this.cast("pop-value")
  @scala.inline
  def `remove-value`: typings.reactSelect.reactSelectStrings.`remove-value` = this.cast("remove-value")
  @scala.inline
  def `select-option`: typings.reactSelect.reactSelectStrings.`select-option` = this.cast("select-option")
  @scala.inline
  def `set-value`: typings.reactSelect.reactSelectStrings.`set-value` = this.cast("set-value")
}

