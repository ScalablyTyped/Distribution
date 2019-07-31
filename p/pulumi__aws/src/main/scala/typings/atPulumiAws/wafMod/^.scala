package typings.atPulumiAws.wafMod

import typings.atPulumiAws.wafGetIpsetMod.GetIpsetArgs
import typings.atPulumiAws.wafGetIpsetMod.GetIpsetResult
import typings.atPulumiAws.wafGetRuleMod.GetRuleArgs
import typings.atPulumiAws.wafGetRuleMod.GetRuleResult
import typings.atPulumiAws.wafGetWebAclMod.GetWebAclArgs
import typings.atPulumiAws.wafGetWebAclMod.GetWebAclResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/waf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getIpset(args: GetIpsetArgs): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
  def getIpset(args: GetIpsetArgs, opts: InvokeOptions): js.Promise[GetIpsetResult] with GetIpsetResult = js.native
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
}

