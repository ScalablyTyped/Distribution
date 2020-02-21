package typings.pulumiKubernetes.inputMod.storage.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
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
  *
  * @deprecated storage/v1beta1/CSINode is deprecated by storage/v1/CSINode.
  */
trait CSINode extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[storageDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode]] = js.undefined
  /**
    * metadata.name must be the Kubernetes node name.
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * spec is the specification of CSINode
    */
  var spec: Input[CSINodeSpec]
}

object CSINode {
  @scala.inline
  def apply(
    spec: Input[CSINodeSpec],
    apiVersion: Input[storageDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CSINode] = null,
    metadata: Input[ObjectMeta] = null
  ): CSINode = {
    val __obj = js.Dynamic.literal(spec = spec.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSINode]
  }
}

