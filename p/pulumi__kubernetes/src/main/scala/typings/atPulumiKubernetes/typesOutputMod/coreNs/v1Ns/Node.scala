package typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node is a worker node in Kubernetes. Each node will have a unique identifier in the cache
  * (i.e. in etcd).
  */
trait Node extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: v1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Node
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Spec defines the behavior of a node.
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: NodeSpec
  /**
    * Most recently observed status of the node. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: NodeStatus
}

object Node {
  @scala.inline
  def apply(
    apiVersion: v1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.Node,
    metadata: ObjectMeta,
    spec: NodeSpec,
    status: NodeStatus
  ): Node = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[Node]
  }
}

