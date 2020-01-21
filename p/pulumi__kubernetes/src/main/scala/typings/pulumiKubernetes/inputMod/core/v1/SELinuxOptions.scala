package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SELinuxOptions are the labels to be applied to the container
  */
trait SELinuxOptions extends js.Object {
  /**
    * Level is SELinux level label that applies to the container.
    */
  var level: js.UndefOr[Input[String]] = js.undefined
  /**
    * Role is a SELinux role label that applies to the container.
    */
  var role: js.UndefOr[Input[String]] = js.undefined
  /**
    * Type is a SELinux type label that applies to the container.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
  /**
    * User is a SELinux user label that applies to the container.
    */
  var user: js.UndefOr[Input[String]] = js.undefined
}

object SELinuxOptions {
  @scala.inline
  def apply(
    level: Input[String] = null,
    role: Input[String] = null,
    `type`: Input[String] = null,
    user: Input[String] = null
  ): SELinuxOptions = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SELinuxOptions]
  }
}

