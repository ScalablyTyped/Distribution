package typings
package atPulumiAwsLib.wafregionalGetRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRuleArgs extends js.Object {
  /**
    * The name of the WAF rule.
    */
  val name: java.lang.String
}

object GetRuleArgs {
  @scala.inline
  def apply(name: java.lang.String): GetRuleArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[GetRuleArgs]
  }
}

