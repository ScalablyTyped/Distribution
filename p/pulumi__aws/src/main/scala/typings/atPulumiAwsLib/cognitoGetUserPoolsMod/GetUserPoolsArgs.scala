package typings
package atPulumiAwsLib.cognitoGetUserPoolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPoolsArgs extends js.Object {
  /**
    * Name of the cognito user pools. Name is not a unique attribute for cognito user pool, so multiple pools might be returned with given name.
    */
  val name: java.lang.String
}

object GetUserPoolsArgs {
  @scala.inline
  def apply(name: java.lang.String): GetUserPoolsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GetUserPoolsArgs]
  }
}

