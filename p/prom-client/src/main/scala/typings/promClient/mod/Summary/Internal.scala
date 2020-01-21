package typings.promClient.mod.Summary

import typings.promClient.mod.labelValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Internal extends js.Object {
  /**
  		 * Observe value in summary
  		 * @param value The value to observe
  		 */
  def observe(value: Double): Unit
  /**
  		 * Start a timer where the value in seconds will observed
  		 * @param labels Object with label keys and values
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[/* labels */ js.UndefOr[labelValues], Unit]
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
}

