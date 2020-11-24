package typings.pulumiKubernetes.outputMod.certificates.v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
  */
@js.native
trait CertificateSigningRequestSpec extends js.Object {
  
  /**
    * Extra information about the requesting user. See user.Info interface for details.
    */
  var extra: StringDictionary[js.Array[String]] = js.native
  
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  var groups: js.Array[String] = js.native
  
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  var request: String = js.native
  
  /**
    * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
    *  1. If it's a kubelet client certificate, it is assigned
    *     "kubernetes.io/kube-apiserver-client-kubelet".
    *  2. If it's a kubelet serving certificate, it is assigned
    *     "kubernetes.io/kubelet-serving".
    *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
    * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
    */
  var signerName: String = js.native
  
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  var uid: String = js.native
  
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    * Valid values are:
    *  "signing",
    *  "digital signature",
    *  "content commitment",
    *  "key encipherment",
    *  "key agreement",
    *  "data encipherment",
    *  "cert sign",
    *  "crl sign",
    *  "encipher only",
    *  "decipher only",
    *  "any",
    *  "server auth",
    *  "client auth",
    *  "code signing",
    *  "email protection",
    *  "s/mime",
    *  "ipsec end system",
    *  "ipsec tunnel",
    *  "ipsec user",
    *  "timestamping",
    *  "ocsp signing",
    *  "microsoft sgc",
    *  "netscape sgc"
    */
  var usages: js.Array[String] = js.native
  
  /**
    * Information about the requesting user. See user.Info interface for details.
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
