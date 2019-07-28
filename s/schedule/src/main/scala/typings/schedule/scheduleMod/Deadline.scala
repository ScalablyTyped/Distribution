package typings.schedule.scheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deadline extends js.Object {
  var didTimeout: Boolean
  def timeRemaining(): Double
}

object Deadline {
  @scala.inline
  def apply(didTimeout: Boolean, timeRemaining: () => Double): Deadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout, timeRemaining = js.Any.fromFunction0(timeRemaining))
  
    __obj.asInstanceOf[Deadline]
  }
}

