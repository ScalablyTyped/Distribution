package typings.atPulumiKubernetes.typesOutputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not
  * support ownership management or SELinux relabeling.
  */
trait GlusterfsPersistentVolumeSource extends js.Object {
  /**
    * EndpointsName is the endpoint name that details Glusterfs topology. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val endpoints: String
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is
    * empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val endpointsNamespace: String
  /**
    * Path is the Glusterfs volume path. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val path: String
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
    * Defaults to false. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  val readOnly: Boolean
}

object GlusterfsPersistentVolumeSource {
  @scala.inline
  def apply(endpoints: String, endpointsNamespace: String, path: String, readOnly: Boolean): GlusterfsPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], endpointsNamespace = endpointsNamespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlusterfsPersistentVolumeSource]
  }
}

