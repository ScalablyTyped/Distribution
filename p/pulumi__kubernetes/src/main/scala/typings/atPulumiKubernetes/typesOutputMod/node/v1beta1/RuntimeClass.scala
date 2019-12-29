package typings.atPulumiKubernetes.typesOutputMod.node.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
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
  val apiVersion: nodeDotk8sDotioSlashv1beta1
  /**
    * Handler specifies the underlying runtime and configuration that the CRI implementation will
    * use to handle pods of this class. The possible values are specific to the node & CRI
    * configuration.  It is assumed that all handlers are available on every node, and handlers
    * of the same name are equivalent on every node. For example, a handler called "runc" might
    * specify that the runc OCI runtime (using native Linux containers) will be used to run the
    * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
    * is immutable.
    */
  val handler: String
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
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. For more details, see
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  val overhead: Overhead
  /**
    * Scheduling holds the scheduling constraints to ensure that pods running with this
    * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
    * RuntimeClass is assumed to be supported by all nodes.
    */
  val scheduling: Scheduling
}

object RuntimeClass {
  @scala.inline
  def apply(
    apiVersion: nodeDotk8sDotioSlashv1beta1,
    handler: String,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass,
    metadata: ObjectMeta,
    overhead: Overhead,
    scheduling: Scheduling
  ): RuntimeClass = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], overhead = overhead.asInstanceOf[js.Any], scheduling = scheduling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuntimeClass]
  }
}

