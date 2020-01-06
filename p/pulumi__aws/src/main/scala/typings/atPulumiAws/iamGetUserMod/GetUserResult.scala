package typings.atPulumiAws.iamGetUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned by AWS for this user.
    */
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Path in which this user was created.
    */
  val path: String = js.native
  /**
    * The ARN of the policy that is used to set the permissions boundary for the user.
    */
  val permissionsBoundary: String = js.native
  /**
    * The unique ID assigned by AWS for this user.
    */
  val userId: String = js.native
  /**
    * The name associated to this User
    */
  val userName: String = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permissionsBoundary = permissionsBoundary.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUserResult]
  }
}

