package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  /**
    * Sets the current logging level.
    * @param {number} level The minimum logging level.
    */
  def setLevel(level: Double): Unit
}

object Logger {
  @scala.inline
  def apply(setLevel: Double => Unit): Logger = {
    val __obj = js.Dynamic.literal(setLevel = js.Any.fromFunction1(setLevel))
    __obj.asInstanceOf[Logger]
  }
}

