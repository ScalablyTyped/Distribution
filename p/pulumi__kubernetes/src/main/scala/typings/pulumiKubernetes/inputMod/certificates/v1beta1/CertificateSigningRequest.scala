package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a certificate signing request
  */
trait CertificateSigningRequest extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[certificatesDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[
    Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest]
  ] = js.undefined
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
  /**
    * The certificate request itself and any additional information.
    */
  var spec: js.UndefOr[Input[CertificateSigningRequestSpec]] = js.undefined
}

object CertificateSigningRequest {
  @scala.inline
  def apply(
    apiVersion: Input[certificatesDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest] = null,
    metadata: Input[ObjectMeta] = null,
    spec: Input[CertificateSigningRequestSpec] = null
  ): CertificateSigningRequest = {
    val __obj = js.Dynamic.literal()
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (spec != null) __obj.updateDynamic("spec")(spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequest]
  }
}

