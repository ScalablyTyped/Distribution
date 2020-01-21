package typings.pulumiAws.getDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDelegationSetArgs extends js.Object {
  /**
    * The Hosted Zone id of the desired delegation set.
    */
  val id: String = js.native
}

object GetDelegationSetArgs {
  @scala.inline
  def apply(id: String): GetDelegationSetArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDelegationSetArgs]
  }
}

