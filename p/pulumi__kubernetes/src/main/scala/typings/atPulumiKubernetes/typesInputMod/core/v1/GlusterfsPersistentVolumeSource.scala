package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
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
  var endpoints: Input[String]
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is
    * empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpointsNamespace: js.UndefOr[Input[String]] = js.undefined
  /**
    * Path is the Glusterfs volume path. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var path: Input[String]
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions.
    * Defaults to false. More info:
    * https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.undefined
}

object GlusterfsPersistentVolumeSource {
  @scala.inline
  def apply(
    endpoints: Input[String],
    path: Input[String],
    endpointsNamespace: Input[String] = null,
    readOnly: Input[Boolean] = null
  ): GlusterfsPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (endpointsNamespace != null) __obj.updateDynamic("endpointsNamespace")(endpointsNamespace.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlusterfsPersistentVolumeSource]
  }
}

