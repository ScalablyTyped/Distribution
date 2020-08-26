package typings.pulumiAws.getUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserArgs extends js.Object {
  /**
    * The friendly IAM user name to match.
    */
  val userName: String = js.native
}

object GetUserArgs {
  @scala.inline
  def apply(userName: String): GetUserArgs = {
    val __obj = js.Dynamic.literal(userName = userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserArgs]
  }
  @scala.inline
  implicit class GetUserArgsOps[Self <: GetUserArgs] (val x: Self) extends AnyVal {
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
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
  }
  
}

