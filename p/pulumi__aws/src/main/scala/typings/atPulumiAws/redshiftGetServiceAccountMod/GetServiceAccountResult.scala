package typings.atPulumiAws.redshiftGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS Redshift service account in the selected region.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val region: js.UndefOr[String] = js.undefined
}

object GetServiceAccountResult {
  @scala.inline
  def apply(arn: String, id: String, region: String = null): GetServiceAccountResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetServiceAccountResult]
  }
}

