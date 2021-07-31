package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
trait ContainerStateTerminated extends StObject {
  
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  var containerID: String
  
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Double
  
  /**
    * Time at which the container last terminated
    */
  var finishedAt: String
  
  /**
    * Message regarding the last termination of the container
    */
  var message: String
  
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: String
  
  /**
    * Signal from the last termination of the container
    */
  var signal: Double
  
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: String
}
object ContainerStateTerminated {
  
  @scala.inline
  def apply(
    containerID: String,
    exitCode: Double,
    finishedAt: String,
    message: String,
    reason: String,
    signal: Double,
    startedAt: String
  ): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(containerID = containerID.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], finishedAt = finishedAt.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
  
  @scala.inline
  implicit class ContainerStateTerminatedMutableBuilder[Self <: ContainerStateTerminated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerID(value: String): Self = StObject.set(x, "containerID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: String): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: Double): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
  }
}
