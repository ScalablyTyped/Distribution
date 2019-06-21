package typings
package atPulumiAwsLib.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var CustomRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore1d0Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore2d0Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var DotnetCore2d1Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Go1dxRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Java8Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS10dXRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS4d3EdgeRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS4d3Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS6d10Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJS8d10Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var NodeJSRuntime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Python2d7Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Python3d6Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Python3d7Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  var Ruby2d5Runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = js.native
  def createFunctionFromEventHandler[E, R](name: java.lang.String, handler: atPulumiAwsLib.lambdaLambdaMixinsMod.EventHandler[E, R]): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def createFunctionFromEventHandler[E, R](
    name: java.lang.String,
    handler: atPulumiAwsLib.lambdaLambdaMixinsMod.EventHandler[E, R],
    opts: atPulumiPulumiLib.resourceMod.ResourceOptions
  ): atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function = js.native
  def getFunction(args: atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionArgs): js.Promise[atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionResult] = js.native
  def getFunction(
    args: atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetFunctionMod.GetFunctionResult] = js.native
  def getInvocation(args: atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationArgs): js.Promise[atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationResult] = js.native
  def getInvocation(
    args: atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetInvocationMod.GetInvocationResult] = js.native
  def getLayerVersion(args: atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionArgs): js.Promise[atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionResult] = js.native
  def getLayerVersion(
    args: atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionArgs,
    opts: atPulumiPulumiLib.invokeMod.InvokeOptions
  ): js.Promise[atPulumiAwsLib.lambdaGetLayerVersionMod.GetLayerVersionResult] = js.native
  def isEventHandler(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/lambdaMixins.EventHandler<any, any> */ scala.Boolean = js.native
}

