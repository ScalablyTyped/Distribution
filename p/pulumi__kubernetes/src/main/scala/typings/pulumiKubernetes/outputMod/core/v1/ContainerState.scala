package typings.pulumiKubernetes.outputMod.core.v1

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
  var running: ContainerStateRunning
  
  /**
    * Details about a terminated container
    */
  var terminated: ContainerStateTerminated
  
  /**
    * Details about a waiting container
    */
  var waiting: ContainerStateWaiting
}
object ContainerState {
  
  inline def apply(
    running: ContainerStateRunning,
    terminated: ContainerStateTerminated,
    waiting: ContainerStateWaiting
  ): ContainerState = {
    val __obj = js.Dynamic.literal(running = running.asInstanceOf[js.Any], terminated = terminated.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
  
  extension [Self <: ContainerState](x: Self) {
    
    inline def setRunning(value: ContainerStateRunning): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    inline def setTerminated(value: ContainerStateTerminated): Self = StObject.set(x, "terminated", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: ContainerStateWaiting): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
  }
}
