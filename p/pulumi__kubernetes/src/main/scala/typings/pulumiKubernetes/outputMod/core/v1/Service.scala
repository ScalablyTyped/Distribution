package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1. Service object exists.
  * 2. Related Endpoint objects are created. Each time we get an update, wait 10 seconds
  *    for any stragglers.
  * 3. The endpoints objects target some number of living objects (unless the Service is
  *    an "empty headless" Service [1] or a Service with '.spec.type: ExternalName').
  * 4. External IP address is allocated (if Service has '.spec.type: LoadBalancer').
  *
  * Known limitations:
  * Services targeting ReplicaSets (and, by extension, Deployments,
  * StatefulSets, etc.) with '.spec.replicas' set to 0 are not handled, and will time
  * out. To work around this limitation, set 'pulumi.com/skipAwait: "true"' on
  * '.metadata.annotations' for the Service. Work to handle this case is in progress [2].
  *
  * [1] https://kubernetes.io/docs/concepts/services-networking/service/#headless-services
  * [2] https://github.com/pulumi/pulumi-kubernetes/pull/703
  *
  * If the Service has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
trait Service extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Service
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: ServiceSpec
  
  /**
    * Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var status: ServiceStatus
}
object Service {
  
  @scala.inline
  def apply(metadata: ObjectMeta, spec: ServiceSpec, status: ServiceStatus): Service = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", kind = "Service", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceMutableBuilder[Self <: Service] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Service): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: ServiceSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ServiceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
