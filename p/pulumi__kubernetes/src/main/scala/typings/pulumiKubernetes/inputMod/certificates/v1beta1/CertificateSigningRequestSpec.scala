package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import typings.pulumiPulumi.outputMod.Input
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
  var extra: js.UndefOr[Input[js.Object]] = js.undefined
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  var request: Input[String]
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
  var signerName: js.UndefOr[Input[String]] = js.undefined
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  var uid: js.UndefOr[Input[String]] = js.undefined
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See:
    * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  var username: js.UndefOr[Input[String]] = js.undefined
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(
    request: Input[String],
    extra: Input[js.Object] = null,
    groups: Input[js.Array[Input[String]]] = null,
    signerName: Input[String] = null,
    uid: Input[String] = null,
    usages: Input[js.Array[Input[String]]] = null,
    username: Input[String] = null
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (signerName != null) __obj.updateDynamic("signerName")(signerName.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (usages != null) __obj.updateDynamic("usages")(usages.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
}

