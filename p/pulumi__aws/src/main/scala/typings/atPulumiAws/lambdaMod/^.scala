package typings.atPulumiAws.lambdaMod

import typings.atPulumiAws.lambdaGetFunctionMod.GetFunctionArgs
import typings.atPulumiAws.lambdaGetFunctionMod.GetFunctionResult
import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationArgs
import typings.atPulumiAws.lambdaGetInvocationMod.GetInvocationResult
import typings.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionArgs
import typings.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionResult
import typings.atPulumiAws.lambdaLambdaMixinsMod.EventHandler
import typings.atPulumiAws.lambdaRuntimesMod.Runtime
import typings.atPulumiPulumi.invokeMod.InvokeOptions
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CustomRuntime: Runtime = js.native
  var DotnetCore1d0Runtime: Runtime = js.native
  var DotnetCore2d0Runtime: Runtime = js.native
  var DotnetCore2d1Runtime: Runtime = js.native
  var Go1dxRuntime: Runtime = js.native
  var Java8Runtime: Runtime = js.native
  var NodeJS10dXRuntime: Runtime = js.native
  var NodeJS4d3EdgeRuntime: Runtime = js.native
  var NodeJS4d3Runtime: Runtime = js.native
  var NodeJS6d10Runtime: Runtime = js.native
  var NodeJS8d10Runtime: Runtime = js.native
  var NodeJSRuntime: Runtime = js.native
  var Python2d7Runtime: Runtime = js.native
  var Python3d6Runtime: Runtime = js.native
  var Python3d7Runtime: Runtime = js.native
  var Ruby2d5Runtime: Runtime = js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R]): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def createFunctionFromEventHandler[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typings.atPulumiAws.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def getFunction(args: GetFunctionArgs): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
  def getFunction(args: GetFunctionArgs, opts: InvokeOptions): js.Promise[GetFunctionResult] with GetFunctionResult = js.native
  def getInvocation(args: GetInvocationArgs): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
  def getInvocation(args: GetInvocationArgs, opts: InvokeOptions): js.Promise[GetInvocationResult] with GetInvocationResult = js.native
  def getLayerVersion(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
  def getLayerVersion(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ Boolean = js.native
}

