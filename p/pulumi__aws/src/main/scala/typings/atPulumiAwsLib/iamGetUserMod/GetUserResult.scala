package typings
package atPulumiAwsLib.iamGetUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS for this user.
    */
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * Path in which this user was created.
    */
  val path: java.lang.String
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: java.lang.String
  /**
    * The unique ID assigned by AWS for this user.
    */
  val userId: java.lang.String
  /**
    * The name associated to this User
    */
  val userName: java.lang.String
}

object GetUserResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    path: java.lang.String,
    permissionsBoundary: java.lang.String,
    userId: java.lang.String,
    userName: java.lang.String
  ): GetUserResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, path = path, permissionsBoundary = permissionsBoundary, userId = userId, userName = userName)
  
    __obj.asInstanceOf[GetUserResult]
  }
}

