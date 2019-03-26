package typings
package atPulumiKubernetesLib.typesOutputMod.storageNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSINode holds information about all CSI drivers installed on a node. CSI drivers do not need
  * to create the CSINode object directly. As long as they use the node-driver-registrar sidecar
  * container, the kubelet will automatically populate the CSINode object for the CSI driver as
  * part of kubelet plugin registration. CSINode has the same name as a node. If the object is
  * missing, it means either there are no CSI Drivers available on the node, or the Kubelet
  * version is low enough that it doesn't create this object. CSINode has an OwnerReference that
  * points to the corresponding node object.
  */
trait CSINode extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINode
  /**
    * metadata.name must be the Kubernetes node name.
    */
  val metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta
  /**
    * spec is the specification of CSINode
    */
  val spec: CSINodeSpec
}

object CSINode {
  @scala.inline
  def apply(
    apiVersion: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`storageDOTk8sDOTio/v1beta1`,
    kind: atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CSINode,
    metadata: atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta,
    spec: CSINodeSpec
  ): CSINode = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[CSINode]
  }
}

