package typings.atPulumiKubernetes.typesInputMod.certificates.v1beta1

import typings.atPulumiPulumi.outputMod.Input
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
    uid: Input[String] = null,
    usages: Input[js.Array[Input[String]]] = null,
    username: Input[String] = null
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (usages != null) __obj.updateDynamic("usages")(usages.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
}

