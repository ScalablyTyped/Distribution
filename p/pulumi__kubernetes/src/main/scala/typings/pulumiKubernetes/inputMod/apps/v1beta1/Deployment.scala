package typings.pulumiKubernetes.inputMod.apps.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait Deployment extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[appsSlashv1beta1]] = js.undefined
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Deployment]] = js.undefined
  
  /**
    * Standard object metadata.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  
  /**
    * Specification of the desired behavior of the Deployment.
    */
  var spec: js.UndefOr[Input[DeploymentSpec]] = js.undefined
  
  /**
    * Most recently observed status of the Deployment.
    */
  var status: js.UndefOr[Input[DeploymentStatus]] = js.undefined
}
object Deployment {
  
  @scala.inline
  def apply(): Deployment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deployment]
  }
  
  @scala.inline
  implicit class DeploymentMutableBuilder[Self <: Deployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: Input[appsSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Deployment]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: Input[DeploymentSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[DeploymentStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
