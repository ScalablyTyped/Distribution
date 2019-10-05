package typings.atPulumiKubernetes.typesInputMod.core.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * EnvVarSource represents a source for the value of an EnvVar.
  */
trait EnvVarSource extends js.Object {
  /**
    * Selects a key of a ConfigMap.
    */
  var configMapKeyRef: js.UndefOr[Input[ConfigMapKeySelector]] = js.undefined
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels,
    * metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
    */
  var fieldRef: js.UndefOr[Input[ObjectFieldSelector]] = js.undefined
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and
    * requests.ephemeral-storage) are currently supported.
    */
  var resourceFieldRef: js.UndefOr[Input[ResourceFieldSelector]] = js.undefined
  /**
    * Selects a key of a secret in the pod's namespace
    */
  var secretKeyRef: js.UndefOr[Input[SecretKeySelector]] = js.undefined
}

object EnvVarSource {
  @scala.inline
  def apply(
    configMapKeyRef: Input[ConfigMapKeySelector] = null,
    fieldRef: Input[ObjectFieldSelector] = null,
    resourceFieldRef: Input[ResourceFieldSelector] = null,
    secretKeyRef: Input[SecretKeySelector] = null
  ): EnvVarSource = {
    val __obj = js.Dynamic.literal()
    if (configMapKeyRef != null) __obj.updateDynamic("configMapKeyRef")(configMapKeyRef.asInstanceOf[js.Any])
    if (fieldRef != null) __obj.updateDynamic("fieldRef")(fieldRef.asInstanceOf[js.Any])
    if (resourceFieldRef != null) __obj.updateDynamic("resourceFieldRef")(resourceFieldRef.asInstanceOf[js.Any])
    if (secretKeyRef != null) __obj.updateDynamic("secretKeyRef")(secretKeyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVarSource]
  }
}

