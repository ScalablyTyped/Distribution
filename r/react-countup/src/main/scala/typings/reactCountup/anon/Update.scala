package typings.reactCountup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update extends js.Object {
  def pauseResume(): Unit
  def start(): Unit
  def update(): Unit
}

object Update {
  @scala.inline
  def apply(pauseResume: () => Unit, start: () => Unit, update: () => Unit): Update = {
    val __obj = js.Dynamic.literal(pauseResume = js.Any.fromFunction0(pauseResume), start = js.Any.fromFunction0(start), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Update]
  }
}

