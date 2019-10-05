package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object NamespaceSpec {
  @scala.inline
  def apply(finalizers: Input[js.Array[Input[String]]] = null): NamespaceSpec = {
    val __obj = js.Dynamic.literal()
    if (finalizers != null) __obj.updateDynamic("finalizers")(finalizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceSpec]
  }
}

