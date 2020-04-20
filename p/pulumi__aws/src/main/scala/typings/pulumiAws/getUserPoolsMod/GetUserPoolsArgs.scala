package typings.pulumiAws.getUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUserPoolsArgs extends js.Object {
  /**
    * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
    */
  val name: String = js.native
}

object GetUserPoolsArgs {
  @scala.inline
  def apply(name: String): GetUserPoolsArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserPoolsArgs]
  }
}

