package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
trait NamespaceStatus extends js.Object {
  /**
    * Represents the latest available observations of a namespace's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NamespaceCondition]]]] = js.undefined
  /**
    * Phase is the current lifecycle phase of the namespace. More info:
    * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
}

object NamespaceStatus {
  @scala.inline
  def apply(conditions: Input[js.Array[Input[NamespaceCondition]]] = null, phase: Input[String] = null): NamespaceStatus = {
    val __obj = js.Dynamic.literal()
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (phase != null) __obj.updateDynamic("phase")(phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceStatus]
  }
}

