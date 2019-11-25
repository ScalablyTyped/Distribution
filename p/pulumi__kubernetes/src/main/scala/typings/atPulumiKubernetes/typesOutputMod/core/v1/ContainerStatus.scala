package typings.atPulumiKubernetes.typesOutputMod.core.v1

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
  val containerID: String
  /**
    * The image the container is running. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  val image: String
  /**
    * ImageID of the container's image.
    */
  val imageID: String
  /**
    * Details about the container's last termination condition.
    */
  val lastState: ContainerState
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be
    * updated.
    */
  val name: String
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  val ready: Boolean
  /**
    * The number of times the container has been restarted, currently based on the number of dead
    * containers that have not yet been removed. Note that this is calculated from dead
    * containers. But those containers are subject to garbage collection. This value will get
    * capped at 5 by GC.
    */
  val restartCount: Double
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes
    * true after startupProbe is considered successful. Resets to false when the container is
    * restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is
    * defined.
    */
  val started: Boolean
  /**
    * Details about the container's current condition.
    */
  val state: ContainerState
}

object ContainerStatus {
  @scala.inline
  def apply(
    containerID: String,
    image: String,
    imageID: String,
    lastState: ContainerState,
    name: String,
    ready: Boolean,
    restartCount: Double,
    started: Boolean,
    state: ContainerState
  ): ContainerStatus = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], lastState = lastState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContainerStatus]
  }
}

