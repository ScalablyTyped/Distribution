package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
trait EnvVarSource extends StObject {
  
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: ConfigMapKeySelector
  
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, `metadata.labels['<KEY>']`, `metadata.annotations['<KEY>']`, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP, status.podIPs.
    */
  var fieldRef: ObjectFieldSelector
  
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu, limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: ResourceFieldSelector
  
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: SecretKeySelector
}
object EnvVarSource {
  
  inline def apply(
    configMapKeyRef: ConfigMapKeySelector,
    fieldRef: ObjectFieldSelector,
    resourceFieldRef: ResourceFieldSelector,
    secretKeyRef: SecretKeySelector
  ): EnvVarSource = {
    val __obj = js.Dynamic.literal(configMapKeyRef = configMapKeyRef.asInstanceOf[js.Any], fieldRef = fieldRef.asInstanceOf[js.Any], resourceFieldRef = resourceFieldRef.asInstanceOf[js.Any], secretKeyRef = secretKeyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVarSource]
  }
  
  extension [Self <: EnvVarSource](x: Self) {
    
    inline def setConfigMapKeyRef(value: ConfigMapKeySelector): Self = StObject.set(x, "configMapKeyRef", value.asInstanceOf[js.Any])
    
    inline def setFieldRef(value: ObjectFieldSelector): Self = StObject.set(x, "fieldRef", value.asInstanceOf[js.Any])
    
    inline def setResourceFieldRef(value: ResourceFieldSelector): Self = StObject.set(x, "resourceFieldRef", value.asInstanceOf[js.Any])
    
    inline def setSecretKeyRef(value: SecretKeySelector): Self = StObject.set(x, "secretKeyRef", value.asInstanceOf[js.Any])
  }
}
