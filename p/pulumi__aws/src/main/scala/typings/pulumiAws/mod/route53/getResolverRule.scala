package typings.pulumiAws.mod.route53

import typings.pulumiAws.getResolverRuleMod.GetResolverRuleArgs
import typings.pulumiAws.getResolverRuleMod.GetResolverRuleResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "route53.getResolverRule")
@js.native
object getResolverRule extends js.Object {
  
  def apply(): js.Promise[GetResolverRuleResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
  def apply(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] = js.native
  def apply(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] = js.native
}
