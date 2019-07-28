package typings.atPulumiAws.wafregionalMod

import typings.atPulumiAws.wafregionalGetRuleMod.GetRuleArgs
import typings.atPulumiAws.wafregionalGetRuleMod.GetRuleResult
import typings.atPulumiAws.wafregionalGetWebAclMod.GetWebAclArgs
import typings.atPulumiAws.wafregionalGetWebAclMod.GetWebAclResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/wafregional", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getRule(args: GetRuleArgs): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getRule(args: GetRuleArgs, opts: InvokeOptions): js.Promise[GetRuleResult] with GetRuleResult = js.native
  def getWebAcl(args: GetWebAclArgs): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
  def getWebAcl(args: GetWebAclArgs, opts: InvokeOptions): js.Promise[GetWebAclResult] with GetWebAclResult = js.native
}

