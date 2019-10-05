package typings.atPulumiKubernetes.typesInputMod.node.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.typesInputMod.core.v1.Toleration
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
  */
trait Scheduling extends js.Object {
  /**
    * nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
    * Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The
    * RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will
    * cause the pod to be rejected in admission.
    */
  var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  /**
    * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass
    * during admission, effectively unioning the set of nodes tolerated by the pod and the
    * RuntimeClass.
    */
  var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.undefined
}

object Scheduling {
  @scala.inline
  def apply(
    nodeSelector: Input[StringDictionary[Input[String]]] = null,
    tolerations: Input[js.Array[Input[Toleration]]] = null
  ): Scheduling = {
    val __obj = js.Dynamic.literal()
    if (nodeSelector != null) __obj.updateDynamic("nodeSelector")(nodeSelector.asInstanceOf[js.Any])
    if (tolerations != null) __obj.updateDynamic("tolerations")(tolerations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scheduling]
  }
}

