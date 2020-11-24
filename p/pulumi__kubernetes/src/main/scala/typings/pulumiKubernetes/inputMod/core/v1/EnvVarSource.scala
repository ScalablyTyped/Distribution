package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
@js.native
trait EnvVarSource extends js.Object {
  
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: js.UndefOr[Input[ConfigMapKeySelector]] = js.native
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.native
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.native
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: js.UndefOr[Input[SecretKeySelector]] = js.native
}
object EnvVarSource {
  
  @scala.inline
  def apply(): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvVarSource]
  }
  
  @scala.inline
  implicit class EnvVarSourceOps[Self <: EnvVarSource] (val x: Self) extends AnyVal {
    
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
    def setConfigMapKeyRef(value: Input[ConfigMapKeySelector]): Self = this.set("configMapKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigMapKeyRef: Self = this.set("configMapKeyRef", js.undefined)
    
    @scala.inline
    def setFieldRef(value: Input[ObjectFieldSelector]): Self = this.set("fieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldRef: Self = this.set("fieldRef", js.undefined)
    
    @scala.inline
    def setResourceFieldRef(value: Input[ResourceFieldSelector]): Self = this.set("resourceFieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceFieldRef: Self = this.set("resourceFieldRef", js.undefined)
    
    @scala.inline
    def setSecretKeyRef(value: Input[SecretKeySelector]): Self = this.set("secretKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretKeyRef: Self = this.set("secretKeyRef", js.undefined)
  }
}
