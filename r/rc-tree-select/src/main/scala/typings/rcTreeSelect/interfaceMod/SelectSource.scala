package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTreeSelect.rcTreeSelectStrings.option
  - typings.rcTreeSelect.rcTreeSelectStrings.selection
  - typings.rcTreeSelect.rcTreeSelectStrings.input
  - typings.rcTreeSelect.rcTreeSelectStrings.clear
*/
trait SelectSource extends js.Object

object SelectSource {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clear: typings.rcTreeSelect.rcTreeSelectStrings.clear = this.cast("clear")
  @scala.inline
  def input: typings.rcTreeSelect.rcTreeSelectStrings.input = this.cast("input")
  @scala.inline
  def option: typings.rcTreeSelect.rcTreeSelectStrings.option = this.cast("option")
  @scala.inline
  def selection: typings.rcTreeSelect.rcTreeSelectStrings.selection = this.cast("selection")
}

