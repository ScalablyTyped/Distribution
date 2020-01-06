package typings.atPulumiAws.wafMod

import typings.atPulumiAws.wafGetRateBasedRuleMod.GetRateBasedRuleArgs
import typings.atPulumiAws.wafGetRateBasedRuleMod.GetRateBasedRuleResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", "getRateBasedRule")
@js.native
object getRateBasedRule extends js.Object {
  def apply(args: GetRateBasedRuleArgs): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
  def apply(args: GetRateBasedRuleArgs, opts: InvokeOptions): js.Promise[GetRateBasedRuleResult] with GetRateBasedRuleResult = js.native
}

