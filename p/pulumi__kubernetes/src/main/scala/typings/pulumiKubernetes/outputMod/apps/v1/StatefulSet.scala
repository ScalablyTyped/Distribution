package typings.pulumiKubernetes.outputMod.apps.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StatefulSet represents a set of pods with consistent identities. Identities are defined as:
  *  - Network: A single stable DNS and hostname.
  *  - Storage: As many VolumeClaims as requested.
  * The StatefulSet guarantees that a given network identity will always map to the same storage identity.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1. The value of 'spec.replicas' matches '.status.replicas', '.status.currentReplicas',
  *    and '.status.readyReplicas'.
  * 2. The value of '.status.updateRevision' matches '.status.currentRevision'.
  *
  * If the StatefulSet has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
trait StatefulSet extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: appsSlashv1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet
  
  var metadata: ObjectMeta
  
  /**
    * Spec defines the desired identities of pods in this set.
    */
  var spec: StatefulSetSpec
  
  /**
    * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
    */
  var status: StatefulSetStatus
}
object StatefulSet {
  
  inline def apply(metadata: ObjectMeta, spec: StatefulSetSpec, status: StatefulSetStatus): StatefulSet = {
    val __obj = js.Dynamic.literal(apiVersion = "apps/v1", kind = "StatefulSet", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulSet]
  }
  
  extension [Self <: StatefulSet](x: Self) {
    
    inline def setApiVersion(value: appsSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: StatefulSetSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StatefulSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
