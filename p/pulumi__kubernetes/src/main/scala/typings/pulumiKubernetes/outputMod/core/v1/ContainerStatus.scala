package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStatus contains details for the current status of this container.
  */
@js.native
trait ContainerStatus extends js.Object {
  
  /**
    * Container's ID in the format 'docker://<container_id>'.
    */
  var containerID: String = js.native
  
  /**
    * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: String = js.native
  
  /**
    * ImageID of the container's image.
    */
  var imageID: String = js.native
  
  /**
    * Details about the container's last termination condition.
    */
  var lastState: ContainerState = js.native
  
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
    */
  var name: String = js.native
  
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  var ready: Boolean = js.native
  
  /**
    * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
    */
  var restartCount: Double = js.native
  
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
    */
  var started: Boolean = js.native
  
  /**
    * Details about the container's current condition.
    */
  var state: ContainerState = js.native
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
  
  @scala.inline
  implicit class ContainerStatusOps[Self <: ContainerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerID(value: String): Self = this.set("containerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageID(value: String): Self = this.set("imageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastState(value: ContainerState): Self = this.set("lastState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartCount(value: Double): Self = this.set("restartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Boolean): Self = this.set("started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: ContainerState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
