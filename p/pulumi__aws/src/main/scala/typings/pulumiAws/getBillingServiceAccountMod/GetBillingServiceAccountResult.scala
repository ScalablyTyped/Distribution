package typings.pulumiAws.getBillingServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBillingServiceAccountResult extends js.Object {
  /**
    * The ARN of the AWS billing service account.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetBillingServiceAccountResult {
  @scala.inline
  def apply(arn: String, id: String): GetBillingServiceAccountResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBillingServiceAccountResult]
  }
}

