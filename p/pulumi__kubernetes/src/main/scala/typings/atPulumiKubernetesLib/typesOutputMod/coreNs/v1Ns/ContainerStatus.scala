package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * ContainerStatus contains details for the current status of this container.
         */

trait ContainerStatus extends js.Object {
  /**
               * Container's ID in the format 'docker://<container_id>'.
               */
  val containerID: java.lang.String
  /**
               * The image the container is running. More info:
               * https://kubernetes.io/docs/concepts/containers/images
               */
  val image: java.lang.String
  /**
               * ImageID of the container's image.
               */
  val imageID: java.lang.String
  /**
               * Details about the container's last termination condition.
               */
  val lastState: ContainerState
  /**
               * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be
               * updated.
               */
  val name: java.lang.String
  /**
               * Specifies whether the container has passed its readiness probe.
               */
  val ready: scala.Boolean
  /**
               * The number of times the container has been restarted, currently based on the number of dead
               * containers that have not yet been removed. Note that this is calculated from dead
               * containers. But those containers are subject to garbage collection. This value will get
               * capped at 5 by GC.
               */
  val restartCount: scala.Double
  /**
               * Details about the container's current condition.
               */
  val state: ContainerState
}

