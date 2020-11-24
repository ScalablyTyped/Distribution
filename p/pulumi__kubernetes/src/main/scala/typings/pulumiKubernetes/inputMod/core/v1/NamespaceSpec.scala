package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceSpec describes the attributes on a Namespace.
  */
@js.native
trait NamespaceSpec extends js.Object {
  
  /**
    * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object NamespaceSpec {
  
  @scala.inline
  def apply(): NamespaceSpec = {
    val __obj = js.Dynamic.literal()
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
    def setFinalizersVarargs(value: Input[String]*): Self = this.set("finalizers", js.Array(value :_*))
    
    @scala.inline
    def setFinalizers(value: Input[js.Array[Input[String]]]): Self = this.set("finalizers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalizers: Self = this.set("finalizers", js.undefined)
  }
}
