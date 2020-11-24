package typings.pulumiKubernetes.serviceAccountMod

import typings.pulumiKubernetes.inputMod.core.v1.LocalObjectReference
import typings.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.v1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAccountArgs extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: js.UndefOr[Input[v1]] = js.native
  
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
    */
  val automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  val imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]] = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  val secrets: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.native
}
object ServiceAccountArgs {
  
  @scala.inline
  def apply(): ServiceAccountArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountArgs]
  }
  
  @scala.inline
  implicit class ServiceAccountArgsOps[Self <: ServiceAccountArgs] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: Input[v1]): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setAutomountServiceAccountToken(value: Input[Boolean]): Self = this.set("automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomountServiceAccountToken: Self = this.set("automountServiceAccountToken", js.undefined)
    
    @scala.inline
    def setImagePullSecretsVarargs(value: Input[LocalObjectReference]*): Self = this.set("imagePullSecrets", js.Array(value :_*))
    
    @scala.inline
    def setImagePullSecrets(value: Input[js.Array[Input[LocalObjectReference]]]): Self = this.set("imagePullSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePullSecrets: Self = this.set("imagePullSecrets", js.undefined)
    
    @scala.inline
    def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount]): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMetadata(value: Input[ObjectMeta]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setSecretsVarargs(value: Input[ObjectReference]*): Self = this.set("secrets", js.Array(value :_*))
    
    @scala.inline
    def setSecrets(value: Input[js.Array[Input[ObjectReference]]]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecrets: Self = this.set("secrets", js.undefined)
  }
}
