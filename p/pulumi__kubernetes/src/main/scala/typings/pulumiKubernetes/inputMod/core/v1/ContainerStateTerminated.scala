package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContainerStateTerminated is a terminated state of a container.
  */
@js.native
trait ContainerStateTerminated extends js.Object {
  /**
    * Container's ID in the format 'docker://<container_id>'
    */
  var containerID: js.UndefOr[Input[String]] = js.native
  /**
    * Exit status from the last termination of the container
    */
  var exitCode: Input[Double] = js.native
  /**
    * Time at which the container last terminated
    */
  var finishedAt: js.UndefOr[Input[String]] = js.native
  /**
    * Message regarding the last termination of the container
    */
  var message: js.UndefOr[Input[String]] = js.native
  /**
    * (brief) reason from the last termination of the container
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * Signal from the last termination of the container
    */
  var signal: js.UndefOr[Input[Double]] = js.native
  /**
    * Time at which previous execution of the container started
    */
  var startedAt: js.UndefOr[Input[String]] = js.native
}

object ContainerStateTerminated {
  @scala.inline
  def apply(exitCode: Input[Double]): ContainerStateTerminated = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateTerminated]
  }
  @scala.inline
  implicit class ContainerStateTerminatedOps[Self <: ContainerStateTerminated] (val x: Self) extends AnyVal {
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
    def setExitCode(value: Input[Double]): Self = this.set("exitCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerID(value: Input[String]): Self = this.set("containerID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerID: Self = this.set("containerID", js.undefined)
    @scala.inline
    def setFinishedAt(value: Input[String]): Self = this.set("finishedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishedAt: Self = this.set("finishedAt", js.undefined)
    @scala.inline
    def setMessage(value: Input[String]): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setReason(value: Input[String]): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    @scala.inline
    def setSignal(value: Input[Double]): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setStartedAt(value: Input[String]): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
  }
  
}

