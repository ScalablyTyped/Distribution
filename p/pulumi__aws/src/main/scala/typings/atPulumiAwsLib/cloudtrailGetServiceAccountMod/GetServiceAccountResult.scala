package typings
package atPulumiAwsLib.cloudtrailGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS CloudTrail service account in the selected region.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetServiceAccountResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String): GetServiceAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetServiceAccountResult]
  }
}

