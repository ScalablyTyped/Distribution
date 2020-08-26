package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NamespaceSpec describes the attributes on a Namespace.
  */
@js.native
trait NamespaceSpec extends js.Object {
  /**
    * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var finalizers: js.Array[String] = js.native
}

object NamespaceSpec {
  @scala.inline
  def apply(finalizers: js.Array[String]): NamespaceSpec = {
    val __obj = js.Dynamic.literal(finalizers = finalizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceSpec]
  }
  @scala.inline
  implicit class NamespaceSpecOps[Self <: NamespaceSpec] (val x: Self) extends AnyVal {
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
    def setFinalizersVarargs(value: String*): Self = this.set("finalizers", js.Array(value :_*))
    @scala.inline
    def setFinalizers(value: js.Array[String]): Self = this.set("finalizers", value.asInstanceOf[js.Any])
  }
  
}

