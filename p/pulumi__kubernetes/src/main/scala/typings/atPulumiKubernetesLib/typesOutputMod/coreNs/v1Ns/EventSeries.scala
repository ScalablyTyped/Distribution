package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
               * Time of the last occurrence observed
               */
  val lastObservedTime: java.lang.String
  /**
               * State of this Series: Ongoing or Finished
               */
  val state: java.lang.String
}

