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
}

