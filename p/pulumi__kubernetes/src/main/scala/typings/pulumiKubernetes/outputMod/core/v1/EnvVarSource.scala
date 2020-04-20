package typings.pulumiKubernetes.outputMod.core.v1

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
  val configMapKeyRef: ConfigMapKeySelector
  /**
    * Selects a field of the pod: supports metadata.name, metadata.namespace, metadata.labels,
    * metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP,
    * status.podIPs.
    */
  val fieldRef: ObjectFieldSelector
  /**
    * Selects a resource of the container: only resources limits and requests (limits.cpu,
    * limits.memory, limits.ephemeral-storage, requests.cpu, requests.memory and
    * requests.ephemeral-storage) are currently supported.
    */
  val resourceFieldRef: ResourceFieldSelector
  /**
    * Selects a key of a secret in the pod's namespace
    */
  val secretKeyRef: SecretKeySelector
}

object EnvVarSource {
  @scala.inline
  def apply(
    configMapKeyRef: ConfigMapKeySelector,
    fieldRef: ObjectFieldSelector,
    resourceFieldRef: ResourceFieldSelector,
    secretKeyRef: SecretKeySelector
  ): EnvVarSource = {
    val __obj = js.Dynamic.literal(configMapKeyRef = configMapKeyRef.asInstanceOf[js.Any], fieldRef = fieldRef.asInstanceOf[js.Any], resourceFieldRef = resourceFieldRef.asInstanceOf[js.Any], secretKeyRef = secretKeyRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvVarSource]
  }
}

