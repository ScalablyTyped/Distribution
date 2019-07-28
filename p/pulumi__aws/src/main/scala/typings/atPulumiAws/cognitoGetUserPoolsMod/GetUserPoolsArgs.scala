package typings.atPulumiAws.cognitoGetUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPoolsArgs extends js.Object {
  /**
    * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
    */
  val name: String
}

object GetUserPoolsArgs {
  @scala.inline
  def apply(name: String): GetUserPoolsArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetUserPoolsArgs]
  }
}

