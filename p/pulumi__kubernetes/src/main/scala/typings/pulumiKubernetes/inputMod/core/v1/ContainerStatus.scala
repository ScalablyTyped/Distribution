package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var containerID: js.UndefOr[Input[String]] = js.undefined
  /**
    * The image the container is running. More info:
    * https://kubernetes.io/docs/concepts/containers/images
    */
  var image: Input[String]
  /**
    * ImageID of the container's image.
    */
  var imageID: Input[String]
  /**
    * Details about the container's last termination condition.
    */
  var lastState: js.UndefOr[Input[ContainerState]] = js.undefined
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be
    * updated.
    */
  var name: Input[String]
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  var ready: Input[Boolean]
  /**
    * The number of times the container has been restarted, currently based on the number of dead
    * containers that have not yet been removed. Note that this is calculated from dead
    * containers. But those containers are subject to garbage collection. This value will get
    * capped at 5 by GC.
    */
  var restartCount: Input[Double]
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes
    * true after startupProbe is considered successful. Resets to false when the container is
    * restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is
    * defined.
    */
  var started: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Details about the container's current condition.
    */
  var state: js.UndefOr[Input[ContainerState]] = js.undefined
}

object ContainerStatus {
  @scala.inline
  def apply(
    image: Input[String],
    imageID: Input[String],
    name: Input[String],
    ready: Input[Boolean],
    restartCount: Input[Double],
    containerID: Input[String] = null,
    lastState: Input[ContainerState] = null,
    started: Input[Boolean] = null,
    state: Input[ContainerState] = null
  ): ContainerStatus = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any])
    if (containerID != null) __obj.updateDynamic("containerID")(containerID.asInstanceOf[js.Any])
    if (lastState != null) __obj.updateDynamic("lastState")(lastState.asInstanceOf[js.Any])
    if (started != null) __obj.updateDynamic("started")(started.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStatus]
  }
}

