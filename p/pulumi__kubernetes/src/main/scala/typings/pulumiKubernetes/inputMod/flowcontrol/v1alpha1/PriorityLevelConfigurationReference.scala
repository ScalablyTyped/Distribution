package typings.pulumiKubernetes.inputMod.flowcontrol.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * PriorityLevelConfigurationReference contains information that points to the "request-priority" being used.
  */
@js.native
trait PriorityLevelConfigurationReference extends js.Object {
  /**
    * `name` is the name of the priority level configuration being referenced Required.
    */
  var name: Input[String] = js.native
}

object PriorityLevelConfigurationReference {
  @scala.inline
  def apply(name: Input[String]): PriorityLevelConfigurationReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfigurationReference]
  }
  @scala.inline
  implicit class PriorityLevelConfigurationReferenceOps[Self <: PriorityLevelConfigurationReference] (val x: Self) extends AnyVal {
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

