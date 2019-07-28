package typings.atPulumiAws.iamGetUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS for this user.
    */
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Path in which this user was created.
    */
  val path: String
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: String
  /**
    * The unique ID assigned by AWS for this user.
    */
  val userId: String
  /**
    * The name associated to this User
    */
  val userName: String
}

object GetUserResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    path: String,
    permissionsBoundary: String,
    userId: String,
    userName: String
  ): GetUserResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, path = path, permissionsBoundary = permissionsBoundary, userId = userId, userName = userName)
  
    __obj.asInstanceOf[GetUserResult]
  }
}

