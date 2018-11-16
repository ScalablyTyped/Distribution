package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ContainerStateWaiting is a waiting state of a container.
         */

trait ContainerStateWaiting extends js.Object {
  /**
               * Message regarding why the container is not yet running.
               */
  val message: java.lang.String
  /**
               * (brief) reason the container is not yet running.
               */
  val reason: java.lang.String
}

