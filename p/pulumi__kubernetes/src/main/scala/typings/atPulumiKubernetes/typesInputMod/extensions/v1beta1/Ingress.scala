package typings.atPulumiKubernetes.typesInputMod.extensions.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`extensions/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.meta.v1.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @deprecated extensions/v1beta1/Ingress is not supported by Kubernetes 1.16+ clusters. Use
  * networking/v1beta1/Ingress instead.
  *
  * Ingress is a collection of rules that allow inbound connections to reach the endpoints
  * defined by a backend. An Ingress can be configured to give services externally-reachable
  * urls, load balance traffic, terminate SSL, offer name based virtual hosting etc.
  */
trait Ingress extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[`extensions/v1beta1`]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Ingress]] = js.undefined
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * Spec is the desired state of the Ingress. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
    */
  var spec: js.UndefOr[Input[IngressSpec]] = js.undefined
}

object Ingress {
  @scala.inline
  def apply(
    apiVersion: Input[`extensions/v1beta1`] = null,
    kind: Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Ingress] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[IngressSpec] = null
  ): Ingress = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ingress]
  }
}

