package typings.pulumiKubernetes.outputMod.flowcontrol.v1alpha1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PriorityLevelConfiguration represents the configuration of a priority level.
  */
trait PriorityLevelConfiguration extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration
  
  /**
    * `metadata` is the standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * `spec` is the specification of the desired behavior of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: PriorityLevelConfigurationSpec
  
  /**
    * `status` is the current status of a "request-priority". More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: PriorityLevelConfigurationStatus
}
object PriorityLevelConfiguration {
  
  inline def apply(
    metadata: ObjectMeta,
    spec: PriorityLevelConfigurationSpec,
    status: PriorityLevelConfigurationStatus
  ): PriorityLevelConfiguration = {
    val __obj = js.Dynamic.literal(apiVersion = "flowcontrol.apiserver.k8s.io/v1alpha1", kind = "PriorityLevelConfiguration", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityLevelConfiguration]
  }
  
  extension [Self <: PriorityLevelConfiguration](x: Self) {
    
    inline def setApiVersion(value: flowcontrolDotapiserverDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityLevelConfiguration): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: PriorityLevelConfigurationSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PriorityLevelConfigurationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
