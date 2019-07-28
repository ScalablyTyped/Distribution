package typings.atPulumiAws.acmGetCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCertificateResult extends js.Object {
  /**
    * Set to the ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
    */
  val arn: String
  val domain: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val keyTypes: js.UndefOr[js.Array[String]] = js.undefined
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  val statuses: js.UndefOr[js.Array[String]] = js.undefined
  val types: js.UndefOr[js.Array[String]] = js.undefined
}

object GetCertificateResult {
  @scala.inline
  def apply(
    arn: String,
    domain: String,
    id: String,
    keyTypes: js.Array[String] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    statuses: js.Array[String] = null,
    types: js.Array[String] = null
  ): GetCertificateResult = {
    val __obj = js.Dynamic.literal(arn = arn, domain = domain, id = id)
    if (keyTypes != null) __obj.updateDynamic("keyTypes")(keyTypes)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[GetCertificateResult]
  }
}

