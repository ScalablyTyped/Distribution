package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
    * Time of the last occurrence observed
    */
  val lastObservedTime: String
  /**
    * State of this Series: Ongoing or Finished Deprecated. Planned removal for 1.18
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

