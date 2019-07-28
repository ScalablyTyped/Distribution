package typings.atPulumiAws.wafMod

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
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
}

