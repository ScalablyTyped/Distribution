package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
@js.native
trait ContainerStateWaiting extends js.Object {
  
  /**
    * Message regarding why the container is not yet running.
    */
  var message: js.UndefOr[Input[String]] = js.native
  
  /**
    * (brief) reason the container is not yet running.
    */
  var reason: js.UndefOr[Input[String]] = js.native
}
object ContainerStateWaiting {
  
  @scala.inline
  def apply(): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerStateWaiting]
  }
  
  @scala.inline
  implicit class ContainerStateWaitingOps[Self <: ContainerStateWaiting] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
