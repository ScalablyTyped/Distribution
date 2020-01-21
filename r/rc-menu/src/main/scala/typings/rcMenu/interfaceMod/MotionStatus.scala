package typings.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Follow Motion definition is copied from `rc-trigger@latest`.
  * These code can be removed when `rc-trigger` updated.
  */
/* Rewritten from type alias, can be one of: 
  - typings.rcMenu.rcMenuStrings.none
  - typings.rcMenu.rcMenuStrings.appear
  - typings.rcMenu.rcMenuStrings.enter
  - typings.rcMenu.rcMenuStrings.leave
*/
trait MotionStatus extends js.Object

object MotionStatus {
  @scala.inline
  def appear: typings.rcMenu.rcMenuStrings.appear = this.cast("appear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enter: typings.rcMenu.rcMenuStrings.enter = this.cast("enter")
  @scala.inline
  def leave: typings.rcMenu.rcMenuStrings.leave = this.cast("leave")
  @scala.inline
  def none: typings.rcMenu.rcMenuStrings.none = this.cast("none")
}

