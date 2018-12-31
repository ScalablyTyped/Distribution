package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EventSource contains information for an event.
  */
trait EventSource extends js.Object {
  /**
    * Component from which the event is generated.
    */
  val component: java.lang.String
  /**
    * Node name on which the event is generated.
    */
  val host: java.lang.String
}

