package typings
package promDashClientLib.promDashClientMod.HistogramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Internal extends js.Object {
  /**
  		 * Observe value
  		 * @param value The value to observe
  		 */
  def observe(value: scala.Double): scala.Unit
  /**
  		 * Start a timer where the value in seconds will observed
  		 * @param labels Object with label keys and values
  		 * @return Function to invoke when timer should be stopped
  		 */
  def startTimer(): js.Function1[
    /* labels */ js.UndefOr[promDashClientLib.promDashClientMod.labelValues], 
    scala.Unit
  ]
}

object Internal {
  @scala.inline
  def apply(
    observe: scala.Double => scala.Unit,
    startTimer: () => js.Function1[
      /* labels */ js.UndefOr[promDashClientLib.promDashClientMod.labelValues], 
      scala.Unit
    ]
  ): Internal = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction1(observe), startTimer = js.Any.fromFunction0(startTimer))
  
    __obj.asInstanceOf[Internal]
  }
}

