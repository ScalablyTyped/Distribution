package typings.atPulumiAws.iamGetUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserArgs extends js.Object {
  /**
    * The friendly IAM user name to match.
    */
  val userName: String
}

object GetUserArgs {
  @scala.inline
  def apply(userName: String): GetUserArgs = {
    val __obj = js.Dynamic.literal(userName = userName)
  
    __obj.asInstanceOf[GetUserArgs]
  }
}

