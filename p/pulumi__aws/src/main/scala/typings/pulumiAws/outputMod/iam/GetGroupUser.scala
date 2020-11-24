package typings.pulumiAws.outputMod.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetGroupUserOps[Self <: GetGroupUser] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
}
