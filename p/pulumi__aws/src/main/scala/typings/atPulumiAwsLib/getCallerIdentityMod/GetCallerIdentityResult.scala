package typings
package atPulumiAwsLib.getCallerIdentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCallerIdentityResult extends js.Object {
  /**
    * The AWS Account ID number of the account that owns or contains the calling entity.
    */
  val accountId: java.lang.String
  /**
    * The AWS ARN associated with the calling entity.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The unique identifier of the calling entity.
    */
  val userId: java.lang.String
}

object GetCallerIdentityResult {
  @scala.inline
  def apply(accountId: java.lang.String, arn: java.lang.String, id: java.lang.String, userId: java.lang.String): GetCallerIdentityResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accountId")(accountId)
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[GetCallerIdentityResult]
  }
}

