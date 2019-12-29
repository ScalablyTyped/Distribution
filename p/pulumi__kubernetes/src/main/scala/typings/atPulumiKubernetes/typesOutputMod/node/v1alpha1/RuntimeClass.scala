package typings.atPulumiKubernetes.typesOutputMod.node.v1alpha1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.nodeDotk8sDotioSlashv1alpha1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass
  * is used to determine which container runtime is used to run all containers in a pod.
  * RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and
  * referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName
  * reference before running the pod.  For more details, see
  * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
  */
trait RuntimeClass extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: nodeDotk8sDotioSlashv1alpha1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the RuntimeClass More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  val spec: RuntimeClassSpec
}

object RuntimeClass {
  @scala.inline
  def apply(
    apiVersion: nodeDotk8sDotioSlashv1alpha1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass,
    metadata: ObjectMeta,
    spec: RuntimeClassSpec
  ): RuntimeClass = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuntimeClass]
  }
}

