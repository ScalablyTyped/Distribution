package typings
package atPulumiKubernetesLib.typesOutputMod.coreNs.v1Ns

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
    * metadata.annotations, spec.nodeName, spec.serviceAccountName, status.hostIP, status.podIP.
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

