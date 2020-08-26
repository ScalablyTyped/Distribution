package typings.pulumiKubernetes.inputMod.auditregistration.v1alpha1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Policy defines the configuration of how audit events are logged
  */
@js.native
trait Policy extends js.Object {
  /**
    * The Level that all requests are recorded at. available options: None, Metadata, Request, RequestResponse required
    */
  var level: Input[String] = js.native
  /**
    * Stages is a list of stages for which events are created.
    */
  var stages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object Policy {
  @scala.inline
  def apply(level: Input[String]): Policy = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
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
    def setLevel(value: Input[String]): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setStagesVarargs(value: Input[String]*): Self = this.set("stages", js.Array(value :_*))
    @scala.inline
    def setStages(value: Input[js.Array[Input[String]]]): Self = this.set("stages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStages: Self = this.set("stages", js.undefined)
  }
  
}

