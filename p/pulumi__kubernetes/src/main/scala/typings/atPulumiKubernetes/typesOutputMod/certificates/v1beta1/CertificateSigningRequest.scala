package typings.atPulumiKubernetes.typesOutputMod.certificates.v1beta1

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ObjectMeta
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
  val apiVersion: certificatesDotk8sDotioSlashv1beta1
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequest
  val metadata: ObjectMeta
  /**
    * The certificate request itself and any additional information.
    */
  val spec: CertificateSigningRequestSpec
  /**
    * Derived information about the request.
    */
  val status: CertificateSigningRequestStatus
}

object CertificateSigningRequest {
  @scala.inline
  def apply(
    apiVersion: certificatesDotk8sDotioSlashv1beta1,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequest,
    metadata: ObjectMeta,
    spec: CertificateSigningRequestSpec,
    status: CertificateSigningRequestStatus
  ): CertificateSigningRequest = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CertificateSigningRequest]
  }
}

