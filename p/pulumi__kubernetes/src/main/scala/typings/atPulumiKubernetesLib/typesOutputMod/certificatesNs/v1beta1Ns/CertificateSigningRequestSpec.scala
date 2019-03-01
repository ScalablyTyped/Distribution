package typings
package atPulumiKubernetesLib.typesOutputMod.certificatesNs.v1beta1Ns

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
  val groups: js.Array[java.lang.String]
  /**
    * Base64-encoded PKCS#10 CSR data
    */
  val request: java.lang.String
  /**
    * UID information about the requesting user. See user.Info interface for details.
    */
  val uid: java.lang.String
  /**
    * allowedUsages specifies a set of usage contexts the key will be valid for. See:
    * https://tools.ietf.org/html/rfc5280#section-4.2.1.3
    *      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
    */
  val usages: js.Array[java.lang.String]
  /**
    * Information about the requesting user. See user.Info interface for details.
    */
  val username: java.lang.String
}

object CertificateSigningRequestSpec {
  @scala.inline
  def apply(
    extra: js.Object,
    groups: js.Array[java.lang.String],
    request: java.lang.String,
    uid: java.lang.String,
    usages: js.Array[java.lang.String],
    username: java.lang.String
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extra")(extra)
    __obj.updateDynamic("groups")(groups)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("uid")(uid)
    __obj.updateDynamic("usages")(usages)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
}

