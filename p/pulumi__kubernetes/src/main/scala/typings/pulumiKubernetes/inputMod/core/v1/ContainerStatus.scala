package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStatus contains details for the current status of this container.
  */
@js.native
trait ContainerStatus extends StObject {
  
  /**
    * Container's ID in the format 'docker://<container_id>'.
    */
  var containerID: js.UndefOr[Input[String]] = js.native
  
  /**
    * The image the container is running. More info: https://kubernetes.io/docs/concepts/containers/images
    */
  var image: Input[String] = js.native
  
  /**
    * ImageID of the container's image.
    */
  var imageID: Input[String] = js.native
  
  /**
    * Details about the container's last termination condition.
    */
  var lastState: js.UndefOr[Input[ContainerState]] = js.native
  
  /**
    * This must be a DNS_LABEL. Each container in a pod must have a unique name. Cannot be updated.
    */
  var name: Input[String] = js.native
  
  /**
    * Specifies whether the container has passed its readiness probe.
    */
  var ready: Input[Boolean] = js.native
  
  /**
    * The number of times the container has been restarted, currently based on the number of dead containers that have not yet been removed. Note that this is calculated from dead containers. But those containers are subject to garbage collection. This value will get capped at 5 by GC.
    */
  var restartCount: Input[Double] = js.native
  
  /**
    * Specifies whether the container has passed its startup probe. Initialized as false, becomes true after startupProbe is considered successful. Resets to false when the container is restarted, or if kubelet loses state temporarily. Is always true when no startupProbe is defined.
    */
  var started: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * Details about the container's current condition.
    */
  var state: js.UndefOr[Input[ContainerState]] = js.native
}
object ContainerStatus {
  
  @scala.inline
  def apply(
    image: Input[String],
    imageID: Input[String],
    name: Input[String],
    ready: Input[Boolean],
    restartCount: Input[Double]
  ): ContainerStatus = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], imageID = imageID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], restartCount = restartCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStatus]
  }
  
  @scala.inline
  implicit class ContainerStatusMutableBuilder[Self <: ContainerStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerID(value: Input[String]): Self = StObject.set(x, "containerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIDUndefined: Self = StObject.set(x, "containerID", js.undefined)
    
    @scala.inline
    def setImage(value: Input[String]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageID(value: Input[String]): Self = StObject.set(x, "imageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastState(value: Input[ContainerState]): Self = StObject.set(x, "lastState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateUndefined: Self = StObject.set(x, "lastState", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Input[Boolean]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestartCount(value: Input[Double]): Self = StObject.set(x, "restartCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStarted(value: Input[Boolean]): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    @scala.inline
    def setState(value: Input[ContainerState]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
