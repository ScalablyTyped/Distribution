package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ExecAction describes a "run in container" action.
  */
trait ExecAction extends js.Object {
  /**
    * Command is the command line to execute inside the container, the working directory for the
    * command  is root ('/') in the container's filesystem. The command is simply exec'd, it is
    * not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a
    * shell, you need to explicitly call out to that shell. Exit status of 0 is treated as
    * live/healthy and non-zero is unhealthy.
    */
  var command: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object ExecAction {
  @scala.inline
  def apply(command: Input[js.Array[Input[String]]] = null): ExecAction = {
    val __obj = js.Dynamic.literal()
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecAction]
  }
}

