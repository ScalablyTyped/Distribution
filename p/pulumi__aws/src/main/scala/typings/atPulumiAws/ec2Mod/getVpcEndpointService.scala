package typings.atPulumiAws.ec2Mod

import typings.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceArgs
import typings.atPulumiAws.ec2GetVpcEndpointServiceMod.GetVpcEndpointServiceResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getVpcEndpointService")
@js.native
object getVpcEndpointService extends js.Object {
  def apply(): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def apply(args: GetVpcEndpointServiceArgs): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
  def apply(args: GetVpcEndpointServiceArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] with GetVpcEndpointServiceResult = js.native
}

