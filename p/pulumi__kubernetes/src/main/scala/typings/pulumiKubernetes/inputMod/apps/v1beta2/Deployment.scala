package typings.pulumiKubernetes.inputMod.apps.v1beta2

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Deployment enables declarative updates for Pods and ReplicaSets.
  *
  * This resource waits until its status is ready before registering success
  * for create/update, and populating output properties from the current state of the resource.
  * The following conditions are used to determine whether the resource creation has
  * succeeded or failed:
  *
  * 1. The Deployment has begun to be updated by the Deployment controller. If the current
  *    generation of the Deployment is > 1, then this means that the current generation must
  *    be different from the generation reported by the last outputs.
  * 2. There exists a ReplicaSet whose revision is equal to the current revision of the
  *    Deployment.
  * 3. The Deployment's '.status.conditions' has a status of type 'Available' whose 'status'
  *    member is set to 'True'.
  * 4. If the Deployment has generation > 1, then '.status.conditions' has a status of type
  *    'Progressing', whose 'status' member is set to 'True', and whose 'reason' is
  *    'NewReplicaSetAvailable'. For generation <= 1, this status field does not exist,
  *    because it doesn't do a rollout (i.e., it simply creates the Deployment and
  *    corresponding ReplicaSet), and therefore there is no rollout to mark as 'Progressing'.
  *
  * If the Deployment has not reached a Ready state after 10 minutes, it will
  * time out and mark the resource update as Failed. You can override the default timeout value
  * by setting the 'customTimeouts' option on the resource.
  */
@js.native
trait Deployment extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[appsSlashv1beta2]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Deployment]] = js.native
  /**
    * Standard object metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Specification of the desired behavior of the Deployment.
    */
  var spec: js.UndefOr[Input[DeploymentSpec]] = js.native
  /**
    * Most recently observed status of the Deployment.
    */
  var status: js.UndefOr[Input[DeploymentStatus]] = js.native
}

object Deployment {
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  @scala.inline
  implicit class DeploymentOps[Self <: Deployment] (val x: Self) extends AnyVal {
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
    def setApiVersion(value: Input[appsSlashv1beta2]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Deployment]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setSpec(value: Input[DeploymentSpec]): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpec: Self = this.set("spec", js.undefined)
    @scala.inline
    def setStatus(value: Input[DeploymentStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

