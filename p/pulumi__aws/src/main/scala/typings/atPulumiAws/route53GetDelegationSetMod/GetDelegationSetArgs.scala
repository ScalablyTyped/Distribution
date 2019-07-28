package typings.atPulumiAws.route53GetDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDelegationSetArgs extends js.Object {
  /**
    * The Hosted Zone id of the desired delegation set.
    */
  val id: String
}

object GetDelegationSetArgs {
  @scala.inline
  def apply(id: String): GetDelegationSetArgs = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetDelegationSetArgs]
  }
}

