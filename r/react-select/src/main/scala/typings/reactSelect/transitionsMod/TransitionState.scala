package typings.reactSelect.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactSelect.reactSelectStrings.exiting
  - typings.reactSelect.reactSelectStrings.exited
*/
trait TransitionState extends js.Object

object TransitionState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exited: typings.reactSelect.reactSelectStrings.exited = this.cast("exited")
  @scala.inline
  def exiting: typings.reactSelect.reactSelectStrings.exiting = this.cast("exiting")
}

