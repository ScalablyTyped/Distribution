package typings
package atPulumiAwsLib.acmGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateResult extends js.Object {
  /**
    * Set to the ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
    */
  val arn: java.lang.String
  val domain: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  val statuses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object GetCertificateResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    domain: java.lang.String,
    id: java.lang.String,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    statuses: js.Array[java.lang.String] = null,
    types: js.Array[java.lang.String] = null
  ): GetCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn, domain = domain, id = id)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GetCertificateResult]
  }
}

