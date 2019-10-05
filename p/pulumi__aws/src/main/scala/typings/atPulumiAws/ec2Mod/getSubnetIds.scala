package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetSubnetIdsMod.GetSubnetIdsArgs
import typings.atPulumiAws.ec2GetSubnetIdsMod.GetSubnetIdsResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSubnetIds")
@js.native
object getSubnetIds extends js.Object {
  def apply(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
  def apply(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] with GetSubnetIdsResult = js.native
}

