package typings.reactTransitionGroup.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTransitionGroup.reactTransitionGroupStrings.entering
  - typings.reactTransitionGroup.reactTransitionGroupStrings.entered
  - typings.reactTransitionGroup.reactTransitionGroupStrings.exiting
  - typings.reactTransitionGroup.reactTransitionGroupStrings.exited
  - typings.reactTransitionGroup.reactTransitionGroupStrings.unmounted
*/
trait TransitionStatus extends js.Object

object TransitionStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def entered: typings.reactTransitionGroup.reactTransitionGroupStrings.entered = this.cast("entered")
  @scala.inline
  def entering: typings.reactTransitionGroup.reactTransitionGroupStrings.entering = this.cast("entering")
  @scala.inline
  def exited: typings.reactTransitionGroup.reactTransitionGroupStrings.exited = this.cast("exited")
  @scala.inline
  def exiting: typings.reactTransitionGroup.reactTransitionGroupStrings.exiting = this.cast("exiting")
  @scala.inline
  def unmounted: typings.reactTransitionGroup.reactTransitionGroupStrings.unmounted = this.cast("unmounted")
}

