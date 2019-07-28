package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val message: String
  /**
    * (brief) reason the container is not yet running.
    */
  val reason: String
}

object ContainerStateWaiting {
  @scala.inline
  def apply(message: String, reason: String): ContainerStateWaiting = {
    val __obj = js.Dynamic.literal(message = message, reason = reason)
  
    __obj.asInstanceOf[ContainerStateWaiting]
  }
}

