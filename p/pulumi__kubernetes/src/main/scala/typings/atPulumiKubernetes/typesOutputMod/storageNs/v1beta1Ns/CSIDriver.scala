package typings.atPulumiKubernetes.typesOutputMod.storageNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: `storageDOTk8sDOTio/v1beta1`
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSIDriver
  /**
    * Standard object metadata. metadata.Name indicates the name of the CSI driver that this
    * object refers to; it MUST be the same name returned by the CSI GetPluginName() call for
    * that driver. The driver name must be 63 characters or less, beginning and ending with an
    * alphanumeric character ([a-z0-9A-Z]) with dashes (-), dots (.), and alphanumerics between.
    * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
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
    apiVersion: `storageDOTk8sDOTio/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSIDriver,
    metadata: ObjectMeta,
    spec: CSIDriverSpec
  ): CSIDriver = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec)
  
    __obj.asInstanceOf[CSIDriver]
  }
}

