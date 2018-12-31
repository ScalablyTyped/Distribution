package typings
package atPulumiKubernetesLib.typesOutputMod.eventsNs.v1beta1Ns

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
  val count: scala.Double
  /**
    * Time when last Event from the series was seen before last heartbeat.
    */
  val lastObservedTime: java.lang.String
  /**
    * Information whether this series is ongoing or finished.
    */
  val state: java.lang.String
}

