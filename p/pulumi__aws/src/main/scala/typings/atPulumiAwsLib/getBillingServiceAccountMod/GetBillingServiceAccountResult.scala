package typings
package atPulumiAwsLib.getBillingServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBillingServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS billing service account.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetBillingServiceAccountResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String): GetBillingServiceAccountResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id)
  
    __obj.asInstanceOf[GetBillingServiceAccountResult]
  }
}

