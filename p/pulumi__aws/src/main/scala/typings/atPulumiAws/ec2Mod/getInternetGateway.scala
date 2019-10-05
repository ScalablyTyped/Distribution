package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetInternetGatewayMod.GetInternetGatewayArgs
import typings.atPulumiAws.ec2GetInternetGatewayMod.GetInternetGatewayResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getInternetGateway")
@js.native
object getInternetGateway extends js.Object {
  def apply(): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
  def apply(args: GetInternetGatewayArgs): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
  def apply(args: GetInternetGatewayArgs, opts: InvokeOptions): js.Promise[GetInternetGatewayResult] with GetInternetGatewayResult = js.native
}

