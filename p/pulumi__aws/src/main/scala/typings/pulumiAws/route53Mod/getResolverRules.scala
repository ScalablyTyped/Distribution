package typings.pulumiAws.route53Mod

import typings.pulumiAws.getResolverRulesMod.GetResolverRulesArgs
import typings.pulumiAws.getResolverRulesMod.GetResolverRulesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/route53", "getResolverRules")
@js.native
object getResolverRules extends js.Object {
  
  def apply(): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] = js.native
  def apply(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] = js.native
}
