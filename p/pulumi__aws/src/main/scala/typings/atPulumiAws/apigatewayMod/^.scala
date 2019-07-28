package typings.atPulumiAws.apigatewayMod

import typings.atPulumiAws.apigatewayGetKeyMod.GetKeyArgs
import typings.atPulumiAws.apigatewayGetKeyMod.GetKeyResult
import typings.atPulumiAws.apigatewayGetResourceMod.GetResourceArgs
import typings.atPulumiAws.apigatewayGetResourceMod.GetResourceResult
import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiArgs
import typings.atPulumiAws.apigatewayGetRestApiMod.GetRestApiResult
import typings.atPulumiAws.apigatewayGetVpcLinkMod.GetVpcLinkArgs
import typings.atPulumiAws.apigatewayGetVpcLinkMod.GetVpcLinkResult
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getKey(args: GetKeyArgs): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getKey(args: GetKeyArgs, opts: InvokeOptions): js.Promise[GetKeyResult] with GetKeyResult = js.native
  def getResource(args: GetResourceArgs): js.Promise[GetResourceResult] with GetResourceResult = js.native
  def getResource(args: GetResourceArgs, opts: InvokeOptions): js.Promise[GetResourceResult] with GetResourceResult = js.native
  def getRestApi(args: GetRestApiArgs): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def getRestApi(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def getVpcLink(args: GetVpcLinkArgs): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
  def getVpcLink(args: GetVpcLinkArgs, opts: InvokeOptions): js.Promise[GetVpcLinkResult] with GetVpcLinkResult = js.native
}

