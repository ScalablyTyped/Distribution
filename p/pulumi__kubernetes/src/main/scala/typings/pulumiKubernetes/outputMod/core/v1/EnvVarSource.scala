package typings.pulumiKubernetes.outputMod.core.v1

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
  var configMapKeyRef: ConfigMapKeySelector = js.native
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: ObjectFieldSelector = js.native
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: ResourceFieldSelector = js.native
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: SecretKeySelector = js.native
}
object EnvVarSource {
  
  @scala.inline
  def apply(
    configMapKeyRef: ConfigMapKeySelector,
    fieldRef: ObjectFieldSelector,
    resourceFieldRef: ResourceFieldSelector,
    secretKeyRef: SecretKeySelector
  ): EnvVarSource = {
    val __obj = js.Dynamic.literal(configMapKeyRef = configMapKeyRef.asInstanceOf[js.Any], fieldRef = fieldRef.asInstanceOf[js.Any], resourceFieldRef = resourceFieldRef.asInstanceOf[js.Any], secretKeyRef = secretKeyRef.asInstanceOf[js.Any])
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
    def setConfigMapKeyRef(value: ConfigMapKeySelector): Self = this.set("configMapKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldRef(value: ObjectFieldSelector): Self = this.set("fieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceFieldRef(value: ResourceFieldSelector): Self = this.set("resourceFieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyRef(value: SecretKeySelector): Self = this.set("secretKeyRef", value.asInstanceOf[js.Any])
  }
}
