package typings
package atPulumiAwsLib.route53GetDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDelegationSetArgs extends js.Object {
  /**
    * The Hosted Zone id of the desired delegation set.
    */
  val id: java.lang.String
}

object GetDelegationSetArgs {
  @scala.inline
  def apply(id: java.lang.String): GetDelegationSetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[GetDelegationSetArgs]
  }
}

