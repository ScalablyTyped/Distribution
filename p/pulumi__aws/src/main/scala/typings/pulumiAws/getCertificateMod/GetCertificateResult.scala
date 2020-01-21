package typings.pulumiAws.getCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCertificateResult extends js.Object {
  /**
    * Set to the ARN of the found certificate, suitable for referencing in other resources that support ACM certificates.
    */
  val arn: String = js.native
  val domain: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val keyTypes: js.UndefOr[js.Array[String]] = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  val statuses: js.UndefOr[js.Array[String]] = js.native
  val types: js.UndefOr[js.Array[String]] = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (keyTypes != null) __obj.updateDynamic("keyTypes")(keyTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (statuses != null) __obj.updateDynamic("statuses")(statuses.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCertificateResult]
  }
}

