package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupArgs
import typings.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getSecurityGroup")
@js.native
object getSecurityGroup extends js.Object {
  
  def apply(): js.Promise[GetSecurityGroupResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = js.native
  def apply(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] = js.native
  def apply(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] = js.native
}
