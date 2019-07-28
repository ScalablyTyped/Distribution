package typings.atPulumiAws.directconnectMod

import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayArgs
import typings.atPulumiAws.directconnectGetGatewayMod.GetGatewayResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getGateway(args: GetGatewayArgs): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
  def getGateway(args: GetGatewayArgs, opts: InvokeOptions): js.Promise[GetGatewayResult] with GetGatewayResult = js.native
}

