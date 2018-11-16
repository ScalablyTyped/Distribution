package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ContainerState holds a possible state of container. Only one of its members may be specified.
         * If none of them is specified, the default one is ContainerStateWaiting.
         */

trait ContainerState extends js.Object {
  /**
               * Details about a running container
               */
  val running: ContainerStateRunning
  /**
               * Details about a terminated container
               */
  val terminated: ContainerStateTerminated
  /**
               * Details about a waiting container
               */
  val waiting: ContainerStateWaiting
}

