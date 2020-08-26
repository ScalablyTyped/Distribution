package typings.pulumiKubernetes.inputMod.certificates.v1beta1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
  */
@js.native
trait CertificateSigningRequestSpec extends js.Object {
  /**
    * Extra information about the requesting user. See user.Info interface for details.
    */
  var extra: js.UndefOr[Input[StringDictionary[Input[js.Array[Input[String]]]]]] = js.native
  /**
    * Group information about the requesting user. See user.Info interface for details.
    */
  var groups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  var request: Input[String] = js.native
  /**
    * Requested signer for the request. It is a qualified name in the form: `scope-hostname.io/name`. If empty, it will be defaulted:
    *  1. If it's a kubelet client certificate, it is assigned
    *     "kubernetes.io/kube-apiserver-client-kubelet".
    *  2. If it's a kubelet serving certificate, it is assigned
    *     "kubernetes.io/kubelet-serving".
    *  3. Otherwise, it is assigned "kubernetes.io/legacy-unknown".
    * Distribution of trust for signers happens out of band. You can select on this field using `spec.signerName`.
    */
  var signerName: js.UndefOr[Input[String]] = js.native
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  var uid: js.UndefOr[Input[String]] = js.native
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  var usages: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  var username: js.UndefOr[Input[String]] = js.native
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(request: Input[String]): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
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
    def setRequest(value: Input[String]): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtra(value: Input[StringDictionary[Input[js.Array[Input[String]]]]]): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: Input[String]*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: Input[js.Array[Input[String]]]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setSignerName(value: Input[String]): Self = this.set("signerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignerName: Self = this.set("signerName", js.undefined)
    @scala.inline
    def setUid(value: Input[String]): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
    @scala.inline
    def setUsagesVarargs(value: Input[String]*): Self = this.set("usages", js.Array(value :_*))
    @scala.inline
    def setUsages(value: Input[js.Array[Input[String]]]): Self = this.set("usages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsages: Self = this.set("usages", js.undefined)
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

