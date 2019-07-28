package typings.atPulumiAws.getCallerIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCallerIdentityResult extends js.Object {
  /**
    * The AWS Account ID number of the account that owns or contains the calling entity.
    */
  val accountId: String
  /**
    * The AWS ARN associated with the calling entity.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The unique identifier of the calling entity.
    */
  val userId: String
}

object GetCallerIdentityResult {
  @scala.inline
  def apply(accountId: String, arn: String, id: String, userId: String): GetCallerIdentityResult = {
    val __obj = js.Dynamic.literal(accountId = accountId, arn = arn, id = id, userId = userId)
  
    __obj.asInstanceOf[GetCallerIdentityResult]
  }
}

