package typings.rcDashMenu.esInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Follow Motion definition is copied from `rc-trigger@latest`.
  * These code can be removed when `rc-trigger` updated.
  */
/* Rewritten from type alias, can be one of: 
  - typings.rcDashMenu.rcDashMenuStrings.none
  - typings.rcDashMenu.rcDashMenuStrings.appear
  - typings.rcDashMenu.rcDashMenuStrings.enter
  - typings.rcDashMenu.rcDashMenuStrings.leave
*/
trait MotionStatus extends js.Object

object MotionStatus {
  @scala.inline
  def appear: typings.rcDashMenu.rcDashMenuStrings.appear = this.cast("appear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enter: typings.rcDashMenu.rcDashMenuStrings.enter = this.cast("enter")
  @scala.inline
  def leave: typings.rcDashMenu.rcDashMenuStrings.leave = this.cast("leave")
  @scala.inline
  def none: typings.rcDashMenu.rcDashMenuStrings.none = this.cast("none")
}

