package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Glusterfs mount that lasts the lifetime of a pod. Glusterfs volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait GlusterfsPersistentVolumeSource extends js.Object {
  /**
    * EndpointsName is the endpoint name that details Glusterfs topology. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpoints: Input[String] = js.native
  /**
    * EndpointsNamespace is the namespace that contains Glusterfs endpoint. If this field is empty, the EndpointNamespace defaults to the same namespace as the bound PVC. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var endpointsNamespace: js.UndefOr[Input[String]] = js.native
  /**
    * Path is the Glusterfs volume path. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var path: Input[String] = js.native
  /**
    * ReadOnly here will force the Glusterfs volume to be mounted with read-only permissions. Defaults to false. More info: https://examples.k8s.io/volumes/glusterfs/README.md#create-a-pod
    */
  var readOnly: js.UndefOr[Input[Boolean]] = js.native
}

object GlusterfsPersistentVolumeSource {
  @scala.inline
  def apply(endpoints: Input[String], path: Input[String]): GlusterfsPersistentVolumeSource = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlusterfsPersistentVolumeSource]
  }
  @scala.inline
  implicit class GlusterfsPersistentVolumeSourceOps[Self <: GlusterfsPersistentVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpoints(value: Input[String]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Input[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointsNamespace(value: Input[String]): Self = this.set("endpointsNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointsNamespace: Self = this.set("endpointsNamespace", js.undefined)
    @scala.inline
    def setReadOnly(value: Input[Boolean]): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
  }
  
}

