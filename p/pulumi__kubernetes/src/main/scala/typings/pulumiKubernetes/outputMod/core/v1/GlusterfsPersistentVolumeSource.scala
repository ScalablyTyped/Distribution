package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
  */
trait GlusterfsPersistentVolumeSource extends StObject {
  
  /**
    * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpoints: String
  
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpointsNamespace: String
  
  /**
    * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var path: String
  
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var readOnly: Boolean
}
object GlusterfsPersistentVolumeSource {
  
  inline def apply(endpoints: String, endpointsNamespace: String, path: String, readOnly: Boolean): GlusterfsPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], endpointsNamespace = endpointsNamespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlusterfsPersistentVolumeSource]
  }
  
  extension [Self <: GlusterfsPersistentVolumeSource](x: Self) {
    
    inline def setEndpoints(value: String): Self = StObject.set(x, "endpoints", value.asInstanceOf[js.Any])
    
    inline def setEndpointsNamespace(value: String): Self = StObject.set(x, "endpointsNamespace", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
  }
}
