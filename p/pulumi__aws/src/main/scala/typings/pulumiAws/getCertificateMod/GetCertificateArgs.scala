package typings.pulumiAws.getCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateArgs extends js.Object {
  /**
    * The domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
    */
  val domain: String = js.native
  /**
    * A list of key algorithms to filter certificates. By default, ACM does not return all certificate types when searching. Valid values are `RSA_1024`, `RSA_2048`, `RSA_4096`, `EC_prime256v1`, `EC_secp384r1`, and `EC_secp521r1`.
    */
  val keyTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * A list of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
    * `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
    * are returned.
    */
  val statuses: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of types on which to filter the returned list. Valid values are `AMAZON_ISSUED` and `IMPORTED`.
    */
  val types: js.UndefOr[js.Array[String]] = js.native
}

object GetCertificateArgs {
  @scala.inline
  def apply(
    domain: String,
    keyTypes: js.Array[String] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    statuses: js.Array[String] = null,
    types: js.Array[String] = null
  ): GetCertificateArgs = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (keyTypes != null) __obj.updateDynamic("keyTypes")(keyTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateArgs]
  }
}

