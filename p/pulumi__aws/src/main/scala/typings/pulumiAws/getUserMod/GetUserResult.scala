package typings.pulumiAws.getUserMod

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
    * The provider-assigned unique ID for this managed resource.
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
  @scala.inline
  implicit class GetUserResultOps[Self <: GetUserResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsBoundary(value: String): Self = this.set("permissionsBoundary", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
  
}

