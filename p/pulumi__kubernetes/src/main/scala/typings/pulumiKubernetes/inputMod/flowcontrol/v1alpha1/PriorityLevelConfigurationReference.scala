package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationReference contains information that points to the
  * "request-priority" being used.
  */
trait PriorityLevelConfigurationReference extends js.Object {
  /**
    * `name` is the name of the priority level configuration being referenced Required.
    */
  var name: Input[String]
}

object PriorityLevelConfigurationReference {
  @scala.inline
  def apply(name: Input[String]): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
}

