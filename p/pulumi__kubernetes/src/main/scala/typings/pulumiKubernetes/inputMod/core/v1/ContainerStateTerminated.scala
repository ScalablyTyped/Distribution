package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var containerID: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Input[Double]
  
  /**
    * Time at which the container last terminated
    */
  var finishedAt: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Message regarding the last termination of the container
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Signal from the last termination of the container
    */
  var signal: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: js.UndefOr[Input[String]] = js.undefined
}
object ContainerStateTerminated {
  
  inline def apply(exitCode: Input[Double]): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
  
  extension [Self <: ContainerStateTerminated](x: Self) {
    
    inline def setContainerID(value: Input[String]): Self = StObject.set(x, "containerID", value.asInstanceOf[js.Any])
    
    inline def setContainerIDUndefined: Self = StObject.set(x, "containerID", js.undefined)
    
    inline def setExitCode(value: Input[Double]): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setFinishedAt(value: Input[String]): Self = StObject.set(x, "finishedAt", value.asInstanceOf[js.Any])
    
    inline def setFinishedAtUndefined: Self = StObject.set(x, "finishedAt", js.undefined)
    
    inline def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSignal(value: Input[Double]): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStartedAt(value: Input[String]): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
  }
}
