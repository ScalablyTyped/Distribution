package typings.atPulumiKubernetes.typesOutputMod.certificatesNs.v1beta1Ns

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`certificatesDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
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
  val apiVersion: `certificatesDOTk8sDOTio/v1beta1`
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
    apiVersion: `certificatesDOTk8sDOTio/v1beta1`,
    kind: typings.atPulumiKubernetes.atPulumiKubernetesStrings.CertificateSigningRequest,
    metadata: ObjectMeta,
    spec: CertificateSigningRequestSpec,
    status: CertificateSigningRequestStatus
  ): CertificateSigningRequest = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion, kind = kind, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[CertificateSigningRequest]
  }
}

