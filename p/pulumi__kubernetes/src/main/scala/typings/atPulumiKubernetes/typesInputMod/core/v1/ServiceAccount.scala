package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral
  * systems, for an identity * a principal that can be authenticated and authorized * a set of
  * secrets
  */
trait ServiceAccount extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1]] = js.undefined
  /**
    * AutomountServiceAccountToken indicates whether pods running as this service account should
    * have an API token automatically mounted. Can be overridden at the pod level.
    */
  var automountServiceAccountToken: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * ImagePullSecrets is a list of references to secrets in the same namespace to use for
    * pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are
    * distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are
    * only accessed by the kubelet. More info:
    * https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
    */
  var imagePullSecrets: js.UndefOr[Input[js.Array[Input[LocalObjectReference]]]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ServiceAccount]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Secrets is the list of secrets allowed to be used by pods running using this
    * ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
    */
  var secrets: js.UndefOr[Input[js.Array[Input[ObjectReference]]]] = js.undefined
}

object ServiceAccount {
  @scala.inline
  def apply(
    apiVersion: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1] = null,
    automountServiceAccountToken: Input[Boolean] = null,
    imagePullSecrets: Input[js.Array[Input[LocalObjectReference]]] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ServiceAccount] = null,
    metadata: Input[ObjectMeta] = null,
    secrets: Input[js.Array[Input[ObjectReference]]] = null
  ): ServiceAccount = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (automountServiceAccountToken != null) __obj.updateDynamic("automountServiceAccountToken")(automountServiceAccountToken.asInstanceOf[js.Any])
    if (imagePullSecrets != null) __obj.updateDynamic("imagePullSecrets")(imagePullSecrets.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (secrets != null) __obj.updateDynamic("secrets")(secrets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccount]
  }
}

