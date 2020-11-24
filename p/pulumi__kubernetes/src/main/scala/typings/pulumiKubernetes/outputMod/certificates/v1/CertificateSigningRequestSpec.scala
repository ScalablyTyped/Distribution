package typings.pulumiKubernetes.outputMod.certificates.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CertificateSigningRequestSpec contains the certificate request.
  */
@js.native
trait CertificateSigningRequestSpec extends js.Object {
  
  /**
    * extra contains extra attributes of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
    */
  var extra: StringDictionary[js.Array[String]] = js.native
  
  /**
    * groups contains group membership of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
    */
  var groups: js.Array[String] = js.native
  
  /**
    * request contains an x509 certificate signing request encoded in a "CERTIFICATE REQUEST" PEM block. When serialized as JSON or YAML, the data is additionally base64-encoded.
    */
  var request: String = js.native
  
  /**
    * signerName indicates the requested signer, and is a qualified name.
    *
    * List/watch requests for CertificateSigningRequests can filter on this field using a "spec.signerName=NAME" fieldSelector.
    *
    * Well-known Kubernetes signers are:
    *  1. "kubernetes.io/kube-apiserver-client": issues client certificates that can be used to authenticate to kube-apiserver.
    *   Requests for this signer are never auto-approved by kube-controller-manager, can be issued by the "csrsigning" controller in kube-controller-manager.
    *  2. "kubernetes.io/kube-apiserver-client-kubelet": issues client certificates that kubelets use to authenticate to kube-apiserver.
    *   Requests for this signer can be auto-approved by the "csrapproving" controller in kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
    *  3. "kubernetes.io/kubelet-serving" issues serving certificates that kubelets use to serve TLS endpoints, which kube-apiserver can connect to securely.
    *   Requests for this signer are never auto-approved by kube-controller-manager, and can be issued by the "csrsigning" controller in kube-controller-manager.
    *
    * More details are available at https://k8s.io/docs/reference/access-authn-authz/certificate-signing-requests/#kubernetes-signers
    *
    * Custom signerNames can also be specified. The signer defines:
    *  1. Trust distribution: how trust (CA bundles) are distributed.
    *  2. Permitted subjects: and behavior when a disallowed subject is requested.
    *  3. Required, permitted, or forbidden x509 extensions in the request (including whether subjectAltNames are allowed, which types, restrictions on allowed values) and behavior when a disallowed extension is requested.
    *  4. Required, permitted, or forbidden key usages / extended key usages.
    *  5. Expiration/certificate lifetime: whether it is fixed by the signer, configurable by the admin.
    *  6. Whether or not requests for CA certificates are allowed.
    */
  var signerName: String = js.native
  
  /**
    * uid contains the uid of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
    */
  var uid: String = js.native
  
  /**
    * usages specifies a set of key usages requested in the issued certificate.
    *
    * Requests for TLS client certificates typically request: "digital signature", "key encipherment", "client auth".
    *
    * Requests for TLS serving certificates typically request: "key encipherment", "digital signature", "server auth".
    *
    * Valid values are:
    *  "signing", "digital signature", "content commitment",
    *  "key encipherment", "key agreement", "data encipherment",
    *  "cert sign", "crl sign", "encipher only", "decipher only", "any",
    *  "server auth", "client auth",
    *  "code signing", "email protection", "s/mime",
    *  "ipsec end system", "ipsec tunnel", "ipsec user",
    *  "timestamping", "ocsp signing", "microsoft sgc", "netscape sgc"
    */
  var usages: js.Array[String] = js.native
  
  /**
    * username contains the name of the user that created the CertificateSigningRequest. Populated by the API server on creation and immutable.
    */
  var username: String = js.native
}
object CertificateSigningRequestSpec {
  
  @scala.inline
  def apply(
    extra: StringDictionary[js.Array[String]],
    groups: js.Array[String],
    request: String,
    signerName: String,
    uid: String,
    usages: js.Array[String],
    username: String
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], signerName = signerName.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
  
  @scala.inline
  implicit class CertificateSigningRequestSpecOps[Self <: CertificateSigningRequestSpec] (val x: Self) extends AnyVal {
    
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
    def setExtra(value: StringDictionary[js.Array[String]]): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: String): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerName(value: String): Self = this.set("signerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagesVarargs(value: String*): Self = this.set("usages", js.Array(value :_*))
    
    @scala.inline
    def setUsages(value: js.Array[String]): Self = this.set("usages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
