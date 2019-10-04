package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

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
  val conditions: js.Array[NamespaceCondition]
  /**
    * Phase is the current lifecycle phase of the namespace. More info:
    * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  val phase: String
}

object NamespaceStatus {
  @scala.inline
  def apply(conditions: js.Array[NamespaceCondition], phase: String): NamespaceStatus = {
    val __obj = js.Dynamic.literal(conditions = conditions, phase = phase)
  
    __obj.asInstanceOf[NamespaceStatus]
  }
}

