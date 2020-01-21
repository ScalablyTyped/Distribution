package typings.pulumiAws.mod.ec2

import typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointArgs
import typings.pulumiAws.getVpcEndpointMod.GetVpcEndpointResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getVpcEndpoint")
@js.native
object getVpcEndpoint extends js.Object {
  def apply(): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def apply(args: GetVpcEndpointArgs): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
  def apply(args: GetVpcEndpointArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointResult] with GetVpcEndpointResult = js.native
}

