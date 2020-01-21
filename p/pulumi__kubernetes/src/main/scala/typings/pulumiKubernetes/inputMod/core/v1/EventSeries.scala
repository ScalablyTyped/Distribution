package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening
  * continuously for some time.
  */
trait EventSeries extends js.Object {
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Time of the last occurrence observed
    */
  var lastObservedTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  var state: js.UndefOr[Input[String]] = js.undefined
}

object EventSeries {
  @scala.inline
  def apply(count: Input[Double] = null, lastObservedTime: Input[String] = null, state: Input[String] = null): EventSeries = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (lastObservedTime != null) __obj.updateDynamic("lastObservedTime")(lastObservedTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSeries]
  }
}

