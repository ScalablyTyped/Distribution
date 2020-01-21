package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerState holds a possible state of container. Only one of its members may be specified.
  * If none of them is specified, the default one is ContainerStateWaiting.
  */
trait ContainerState extends js.Object {
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
  @scala.inline
  def apply(
    running: Input[ContainerStateRunning] = null,
    terminated: Input[ContainerStateTerminated] = null,
    waiting: Input[ContainerStateWaiting] = null
  ): ContainerState = {
    val __obj = js.Dynamic.literal()
    if (running != null) __obj.updateDynamic("running")(running.asInstanceOf[js.Any])
    if (terminated != null) __obj.updateDynamic("terminated")(terminated.asInstanceOf[js.Any])
    if (waiting != null) __obj.updateDynamic("waiting")(waiting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerState]
  }
}

