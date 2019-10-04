package typings.atPulumiAws.route53Mod

import typings.atPulumiAws.route53GetDelegationSetMod.GetDelegationSetArgs
import typings.atPulumiAws.route53GetDelegationSetMod.GetDelegationSetResult
import typings.atPulumiAws.route53GetResolverRuleMod.GetResolverRuleArgs
import typings.atPulumiAws.route53GetResolverRuleMod.GetResolverRuleResult
import typings.atPulumiAws.route53GetResolverRulesMod.GetResolverRulesArgs
import typings.atPulumiAws.route53GetResolverRulesMod.GetResolverRulesResult
import typings.atPulumiAws.route53GetZoneMod.GetZoneArgs
import typings.atPulumiAws.route53GetZoneMod.GetZoneResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/route53", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getDelegationSet(args: GetDelegationSetArgs): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getDelegationSet(args: GetDelegationSetArgs, opts: InvokeOptions): js.Promise[GetDelegationSetResult] with GetDelegationSetResult = js.native
  def getResolverRule(): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRule(args: GetResolverRuleArgs, opts: InvokeOptions): js.Promise[GetResolverRuleResult] with GetResolverRuleResult = js.native
  def getResolverRules(): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getResolverRules(args: GetResolverRulesArgs, opts: InvokeOptions): js.Promise[GetResolverRulesResult] with GetResolverRulesResult = js.native
  def getZone(): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs): js.Promise[GetZoneResult] with GetZoneResult = js.native
  def getZone(args: GetZoneArgs, opts: InvokeOptions): js.Promise[GetZoneResult] with GetZoneResult = js.native
}

