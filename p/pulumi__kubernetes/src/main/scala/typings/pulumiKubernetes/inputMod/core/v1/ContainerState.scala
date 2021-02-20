package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified. If none of them is specified, the default one is ContainerStateWaiting.
  */
@js.native
trait ContainerState extends StObject {
  
  /**
    * Details about a running container
    */
  var running: js.UndefOr[Input[ContainerStateRunning]] = js.native
  
  /**
    * Details about a terminated container
    */
  var terminated: js.UndefOr[Input[ContainerStateTerminated]] = js.native
  
  /**
    * Details about a waiting container
    */
  var waiting: js.UndefOr[Input[ContainerStateWaiting]] = js.native
}
object ContainerState {
  
  @scala.inline
  def apply(): ContainerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerState]
  }
  
  @scala.inline
  implicit class ContainerStateMutableBuilder[Self <: ContainerState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunning(value: Input[ContainerStateRunning]): Self = StObject.set(x, "running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningUndefined: Self = StObject.set(x, "running", js.undefined)
    
    @scala.inline
    def setTerminated(value: Input[ContainerStateTerminated]): Self = StObject.set(x, "terminated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminatedUndefined: Self = StObject.set(x, "terminated", js.undefined)
    
    @scala.inline
    def setWaiting(value: Input[ContainerStateWaiting]): Self = StObject.set(x, "waiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitingUndefined: Self = StObject.set(x, "waiting", js.undefined)
  }
}
