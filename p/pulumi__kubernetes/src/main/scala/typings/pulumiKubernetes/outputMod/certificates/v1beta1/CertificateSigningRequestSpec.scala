package typings.pulumiKubernetes.outputMod.certificates.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This information is immutable after the request is created. Only the Request and Usages
  * fields can be set on creation, other fields are derived by Kubernetes and cannot be modified
  * by users.
  */
trait CertificateSigningRequestSpec extends js.Object {
  /**
    * Extra information about the requesting user. See user.Info interface for details.
    */
  val extra: js.Object
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  val groups: js.Array[String]
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  val request: String
  /**
    * Requested signer for the request. It is a qualified name in the form:
    * `scope-hostname.io/name`. If empty, it will be defaulted:
    *  1. If it's a kubelet client certificate, it is assigned
    *     "kubernetes.io/kube-apiserver-client-kubelet".
    *  2. If it's a kubelet serving certificate, it is assigned
    *     "kubernetes.io/kubelet-serving".
    *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
    * Distribution of trust for signers happens out of band. You can select on this field using
    * `spec.signerName`.
    */
  val signerName: String
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  val uid: String
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See:
    * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  val usages: js.Array[String]
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  val username: String
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(
    extra: js.Object,
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
}

