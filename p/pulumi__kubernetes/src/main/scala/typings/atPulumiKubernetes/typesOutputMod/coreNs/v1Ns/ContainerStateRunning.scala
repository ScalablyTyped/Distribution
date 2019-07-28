package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateRunning is a running state of a container.
  */
trait ContainerStateRunning extends js.Object {
  /**
    * Time at which the container was last (re-)started
    */
  val startedAt: String
}

object ContainerStateRunning {
  @scala.inline
  def apply(startedAt: String): ContainerStateRunning = {
    val __obj = js.Dynamic.literal(startedAt = startedAt)
  
    __obj.asInstanceOf[ContainerStateRunning]
  }
}

