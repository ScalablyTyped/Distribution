package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getInstancesMod.GetInstancesArgs
import typings.pulumiAws.getInstancesMod.GetInstancesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getInstances")
@js.native
object getInstances extends js.Object {
  
  def apply(): js.Promise[GetInstancesResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
  def apply(args: GetInstancesArgs): js.Promise[GetInstancesResult] = js.native
  def apply(args: GetInstancesArgs, opts: InvokeOptions): js.Promise[GetInstancesResult] = js.native
}
