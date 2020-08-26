package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
  */
@js.native
trait EventSeries extends js.Object {
  /**
    * Number of occurrences in this series up to the last heartbeat time
    */
  var count: js.UndefOr[Input[Double]] = js.native
  /**
    * Time of the last occurrence observed
    */
  var lastObservedTime: js.UndefOr[Input[String]] = js.native
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
    */
  var state: js.UndefOr[Input[String]] = js.native
}

object EventSeries {
  @scala.inline
  def apply(): EventSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSeries]
  }
  @scala.inline
  implicit class EventSeriesOps[Self <: EventSeries] (val x: Self) extends AnyVal {
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
    def setCount(value: Input[Double]): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setLastObservedTime(value: Input[String]): Self = this.set("lastObservedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastObservedTime: Self = this.set("lastObservedTime", js.undefined)
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

