package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
@js.native
trait ContainerStateTerminated extends js.Object {
  
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  var containerID: String = js.native
  
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Double = js.native
  
  /**
    * Time at which the container last terminated
    */
  var finishedAt: String = js.native
  
  /**
    * Message regarding the last termination of the container
    */
  var message: String = js.native
  
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: String = js.native
  
  /**
    * Signal from the last termination of the container
    */
  var signal: Double = js.native
  
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: String = js.native
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
  implicit class ContainerStateTerminatedOps[Self <: ContainerStateTerminated] (val x: Self) extends AnyVal {
    
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
    def setExitCode(value: Double): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishedAt(value: String): Self = this.set("finishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: Double): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedAt(value: String): Self = this.set("startedAt", value.asInstanceOf[js.Any])
  }
}
