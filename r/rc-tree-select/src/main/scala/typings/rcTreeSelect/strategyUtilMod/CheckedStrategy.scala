package typings.rcTreeSelect.strategyUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL
  - typings.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT
  - typings.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD
*/
trait CheckedStrategy extends js.Object

object CheckedStrategy {
  @scala.inline
  def SHOW_ALL: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_ALL = this.cast("SHOW_ALL")
  @scala.inline
  def SHOW_CHILD: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_CHILD = this.cast("SHOW_CHILD")
  @scala.inline
  def SHOW_PARENT: typings.rcTreeSelect.rcTreeSelectStrings.SHOW_PARENT = this.cast("SHOW_PARENT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

