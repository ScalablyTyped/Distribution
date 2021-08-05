package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
  */
trait ContainerState extends StObject {
  
  /**
    * Details about a running container
    */
  var running: js.UndefOr[Input[ContainerStateRunning]] = js.undefined
  
  /**
    * Details about a terminated container
    */
  var terminated: js.UndefOr[Input[ContainerStateTerminated]] = js.undefined
  
  /**
    * Details about a waiting container
    */
  var waiting: js.UndefOr[Input[ContainerStateWaiting]] = js.undefined
}
object ContainerState {
  
  inline def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  extension [Self <: ContainerState](x: Self) {
    
    inline def setRunning(value: Input[ContainerStateRunning]): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    inline def setTerminated(value: Input[ContainerStateTerminated]): Self = StObject.set(x, "terminated", value.asInstanceOf[js.Any])
    
    inline def setTerminatedUndefined: Self = StObject.set(x, "terminated", js.undefined)
    
    inline def setWaiting(value: Input[ContainerStateWaiting]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    
    inline def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
  }
}
