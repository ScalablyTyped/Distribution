package typings.atPulumiKubernetes.typesOutputMod.events.v1beta1

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
  val count: Double
  /**
    * Time when last Event from the series was seen before last heartbeat.
    */
  val lastObservedTime: String
  /**
    * Information whether this series is ongoing or finished. Deprecated. Planned removal for
    * 1.18
    */
  val state: String
}

object EventSeries {
  @scala.inline
  def apply(count: Double, lastObservedTime: String, state: String): EventSeries = {
    val __obj = js.Dynamic.literal(count = count, lastObservedTime = lastObservedTime, state = state)
  
    __obj.asInstanceOf[EventSeries]
  }
}

