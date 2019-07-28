package typings.atPulumiKubernetes.typesOutputMod.certificatesNs.v1beta1Ns

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
    uid: String,
    usages: js.Array[String],
    username: String
  ): CertificateSigningRequestSpec = {
    val __obj = js.Dynamic.literal(extra = extra, groups = groups, request = request, uid = uid, usages = usages, username = username)
  
    __obj.asInstanceOf[CertificateSigningRequestSpec]
  }
}

