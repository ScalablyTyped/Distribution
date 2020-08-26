package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
@js.native
trait NamespaceStatus extends js.Object {
  /**
    * Represents the latest available observations of a namespace's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NamespaceCondition]]]] = js.native
  /**
    * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: js.UndefOr[Input[String]] = js.native
}

object NamespaceStatus {
  @scala.inline
  def apply(): NamespaceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceStatus]
  }
  @scala.inline
  implicit class NamespaceStatusOps[Self <: NamespaceStatus] (val x: Self) extends AnyVal {
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
    def setConditionsVarargs(value: Input[NamespaceCondition]*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: Input[js.Array[Input[NamespaceCondition]]]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    @scala.inline
    def setPhase(value: Input[String]): Self = this.set("phase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhase: Self = this.set("phase", js.undefined)
  }
  
}

