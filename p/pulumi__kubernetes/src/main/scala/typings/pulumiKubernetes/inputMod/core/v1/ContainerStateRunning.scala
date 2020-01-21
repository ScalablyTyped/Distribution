package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var startedAt: js.UndefOr[Input[String]] = js.undefined
}

object ContainerStateRunning {
  @scala.inline
  def apply(startedAt: Input[String] = null): ContainerStateRunning = {
    val __obj = js.Dynamic.literal()
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateRunning]
  }
}

