package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
trait ContainerStateWaiting extends js.Object {
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
  def apply(message: Input[String] = null, reason: Input[String] = null): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateWaiting]
  }
}

