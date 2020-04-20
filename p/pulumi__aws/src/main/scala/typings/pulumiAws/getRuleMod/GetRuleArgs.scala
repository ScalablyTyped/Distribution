package typings.pulumiAws.getRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuleArgs extends js.Object {
  /**
    * The name of the WAF Regional rule.
    */
  val name: String = js.native
}

object GetRuleArgs {
  @scala.inline
  def apply(name: String): GetRuleArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleArgs]
  }
}

