package typings
package atPulumiAwsLib.acmGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateArgs extends js.Object {
  /**
    * The domain of the certificate to look up. If no certificate is found with this name, an error will be returned.
    */
  val domain: java.lang.String
  /**
    * If set to true, it sorts the certificates matched by previous criteria by the NotBefore field, returning only the most recent one. If set to false, it returns an error if more than one certificate is found. Defaults to false.
    */
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A list of statuses on which to filter the returned list. Valid values are `PENDING_VALIDATION`, `ISSUED`,
    * `INACTIVE`, `EXPIRED`, `VALIDATION_TIMED_OUT`, `REVOKED` and `FAILED`. If no value is specified, only certificates in the `ISSUED` state
    * are returned.
    */
  val statuses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of types on which to filter the returned list. Valid values are `AMAZON_ISSUED` and `IMPORTED`.
    */
  val types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GetCertificateArgs {
  @scala.inline
  def apply(
    domain: java.lang.String,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    statuses: js.Array[java.lang.String] = null,
    types: js.Array[java.lang.String] = null
  ): GetCertificateArgs = {
    val __obj = js.Dynamic.literal(domain = domain)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GetCertificateArgs]
  }
}

