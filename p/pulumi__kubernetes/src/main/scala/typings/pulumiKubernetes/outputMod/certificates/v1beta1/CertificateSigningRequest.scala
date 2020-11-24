package typings.pulumiKubernetes.outputMod.certificates.v1beta1

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a certificate signing request
  */
@js.native
trait CertificateSigningRequest extends js.Object {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: certificatesDotk8sDotioSlashv1beta1 = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest = js.native
  
  var metadata: ObjectMeta = js.native
  
  /**
    * The certificate request itself and any additional information.
    */
  var spec: CertificateSigningRequestSpec = js.native
  
  /**
    * Derived information about the request.
    */
  var status: CertificateSigningRequestStatus = js.native
}
object CertificateSigningRequest {
  
  @scala.inline
  def apply(
    apiVersion: certificatesDotk8sDotioSlashv1beta1,
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest,
    metadata: ObjectMeta,
    spec: CertificateSigningRequestSpec,
    status: CertificateSigningRequestStatus
  ): CertificateSigningRequest = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequest]
  }
  
  @scala.inline
  implicit class CertificateSigningRequestOps[Self <: CertificateSigningRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiVersion(value: certificatesDotk8sDotioSlashv1beta1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: CertificateSigningRequestSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: CertificateSigningRequestStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
