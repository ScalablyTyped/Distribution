package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsArgs
import typings.pulumiAws.getCoipPoolsMod.GetCoipPoolsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getCoipPools")
@js.native
object getCoipPools extends js.Object {
  
  def apply(): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: GetCoipPoolsArgs): js.Promise[GetCoipPoolsResult] = js.native
  def apply(args: GetCoipPoolsArgs, opts: InvokeOptions): js.Promise[GetCoipPoolsResult] = js.native
}
