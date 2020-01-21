package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceSpec describes the attributes on a Namespace.
  */
trait NamespaceSpec extends js.Object {
  /**
    * Finalizers is an opaque list of values that must be empty to permanently remove object from
    * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  val finalizers: js.Array[String]
}

object NamespaceSpec {
  @scala.inline
  def apply(finalizers: js.Array[String]): NamespaceSpec = {
    val __obj = js.Dynamic.literal(finalizers = finalizers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NamespaceSpec]
  }
}

