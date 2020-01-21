package typings.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupUser extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the iam user.
    */
  var arn: String = js.native
  /**
    * The path to the iam user.
    */
  var path: String = js.native
  /**
    * The stable and unique string identifying the iam user.
    */
  var userId: String = js.native
  /**
    * The name of the iam user.
    */
  var userName: String = js.native
}

object GetGroupUser {
  @scala.inline
  def apply(arn: String, path: String, userId: String, userName: String): GetGroupUser = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupUser]
  }
}

