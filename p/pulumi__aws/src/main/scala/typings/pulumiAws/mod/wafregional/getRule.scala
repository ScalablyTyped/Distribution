package typings.pulumiAws.mod.wafregional

import typings.pulumiAws.getRuleMod.GetRuleArgs
import typings.pulumiAws.getRuleMod.GetRuleResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "wafregional.getRule")
@js.native
object getRule extends js.Object {
  def apply(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def apply(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
}

