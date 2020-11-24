package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsArgs
import typings.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getSubnetIds")
@js.native
object getSubnetIds extends js.Object {
  
  def apply(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] = js.native
  def apply(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] = js.native
}
