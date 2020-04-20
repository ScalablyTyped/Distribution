package typings.pulumiKubernetes.outputMod.storage.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CSIDriver captures information about a Container Storage Interface (CSI) volume driver
  * deployed on the cluster. CSI drivers do not need to create the CSIDriver object directly.
  * Instead they may use the cluster-driver-registrar sidecar container. When deployed with a CSI
  * driver it automatically creates a CSIDriver object representing the driver. Kubernetes attach
  * detach controller uses this object to determine whether attach is required. Kubelet uses this
  * object to determine whether pod information needs to be passed on mount. CSIDriver objects
  * are non-namespaced.
  */
trait CSIDriver extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: storageDotk8sDotioSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver
  /**
    * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
    * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
    * that driver. The driver name must be 63 characters or less, beginning and ending with an
    * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
    * More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta
  /**
    * Specification of the CSI Driver.
    */
  val spec: CSIDriverSpec
}

object CSIDriver {
  @scala.inline
  def apply(
    apiVersion: storageDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CSIDriver,
    metadata: ObjectMeta,
    spec: CSIDriverSpec
  ): CSIDriver = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSIDriver]
  }
}

