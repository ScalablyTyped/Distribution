package typings.pulumiAws.getRateBasedModMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedModArgs extends js.Object {
  /**
    * The name of the WAF Regional rate based rule.
    */
  val name: String = js.native
}

object GetRateBasedModArgs {
  @scala.inline
  def apply(name: String): GetRateBasedModArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedModArgs]
  }
}

