package typings.atPulumiAws.apigatewayMod

import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiArgs
import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "getRestApi")
@js.native
object getRestApi extends js.Object {
  def apply(args: GetRestApiArgs): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def apply(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
}

