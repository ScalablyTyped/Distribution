package typings.promClient.mod.Histogram

import typings.promClient.mod.labelValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Internal extends js.Object {
  /**
  		 * Observe value
  		 * @param value The value to observe
  		 */
  def observe(value: Double): Unit = js.native
  /**
  		 * Start a timer where the value in seconds will observed
  		 * @param labels Object with label keys and values
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit] = js.native
}

object Internal {
  @scala.inline
  def apply(
    observe: Double => Unit,
    startTimer: () => js.Function1[/* labels */ js.UndefOr[labelValues], Unit]
  ): Internal = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction1(observe), startTimer = js.Any.fromFunction0(startTimer))
    __obj.asInstanceOf[Internal]
  }
  @scala.inline
  implicit class InternalOps[Self <: Internal] (val x: Self) extends AnyVal {
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
    def setObserve(value: Double => Unit): Self = this.set("observe", js.Any.fromFunction1(value))
    @scala.inline
    def setStartTimer(value: () => js.Function1[/* labels */ js.UndefOr[labelValues], Unit]): Self = this.set("startTimer", js.Any.fromFunction0(value))
  }
  
}

