package typings.atPulumiKubernetes.typesInputMod.node.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.nodeDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
  var apiVersion: js.UndefOr[Input[nodeDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Handler specifies the underlying runtime and configuration that the CRI implementation will
    * use to handle pods of this class. The possible values are specific to the node & CRI
    * configuration.  It is assumed that all handlers are available on every node, and handlers
    * of the same name are equivalent on every node. For example, a handler called "runc" might
    * specify that the runc OCI runtime (using native Linux containers) will be used to run the
    * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
    * is immutable.
    */
  var handler: Input[String]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass]] = js.undefined
  /**
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Overhead represents the resource overhead associated with running a pod for a given
    * RuntimeClass. For more details, see
    * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
    * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
    * PodOverhead feature.
    */
  var overhead: js.UndefOr[Input[Overhead]] = js.undefined
  /**
    * Scheduling holds the scheduling constraints to ensure that pods running with this
    * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
    * RuntimeClass is assumed to be supported by all nodes.
    */
  var scheduling: js.UndefOr[Input[Scheduling]] = js.undefined
}

object RuntimeClass {
  @scala.inline
  def apply(
    handler: Input[String],
    apiVersion: Input[nodeDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass] = null,
    metadata: Input[ObjectMeta] = null,
    overhead: Input[Overhead] = null,
    scheduling: Input[Scheduling] = null
  ): RuntimeClass = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (overhead != null) __obj.updateDynamic("overhead")(overhead.asInstanceOf[js.Any])
    if (scheduling != null) __obj.updateDynamic("scheduling")(scheduling.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeClass]
  }
}

