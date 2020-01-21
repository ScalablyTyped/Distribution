package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.getRestApiMod.GetRestApiArgs
import typings.pulumiAws.getRestApiMod.GetRestApiResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "getRestApi")
@js.native
object getRestApi extends js.Object {
  def apply(args: GetRestApiArgs): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def apply(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
}

