package typings.pulumiKubernetes.outputMod.core.v1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
  */
trait ServiceAccount extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typings.pulumiKubernetes.pulumiKubernetesStrings.v1
  
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
    */
  var automountServiceAccountToken: Boolean
  
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.Array[LocalObjectReference]
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  var secrets: js.Array[ObjectReference]
}
object ServiceAccount {
  
  @scala.inline
  def apply(
    automountServiceAccountToken: Boolean,
    imagePullSecrets: js.Array[LocalObjectReference],
    metadata: ObjectMeta,
    secrets: js.Array[ObjectReference]
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal(apiVersion = "v1", automountServiceAccountToken = automountServiceAccountToken.asInstanceOf[js.Any], imagePullSecrets = imagePullSecrets.asInstanceOf[js.Any], kind = "ServiceAccount", metadata = metadata.asInstanceOf[js.Any], secrets = secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
  
  @scala.inline
  implicit class ServiceAccountMutableBuilder[Self <: ServiceAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: typings.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomountServiceAccountToken(value: Boolean): Self = StObject.set(x, "automountServiceAccountToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullSecrets(value: js.Array[LocalObjectReference]): Self = StObject.set(x, "imagePullSecrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagePullSecretsVarargs(value: LocalObjectReference*): Self = StObject.set(x, "imagePullSecrets", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.ServiceAccount): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecrets(value: js.Array[ObjectReference]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretsVarargs(value: ObjectReference*): Self = StObject.set(x, "secrets", js.Array(value :_*))
  }
}
