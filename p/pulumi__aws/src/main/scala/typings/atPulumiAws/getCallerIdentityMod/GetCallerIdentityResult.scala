package typings.atPulumiAws.getCallerIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCallerIdentityResult extends js.Object {
  /**
    * The AWS Account ID number of the account that owns or contains the calling entity.
    */
  val accountId: String = js.native
  /**
    * The AWS ARN associated with the calling entity.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The unique identifier of the calling entity.
    */
  val userId: String = js.native
}

object GetCallerIdentityResult {
  @scala.inline
  def apply(accountId: String, arn: String, id: String, userId: String): GetCallerIdentityResult = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCallerIdentityResult]
  }
}

