package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

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
  val name: String
}

object PriorityLevelConfigurationReference {
  @scala.inline
  def apply(name: String): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
}

