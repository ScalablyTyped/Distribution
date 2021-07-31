package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
trait ContainerStateWaiting extends StObject {
  
  /**
    * Message regarding why the container is not yet running.
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * (brief) reason the container is not yet running.
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
}
object ContainerStateWaiting {
  
  @scala.inline
  def apply(): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateWaiting]
  }
  
  @scala.inline
  implicit class ContainerStateWaitingMutableBuilder[Self <: ContainerStateWaiting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
