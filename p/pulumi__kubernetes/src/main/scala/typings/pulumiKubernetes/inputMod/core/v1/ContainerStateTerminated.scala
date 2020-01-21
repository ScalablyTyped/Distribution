package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
trait ContainerStateTerminated extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  var containerID: js.UndefOr[Input[String]] = js.undefined
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Input[Double]
  /**
    * Time at which the container last terminated
    */
  var finishedAt: js.UndefOr[Input[String]] = js.undefined
  /**
    * Message regarding the last termination of the container
    */
  var message: js.UndefOr[Input[String]] = js.undefined
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: js.UndefOr[Input[String]] = js.undefined
  /**
    * Signal from the last termination of the container
    */
  var signal: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: js.UndefOr[Input[String]] = js.undefined
}

object ContainerStateTerminated {
  @scala.inline
  def apply(
    exitCode: Input[Double],
    containerID: Input[String] = null,
    finishedAt: Input[String] = null,
    message: Input[String] = null,
    reason: Input[String] = null,
    signal: Input[Double] = null,
    startedAt: Input[String] = null
  ): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    if (containerID != null) __obj.updateDynamic("containerID")(containerID.asInstanceOf[js.Any])
    if (finishedAt != null) __obj.updateDynamic("finishedAt")(finishedAt.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
}

