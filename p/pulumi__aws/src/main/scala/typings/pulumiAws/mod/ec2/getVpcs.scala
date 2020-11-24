package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getVpcsMod.GetVpcsArgs
import typings.pulumiAws.getVpcsMod.GetVpcsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getVpcs")
@js.native
object getVpcs extends js.Object {
  
  def apply(): js.Promise[GetVpcsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
  def apply(args: GetVpcsArgs): js.Promise[GetVpcsResult] = js.native
  def apply(args: GetVpcsArgs, opts: InvokeOptions): js.Promise[GetVpcsResult] = js.native
}
