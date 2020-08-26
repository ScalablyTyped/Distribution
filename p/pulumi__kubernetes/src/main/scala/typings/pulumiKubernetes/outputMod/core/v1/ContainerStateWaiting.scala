package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
@js.native
trait ContainerStateWaiting extends js.Object {
  /**
    * Message regarding why the container is not yet running.
    */
  var message: String = js.native
  /**
    * (brief) reason the container is not yet running.
    */
  var reason: String = js.native
}

object ContainerStateWaiting {
  @scala.inline
  def apply(message: String, reason: String): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

