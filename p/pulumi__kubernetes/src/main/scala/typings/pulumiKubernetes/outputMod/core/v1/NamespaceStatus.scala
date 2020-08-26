package typings.pulumiKubernetes.outputMod.core.v1

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
  var conditions: js.Array[NamespaceCondition] = js.native
  /**
    * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: String = js.native
}

object NamespaceStatus {
  @scala.inline
  def apply(conditions: js.Array[NamespaceCondition], phase: String): NamespaceStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
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
    def setConditionsVarargs(value: NamespaceCondition*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[NamespaceCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhase(value: String): Self = this.set("phase", value.asInstanceOf[js.Any])
  }
  
}

