package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
trait NamespaceStatus extends js.Object {
  /**
    * Phase is the current lifecycle phase of the namespace. More info:
    * https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  val phase: java.lang.String
}

object NamespaceStatus {
  @scala.inline
  def apply(phase: java.lang.String): NamespaceStatus = {
    val __obj = js.Dynamic.literal(phase = phase)
  
    __obj.asInstanceOf[NamespaceStatus]
  }
}

