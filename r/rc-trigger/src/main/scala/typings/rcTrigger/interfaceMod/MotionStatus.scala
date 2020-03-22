package typings.rcTrigger.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcTrigger.rcTriggerStrings.none
  - typings.rcTrigger.rcTriggerStrings.appear
  - typings.rcTrigger.rcTriggerStrings.enter
  - typings.rcTrigger.rcTriggerStrings.leave
*/
trait MotionStatus extends js.Object

object MotionStatus {
  @scala.inline
  def appear: typings.rcTrigger.rcTriggerStrings.appear = this.cast("appear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enter: typings.rcTrigger.rcTriggerStrings.enter = this.cast("enter")
  @scala.inline
  def leave: typings.rcTrigger.rcTriggerStrings.leave = this.cast("leave")
  @scala.inline
  def none: typings.rcTrigger.rcTriggerStrings.none = this.cast("none")
}

