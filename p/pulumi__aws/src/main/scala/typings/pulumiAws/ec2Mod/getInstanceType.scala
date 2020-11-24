package typings.pulumiAws.ec2Mod

import typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeArgs
import typings.pulumiAws.getInstanceTypeMod.GetInstanceTypeResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getInstanceType")
@js.native
object getInstanceType extends js.Object {
  
  def apply(args: GetInstanceTypeArgs): js.Promise[GetInstanceTypeResult] = js.native
  def apply(args: GetInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeResult] = js.native
}
