package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.idle
  - typings.std.stdStrings.running
  - typings.std.stdStrings.paused
  - typings.std.stdStrings.finished
*/
trait AnimationPlayState extends js.Object

object AnimationPlayState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def finished: typings.std.stdStrings.finished = this.cast("finished")
  @scala.inline
  def idle: typings.std.stdStrings.idle = this.cast("idle")
  @scala.inline
  def paused: typings.std.stdStrings.paused = this.cast("paused")
  @scala.inline
  def running: typings.std.stdStrings.running = this.cast("running")
}

