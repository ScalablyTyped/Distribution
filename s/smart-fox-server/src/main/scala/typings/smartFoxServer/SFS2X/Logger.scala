package typings.smartFoxServer.SFS2X

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  /**
    * Sets the current logging level.
    * @param {number} level The minimum logging level.
    */
  def setLevel(level: Double): Unit = js.native
}

object Logger {
  @scala.inline
  def apply(setLevel: Double => Unit): Logger = {
    val __obj = js.Dynamic.literal(setLevel = js.Any.fromFunction1(setLevel))
    __obj.asInstanceOf[Logger]
  }
  @scala.inline
  implicit class LoggerOps[Self <: Logger] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSetLevel(value: Double => Unit): Self = this.set("setLevel", js.Any.fromFunction1(value))
  }
  
}

