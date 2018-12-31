package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
    * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
    */
  val endpoints: java.lang.String
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is
    * empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
    */
  val endpointsNamespace: java.lang.String
  /**
    * Path is the Glusterfs volume path. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
    */
  val path: java.lang.String
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
    * Defaults to false. More info:
    * https://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md#create-a-pod
    */
  val readOnly: scala.Boolean
}

