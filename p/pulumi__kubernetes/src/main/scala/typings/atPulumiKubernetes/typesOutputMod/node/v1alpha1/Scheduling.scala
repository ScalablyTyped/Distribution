package typings.atPulumiKubernetes.typesOutputMod.node.v1alpha1

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.typesOutputMod.core.v1.Toleration
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
  val nodeSelector: StringDictionary[String]
  /**
    * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass
    * during admission, effectively unioning the set of nodes tolerated by the pod and the
    * RuntimeClass.
    */
  val tolerations: js.Array[Toleration]
}

object Scheduling {
  @scala.inline
  def apply(nodeSelector: StringDictionary[String], tolerations: js.Array[Toleration]): Scheduling = {
    val __obj = js.Dynamic.literal(nodeSelector = nodeSelector.asInstanceOf[js.Any], tolerations = tolerations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Scheduling]
  }
}

