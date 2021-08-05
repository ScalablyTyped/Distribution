package typings.pulumiKubernetes.outputMod.apiextensions.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for removal in v1.22. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
  */
trait CustomResourceDefinition extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: apiextensionsDotk8sDotioSlashv1beta1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition
  
  var metadata: ObjectMeta
  
  /**
    * spec describes how the user wants the resources to appear
    */
  var spec: CustomResourceDefinitionSpec
  
  /**
    * status indicates the actual state of the CustomResourceDefinition
    */
  var status: CustomResourceDefinitionStatus
}
object CustomResourceDefinition {
  
  inline def apply(metadata: ObjectMeta, spec: CustomResourceDefinitionSpec, status: CustomResourceDefinitionStatus): CustomResourceDefinition = {
    val __obj = js.Dynamic.literal(apiVersion = "apiextensions.k8s.io/v1beta1", kind = "CustomResourceDefinition", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinition]
  }
  
  extension [Self <: CustomResourceDefinition](x: Self) {
    
    inline def setApiVersion(value: apiextensionsDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: CustomResourceDefinitionSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CustomResourceDefinitionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
