package typings
package atPulumiAwsLib.redshiftGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS Redshift service account in the selected region.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val region: js.UndefOr[java.lang.String] = js.undefined
}

object GetServiceAccountResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String, region: java.lang.String = null): GetServiceAccountResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GetServiceAccountResult]
  }
}

