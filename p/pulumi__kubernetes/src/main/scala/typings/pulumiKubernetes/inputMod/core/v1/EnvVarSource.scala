package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
@js.native
trait EnvVarSource extends StObject {
  
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
  implicit class EnvVarSourceMutableBuilder[Self <: EnvVarSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigMapKeyRef(value: Input[ConfigMapKeySelector]): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigMapKeyRefUndefined: Self = StObject.set(x, "configMapKeyRef", js.undefined)
    
    @scala.inline
    def setFieldRef(value: Input[ObjectFieldSelector]): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldRefUndefined: Self = StObject.set(x, "fieldRef", js.undefined)
    
    @scala.inline
    def setResourceFieldRef(value: Input[ResourceFieldSelector]): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceFieldRefUndefined: Self = StObject.set(x, "resourceFieldRef", js.undefined)
    
    @scala.inline
    def setSecretKeyRef(value: Input[SecretKeySelector]): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKeyRefUndefined: Self = StObject.set(x, "secretKeyRef", js.undefined)
  }
}
