package typings.pulumiKubernetes.inputMod.events.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSeries contain information on series of events, i.e. thing that was/is happening continuously for some time.
  */
@js.native
trait EventSeries extends js.Object {
  
  /**
    * count is the number of occurrences in this series up to the last heartbeat time.
    */
  var count: Input[Double] = js.native
  
  /**
    * lastObservedTime is the time when last Event from the series was seen before last heartbeat.
    */
  var lastObservedTime: Input[String] = js.native
  
  /**
    * Information whether this series is ongoing or finished. Deprecated. Planned removal for 1.18
    */
  var state: js.UndefOr[Input[String]] = js.native
}
object EventSeries {
  
  @scala.inline
  def apply(count: Input[Double], lastObservedTime: Input[String]): EventSeries = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lastObservedTime = lastObservedTime.asInstanceOf[js.Any])
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
    def setLastObservedTime(value: Input[String]): Self = this.set("lastObservedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
